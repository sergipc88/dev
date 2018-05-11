package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Libro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Para generar n�meros autoincrementados
	private int id_Libro;
	private String titulo;
	private String isbn;
	@ManyToOne
	Autor autor;
		
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
		
	public Libro(int id_Libro, String titulo, String isbn, Autor autor) {
		super();
		this.id_Libro = id_Libro;
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
		
}