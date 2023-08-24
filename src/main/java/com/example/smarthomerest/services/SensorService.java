package com.example.smarthomerest.services;

import com.example.smarthomerest.dto.SensorDto;
import com.example.smarthomerest.entities.SensorEntity;
import com.example.smarthomerest.repositories.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public SensorDto getSenzorById(int id) {
        Optional<SensorEntity> byId = sensorRepository.findById(id);
        SensorDto sensorDto = new SensorDto();
        if (byId.isPresent()){
            sensorDto.setId(byId.get().getId());
            sensorDto.setName(byId.get().getName());
            sensorDto.setValue(byId.get().getValue());
            sensorDto.setMotion(byId.get().getMotion());
            sensorDto.setLux(byId.get().getLux());
            sensorDto.setLastEdit(byId.get().getLastEdit());
            return sensorDto;
        }
        return null;
    }

    public SensorDto updateSenzor(SensorDto sensorDto) {
        SensorEntity sensorEntity = new SensorEntity();
        sensorEntity.setId(sensorDto.getId());
        sensorEntity.setName(sensorDto.getName());
        sensorEntity.setValue(sensorDto.getValue());
        sensorEntity.setMotion(sensorDto.getMotion());
        sensorEntity.setLux(sensorDto.getLux());
        sensorEntity.setLastEdit(sensorDto.getLastEdit());
        sensorRepository.save(sensorEntity);
        return sensorDto;
    }
}
