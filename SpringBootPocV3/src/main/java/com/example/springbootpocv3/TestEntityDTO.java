package com.example.springbootpocv3;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name="test_entity")
@Getter
@Setter
public class TestEntityDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
}
