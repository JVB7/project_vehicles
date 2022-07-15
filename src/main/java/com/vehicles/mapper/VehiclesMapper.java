package com.vehicles.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.vehicles.model.Vehicles;
import com.vehicles.request.VehiclesRequest;
import com.vehicles.response.VehiclesResponse;

@Component
public class VehiclesMapper {
	
	public Vehicles create(VehiclesRequest request) {
		
		Vehicles model = new Vehicles();
		
		model.model = request.model;
		model.board = request.board;
		model.color = request.color;
		model.year = request.year;
		model.fuel = request.fuel;
			
		return model;
	}
	
	public VehiclesResponse response(Vehicles model) {
		
		VehiclesResponse response = new VehiclesResponse();
		
		response.id = model.id;
		response.model = model.model;
		response.board = model.board;
		response.color = model.color;
		response.year = model.year;
		response.fuel = model.fuel;
			
		return response;
	}

	public List<VehiclesResponse> response(List<Vehicles> models) {
		return models.stream().map(v -> response(v)).collect(Collectors.toList());
	}
	
	public Vehicles update(VehiclesRequest request, Vehicles model) {
	
		model.model = request.model;
		model.board = request.board;
		model.color = request.color;
		model.year = request.year;
		model.fuel = request.fuel;
		
		return model;
	}
	
}
