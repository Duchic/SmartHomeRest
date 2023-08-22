package com.example.smarthomerest.repositories;

import com.example.smarthomerest.entities.SocketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface SocketRepository extends JpaRepository<SocketEntity, Integer> {
}
