package com.example.avion.repository;

import com.example.avion.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlaneRepository extends JpaRepository<Plane, String>{
}
