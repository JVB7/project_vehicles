package com.vehicles.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vehicles.model.enums.Fuel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehiclesRequest {
	
	@NotBlank
	@JsonProperty("model")
	public String model;
	
	@NotBlank
	@JsonProperty("board")
	public String board;
	
	@NotBlank
	@JsonProperty("color")
	public String color;
	
	@NotNull
	@JsonProperty("year")
	public Integer year;
	
	@NotNull
	@JsonProperty("fuel")
	public Fuel fuel;

}
