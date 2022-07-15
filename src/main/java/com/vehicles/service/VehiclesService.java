package com.vehicles.service;

import java.util.List;

import com.vehicles.request.VehiclesRequest;
import com.vehicles.response.VehiclesResponse;

public interface VehiclesService {
	
	VehiclesResponse create(VehiclesRequest request);
	List<VehiclesResponse> findAll();
	VehiclesResponse findById(Long id);
	VehiclesResponse update(Long id, VehiclesRequest request);
	void delete(Long id);

}
