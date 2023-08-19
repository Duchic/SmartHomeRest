package com.example.smarthomerest.repositories;

import com.example.smarthomerest.entities.SenzorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenzorRepository extends JpaRepository<SenzorEntity, Integer> {
}
