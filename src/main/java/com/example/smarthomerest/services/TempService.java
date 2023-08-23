package com.example.smarthomerest.services;

import com.example.smarthomerest.dto.TempDto;
import com.example.smarthomerest.entities.TempEntity;
import com.example.smarthomerest.repositories.TempRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TempService {

    private final TempRepository tempRepository;

    public TempService(TempRepository tempRepository){
        this.tempRepository = tempRepository;
    }

    public List<TempDto> getAllRecord() {
        List<TempEntity> allRecord = tempRepository.findAll();
        List<TempDto> dtoList = new ArrayList<>();
        return dtoList;
    }

    public TempDto getTempById(int id){
        Optional<TempEntity> byId = tempRepository.findById(id);
        TempDto tempDto = new TempDto();
        if (byId.isPresent()){
            tempDto.setId(byId.get().getId());
            tempDto.setName(byId.get().getName());
            tempDto.setValueTemp(byId.get().getValueTemp());
            tempDto.setValueHumidity(byId.get().getValueHumidity());
            tempDto.setLastEdit(byId.get().getLastEdit());
            return tempDto;
        }
        return null;
    }

    public TempDto updateTemp(TempDto tempDto){
        TempEntity tempEntity = new TempEntity();
        tempEntity.setId(tempDto.getId());
        tempEntity.setName(tempDto.getName());
        tempEntity.setValueTemp(tempDto.getValueTemp());
        tempEntity.setValueHumidity(tempDto.getValueHumidity());
        tempEntity.setLastEdit(tempDto.getLastEdit());
        tempRepository.save(tempEntity);
        return tempDto;
    }
}
