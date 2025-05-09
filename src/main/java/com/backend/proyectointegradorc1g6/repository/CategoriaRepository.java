package com.backend.proyectointegradorc1g6.repository;

import com.backend.proyectointegradorc1g6.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    //Categoria findByNombre(String nombre);
    Optional<Categoria> findByNombre(String nombre);
    List<Categoria> findAllByNombre(String nombre);

}
