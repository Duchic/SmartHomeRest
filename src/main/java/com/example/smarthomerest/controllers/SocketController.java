package com.example.smarthomerest.controllers;

import com.example.smarthomerest.dto.SensorDto;
import com.example.smarthomerest.dto.SocketDto;
import com.example.smarthomerest.services.SensorService;
import com.example.smarthomerest.services.SocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SocketController {
    //id 0 = lamp
    //id 1 = led strip
    //id 2 = heat bathroom
    //id 3 = big charger
    //id 4 = led table
    //id 5 = bed charger
    //id 6 = guitar
    //id 7 = shoe dryer
    //id 8 = 3 table
    //id 9 = 4 table - warmer
    //id 10 = USB
    //id 11 = PC
    private final SocketService socketService;

    @Autowired
    public SocketController(SocketService socketService){
        this.socketService = socketService;
    }

    @GetMapping("/sockets")
    public List<SocketDto> getAll(){
        return socketService.getAllRecord();
    }

    @GetMapping("/socket/get/{id}")
    public SocketDto getSocket(@PathVariable int id){
        return socketService.getSocketById(id);
    }

    @PostMapping("/socket/update/{id}")
    public SocketDto updateSocket(@PathVariable int id, @RequestBody SocketDto socketDto){
        return socketService.updateSocket(socketDto);
    }

}
