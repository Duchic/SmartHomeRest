package com.example.smarthomerest.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "temp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TempEntity {

    public TempEntity(String name, double valueTemp, double valueHumidity, LocalDateTime lastEdit){
        this.name = name;
        this.valueTemp = valueTemp;
        this.valueHumidity = valueHumidity;
        this.lastEdit = lastEdit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private double valueTemp;

    private double valueHumidity;

    private LocalDateTime lastEdit;
}
