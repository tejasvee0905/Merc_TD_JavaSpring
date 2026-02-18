package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity

public class Laptop1 {
    @Id //makes the attribute(next) as the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String brand;
    private int price;
    private int RAM;
}
