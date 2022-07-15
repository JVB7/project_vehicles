package com.vehicles.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicles.request.VehiclesRequest;
import com.vehicles.response.VehiclesResponse;
import com.vehicles.service.VehiclesService;

@RestController
@RequestMapping("/vehicles")
public class VehiclesController {
	
	@Autowired
	private VehiclesService service;
	
	@PostMapping
	public ResponseEntity<VehiclesResponse> create(@RequestBody @Valid VehiclesRequest request) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(request));
		
	}
	
	@GetMapping
	public ResponseEntity<List<VehiclesResponse>> getLisVehicles(){
		
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VehiclesResponse> getVehicles(@PathVariable Long id) {
		
		return ResponseEntity.ok(service.findById(id));
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<VehiclesResponse> update(@PathVariable Long id, @RequestBody @Valid VehiclesRequest request) {
		
		return ResponseEntity.ok(service.update(id, request));
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<VehiclesResponse> delete(@PathVariable Long id) {
		
		service.delete(id);
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
	}
	

}
