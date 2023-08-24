package com.example.smarthomerest.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "senzor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SensorEntity {

    public SensorEntity(String name, String value, String motion, int lux, LocalDateTime lastEdit){
        this.name = name;
        this.value = value;
        this.motion = motion;
        this.lux = lux;
        this.lastEdit = lastEdit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String value;

    private String motion;

    private int lux;

    private LocalDateTime lastEdit;
}
