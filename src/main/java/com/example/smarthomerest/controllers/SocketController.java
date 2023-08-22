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
