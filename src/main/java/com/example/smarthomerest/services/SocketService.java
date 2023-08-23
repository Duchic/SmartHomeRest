package com.example.smarthomerest.services;

import com.example.smarthomerest.dto.SensorDto;
import com.example.smarthomerest.dto.SocketDto;
import com.example.smarthomerest.entities.SocketEntity;
import com.example.smarthomerest.repositories.SocketRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SocketService {

    private final SocketRepository socketRepository;

    public SocketService(SocketRepository socketRepository){
        this.socketRepository = socketRepository;
    }
    public List<SocketDto> getAllRecord() {
        List<SocketEntity> allRecord = socketRepository.findAll();
        List<SocketDto> dtoList = new ArrayList<>();
        return dtoList;
    }

    public SocketDto getSocketById(int id){
        Optional<SocketEntity> byId = socketRepository.findById(id);
        SocketDto socketDto = new SocketDto();
        if (byId.isPresent()){
            socketDto.setId(byId.get().getId());
            socketDto.setName(byId.get().getName());
            socketDto.setValue(byId.get().getValue());
            socketDto.setLastEdit(byId.get().getLastEdit());
            return socketDto;
        }
        return null;
    }


    public SocketDto updateSocket(SocketDto socketDto) {
        SocketEntity socketEntity = new SocketEntity();
        socketEntity.setId(socketDto.getId());
        socketEntity.setName(socketDto.getName());
        socketEntity.setValue(socketDto.getValue());
        socketEntity.setLastEdit(socketDto.getLastEdit());
        socketRepository.save(socketEntity);
        return socketDto;
    }
}
