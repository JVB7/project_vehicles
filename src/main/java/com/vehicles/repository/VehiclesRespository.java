package com.vehicles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicles.model.Vehicles;

@Repository
public interface VehiclesRespository extends JpaRepository<Vehicles, Long> {

}
