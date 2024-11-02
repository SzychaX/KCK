package com.example.CarCatalog.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String version;
    private int year;
    private int power;
    private double mileage;
    private String color;
    private double price;
}
