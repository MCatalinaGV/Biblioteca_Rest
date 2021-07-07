package com.edutecno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.edutecno.controlador.LibroController;
import com.edutecno.repositorio.LibroRepositorio;
import com.edutecno.servicio.LibroServicio;
import com.edutecno.servicio.LibroServicioImpl;

@SpringBootApplication
public class BibliotecaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaRestApplication.class, args);
		
	}

}
