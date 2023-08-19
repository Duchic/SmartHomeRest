package com.example.smarthomerest.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SenzorDto {

    private int id;

    private String name;

    private String value;

    private LocalDateTime lastEdit;
}
