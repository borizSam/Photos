package com.example.avion.repository;

import com.example.avion.model.Aeroport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que esta interfaz es un componente de repositorio
public interface AeroportRepository extends JpaRepository<Aeroport, Long> {
    // No necesitas agregar métodos adicionales a menos que los requieras
}