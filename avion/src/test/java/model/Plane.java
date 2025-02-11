package com.example.avion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity // Indica que esta clase es una entidad JPA y se mapeará a una tabla en la base de datos
public class Plane {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente el valor del ID
    private Long id; // Clave primaria de tipo Long

    private String model; // Modelo del avión

    // Constructor vacío (necesario para JPA)
    public Plane() {
    }

    // Constructor con parámetros
    public Plane(String model) {
        this.model = model;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}