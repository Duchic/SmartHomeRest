package com.example.smarthomerest.controllers;

import com.example.smarthomerest.dto.SensorDto;
import com.example.smarthomerest.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SensorController {

    private final SensorService sensorService;

    @Autowired
    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @GetMapping("/senzors")
    public List<SensorDto> getAll() {
        return sensorService.getAllRecord();
    }

    @GetMapping("/senzor/get/{id}") //dodelat servisu
    public SensorDto getSenzor(@PathVariable int id) {
        return sensorService.getSenzorById(id);
    }

    @PostMapping("/senzor/update/{id}") //dodelat servisu
    public SensorDto updateSenzor(@PathVariable int id, @RequestBody SensorDto sensorDto) {
        return sensorService.updateSenzor(sensorDto);
    }

}
