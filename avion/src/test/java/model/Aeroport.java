package com.example.avion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity // Indica que esta clase es una entidad JPA y se mapeará a una tabla en la base de datos
public class Aeroport {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente el valor del ID
    private Long id;

    private String name; // Nombre del aeropuerto
    private String city; // Ciudad donde se encuentra el aeropuerto
    private String country; // País del aeropuerto

    // Constructor vacío (necesario para JPA)
    public Aeroport() {
    }

    // Constructor con parámetros
    public Aeroport(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}º