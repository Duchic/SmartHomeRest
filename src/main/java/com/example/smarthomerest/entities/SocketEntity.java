package com.example.smarthomerest.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "socket")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocketEntity {

    public SocketEntity(String name, String value, LocalDateTime lastEdit) {
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
