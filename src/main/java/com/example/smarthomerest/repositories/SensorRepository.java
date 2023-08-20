package com.example.smarthomerest.repositories;

import com.example.smarthomerest.entities.SensorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<SensorEntity, Integer> {
}
