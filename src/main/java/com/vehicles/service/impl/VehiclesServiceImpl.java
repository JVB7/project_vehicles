package com.vehicles.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.vehicles.exception.BaseException;
import com.vehicles.mapper.VehiclesMapper;
import com.vehicles.model.Vehicles;
import com.vehicles.repository.VehiclesRespository;
import com.vehicles.request.VehiclesRequest;
import com.vehicles.response.VehiclesResponse;
import com.vehicles.service.VehiclesService;

@Service
public class VehiclesServiceImpl implements VehiclesService{
	
	@Autowired
	public VehiclesMapper mapper;
	
	@Autowired
	public VehiclesRespository repository;

	@Override
	@Transactional
	public VehiclesResponse create(VehiclesRequest request) {
		
		Vehicles model = new Vehicles();
		model = mapper.create(request);
		model = repository.save(model);
		
		return mapper.response(model);
	}

	@Override
	public List<VehiclesResponse> findAll() {
	
		List<Vehicles> models = repository.findAll();
		
		return mapper.response(models);
	}

	@Override
	public VehiclesResponse findById(Long id) {
		
		return existsVehicles(id).map(mapper :: response).orElseThrow();
	}
	
	@Override
	@Transactional
	public VehiclesResponse update(Long id, VehiclesRequest request) {
		
		Vehicles model = repository.save(existsVehicles(id).map(v -> mapper.update(request, v)).orElse(null));
		
		model = repository.save(model);
		
		return mapper.response(model);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
			
		repository.delete(existsVehicles(id).get());
	}
	
	private Optional<Vehicles> existsVehicles(Long id) {
		
		Optional<Vehicles> optional = repository.findById(id);
		
		if(optional.isEmpty()) {
			throw new BaseException(HttpStatus.NOT_FOUND, String.format("Veiculo id: %d, não foi encontrado", id));
		}
		
		return optional;
	}

}
