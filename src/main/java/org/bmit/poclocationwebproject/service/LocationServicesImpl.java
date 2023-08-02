package org.bmit.poclocationwebproject.service;

import java.util.List;

import org.bmit.poclocationwebproject.dal.entites.Location;
import org.bmit.poclocationwebproject.dal.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServicesImpl implements LocationServices {
	
	@Autowired
	private LocationRepository repo;

	@Override
	public Location saveLocation(Location location) {
		return repo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repo.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repo.delete(location);
	}

	@Override
	public Location getLocationByPincode(int pincode) {
		return repo.findById(pincode).get();
	}

	@Override
	public List<Location> getAllLocations() {
		return repo.findAll();
	}

}
