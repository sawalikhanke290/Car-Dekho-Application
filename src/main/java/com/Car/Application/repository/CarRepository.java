package com.Car.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Car.Application.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
	Car findCarByBrand(String brand);
}
