package com.example.avion;

import com.example.avion.model.Plane;
import com.example.avion.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/planes") // Ruta base para todos los endpoints en este controlador
public class PlaneController {

    @Autowired
    private PlaneRepository planeRepository;

    // Endpoint para obtener todos los aviones
    @GetMapping
    public List<Plane> getAllPlanes() {
        return planeRepository.findAll();
    }
}
