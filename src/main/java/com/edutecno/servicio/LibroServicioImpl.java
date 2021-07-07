package com.edutecno.servicio;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.edutecno.modelo.Libro;
import com.edutecno.repositorio.LibroRepositorio;


@Service
public class LibroServicioImpl implements LibroServicio{

	
	@Autowired
	LibroRepositorio repositorio;
	
	
	
	@Override
	public List<Libro> listar() {
		
		  return repositorio.findAll();
	}

	
	@Override
	public void agregar(Libro libro) {
		repositorio.save(libro);
		
	}

	
	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
		
	}

	
	@Override
	public void modificar(Libro libro) {
		int id = libro.getId();
		if(repositorio.findById(id).isPresent()){
			repositorio.save(libro);
		}
		
	}
	



}
