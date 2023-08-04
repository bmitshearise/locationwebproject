package org.bmit.poclocationwebproject.service;

import java.util.List;

import org.bmit.poclocationwebproject.dal.entites.Location;

public interface LocationServices {
	
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationByPincode(int pincode);
	List<Location> getAllLocations();

}
