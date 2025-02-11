package com.example.avion.controller;

import com.example.avion.model.Aeroport;
import com.example.avion.repository.AeroportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que esta clase es un controlador REST
@RequestMapping("/aeroports") // Ruta base para todos los endpoints en este controlador
public class AeroportController {

    @Autowired
    private AeroportRepository aeroportRepository;

    // Endpoint para obtener todos los aeropuertos
    @GetMapping
    public List<Aeroport> getAllAeroports() {
        return aeroportRepository.findAll();
    }

}
