package com.example.smarthomerest.repositories;

import com.example.smarthomerest.entities.TempEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempRepository extends JpaRepository<TempEntity, Integer> {
}
