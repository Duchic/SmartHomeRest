package com.example.smarthomerest.services;

import com.example.smarthomerest.dto.SensorDto;
import com.example.smarthomerest.entities.SensorEntity;
import com.example.smarthomerest.repositories.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public List<SensorDto> getAllRecord() {
        List<SensorEntity> allRecord = sensorRepository.findAll();
        List<SensorDto> dtoList = new ArrayList<>();
        return dtoList;
    }
}
