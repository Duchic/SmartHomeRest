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
public class SenzorEntity {

    public SenzorEntity(String name, String value, LocalDateTime lastEdit){
        this.name = name;
        this.value = value;
        this.lastEdit = lastEdit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String value;

    private LocalDateTime lastEdit;
}
