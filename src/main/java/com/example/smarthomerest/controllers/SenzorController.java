package com.example.smarthomerest.controllers;

import com.example.smarthomerest.dto.SenzorDto;
import com.example.smarthomerest.services.SenzorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SenzorController {

    private final SenzorService senzorService;

    @Autowired
    public SenzorController(SenzorService senzorService) {
        this.senzorService = senzorService;
    }

    @GetMapping("/senzors")
    public List<SenzorDto> getAll() {
        return senzorService.getAllRecord();
    }
}
