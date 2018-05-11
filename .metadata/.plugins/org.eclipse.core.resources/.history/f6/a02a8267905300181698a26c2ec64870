package com.LibroEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Libro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Para generar números autoincrementados
	private int id_Libro;
	private String titulo;
	private int precio;
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libro(String titulo, int precio) {
		super();
		this.titulo = titulo;
		this.precio = precio;
	}

	public int getId_Libro() {
		return id_Libro;
	}

	public void setId_Libro(int id_Libro) {
		this.id_Libro = id_Libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	
	
	
	
}
