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
    //id 2 = led table
    //id 3 = charger
    //id 4 = 3 table
    //id 5 = 4 table
    //id 6 = USB
    //id 7 = PC
    //id 8 = guitar
    //id 9 = shoe dryer
    //id 10 = heat bathroom
    //id 11 = bed charger
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
