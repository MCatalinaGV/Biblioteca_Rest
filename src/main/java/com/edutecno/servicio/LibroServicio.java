package com.edutecno.servicio;

import java.util.List;


import com.edutecno.modelo.Libro;

//INTERFACE SERVICIO
public interface LibroServicio {

	public List<Libro> listar();
	public void agregar(Libro libro);
	public void eliminar(Integer id);
	public void modificar(Libro libro);
}
