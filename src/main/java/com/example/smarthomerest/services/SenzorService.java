package com.example.smarthomerest.services;

import com.example.smarthomerest.dto.SenzorDto;
import com.example.smarthomerest.entities.SenzorEntity;
import com.example.smarthomerest.repositories.SenzorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SenzorService {

    private final SenzorRepository senzorRepository;

    public SenzorService(SenzorRepository senzorRepository) {
        this.senzorRepository = senzorRepository;
    }

    public List<SenzorDto> getAllRecord() {
        List<SenzorEntity> allRecord = senzorRepository.findAll();
        List<SenzorDto> dtoList = new ArrayList<>();
        return dtoList;
    }
}
