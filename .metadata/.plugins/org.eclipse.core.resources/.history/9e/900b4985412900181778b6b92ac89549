package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Libro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Para generar números autoincrementados
	private int id_Libro;
	private String titulo;
	@ManyToOne
	Autor autor;
	
	
	
	
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Libro(String titulo, Autor autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
