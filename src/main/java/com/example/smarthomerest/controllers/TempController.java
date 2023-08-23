package com.example.smarthomerest.controllers;

import com.example.smarthomerest.dto.TempDto;
import com.example.smarthomerest.entities.TempEntity;
import com.example.smarthomerest.services.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TempController {

    private final TempService tempService;

    @Autowired
    public TempController(TempService tempService){
        this.tempService = tempService;
    }

    @GetMapping("/temps")
    public List<TempDto> getAll(){
        return tempService.getAllRecord();
    }

    @GetMapping("/temp/get/{id}")
    public TempDto getTemp(@PathVariable int id){
        return tempService.getTempById(id);
    }

    @PostMapping("/temp/update/{id}")
    public TempDto updateTemp(@PathVariable int id, @RequestBody TempDto tempDto){
        return tempService.updateTemp(tempDto);
    }
}
