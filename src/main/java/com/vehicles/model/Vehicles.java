package com.vehicles.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vehicles.model.enums.Fuel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="veiculos")
public class Vehicles {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
	public Long id;
	
	@Column(name = "modelo", nullable=false)
	public String model;
	
	@Column(name = "placa", nullable=false)
	public String board;
	
	@Column(name = "cor", nullable=false)
	public String color;
	
	@Column(name = "ano", nullable=false)
	public Integer year;
	
	@Column(name = "combustivel", nullable=false)
	@Enumerated(EnumType.STRING)
	public Fuel fuel; 

}
