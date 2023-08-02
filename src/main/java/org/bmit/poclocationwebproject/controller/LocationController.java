package org.bmit.poclocationwebproject.controller;

import java.util.List;

import org.bmit.poclocationwebproject.dal.entites.Location;
import org.bmit.poclocationwebproject.service.LocationServices;
import org.bmit.poclocationwebproject.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LocationController {
	
	@Autowired
	private LocationServices service;
	
	@Autowired
	private EmailUtil emailUtil;
	
	@RequestMapping("/showcreate")
	public String showCreate() {
		return "createlocation";
	}
	
	@RequestMapping("/saveloc")
	public String saveLocation(@ModelAttribute("location")Location location,ModelMap modelMap) {
		Location l = service.saveLocation(location);
		String msg = "Location saved with pin: "+l.getPincode();
		modelMap.addAttribute("msg", msg);
		emailUtil.sendEmail("bmitshearise@gmail.com", "Record Inserted!", "Location was sucessfully added");
		return "createlocation";
	}
	
	@RequestMapping("/displaylocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displaylocations";
	}
	
	@RequestMapping("/deletelocation")
	public String deleteLocation(@RequestParam("pincode") int pincode, ModelMap modelMap) {
		Location location = service.getLocationByPincode(pincode);
		service.deleteLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displaylocations";		
	}
	
	@RequestMapping("/updatelocation")
	public String updateLocation(@RequestParam("pincode") int pincode, ModelMap modelMap) {
		Location location = service.getLocationByPincode(pincode);
		modelMap.addAttribute("location", location);
		return "updatelocation";
	}
	
	@RequestMapping("/updateloc")
	public String update(@ModelAttribute("location") Location location,ModelMap modelMap) {
		service.updateLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displaylocations";
	}

}
