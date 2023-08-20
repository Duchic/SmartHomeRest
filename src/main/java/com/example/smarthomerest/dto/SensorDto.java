package com.example.smarthomerest.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SensorDto {

    private int id;

    private String name;

    private String value;

    private LocalDateTime lastEdit;
}
