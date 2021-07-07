package com.edutecno.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String titulo;
	String autor;
	int anio;
	boolean disponible;
	

}
