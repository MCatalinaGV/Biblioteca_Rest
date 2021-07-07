package com.edutecno.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutecno.modelo.Libro;


public interface LibroRepositorio extends JpaRepository<Libro, Integer> {

}
