package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Autor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Para generar n�meros autoincrementados
	int id_Autor;
	String nombre;
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER) //eager = carga ansiosa
	List<Libro> libros = new ArrayList<>();
		

	
	
	
	
	public int getId_Autor() {
		return id_Autor;
	}
	public void setId_Autor(int id_Autor) {
		this.id_Autor = id_Autor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	
	
}
