package com.example.smarthomerest.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TempDto {

    private int id;

    private String name;

    private double valueTemp;

    private double valueHumidity;

    private LocalDateTime lastEdit;
}
