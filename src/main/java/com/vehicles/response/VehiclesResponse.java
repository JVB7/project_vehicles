package com.vehicles.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vehicles.model.enums.Fuel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VehiclesResponse {
	
	@JsonProperty("id")
	public Long id;
	
	@JsonProperty("model")
	public String model;
	
	@JsonProperty("board")
	public String board;
	
	@JsonProperty("color")
	public String color;
	
	@JsonProperty("year")
	public Integer year;
	
	@JsonProperty("fuel")
	public Fuel fuel; 

}
