package com.SergiCesfLibreria;

import java.util.Iterator;
import java.util.List;

//import com.BO.AutorBO;
import com.BO.LibroBO;
import com.entity.Libro;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		// TODO Auto-generated method stub
//		AutorBO abo = new AutorBO();
//		LibroBO lbo = new LibroBO();
//		String nombre = "Menganesimo";
//		String titulo = "frasco";
//		String titulo2 = "equilatero";
//		String titulo3 = "preasuncion";
//		
//		abo.alta(nombre, titulo, titulo2, titulo3);
		System.out.println("consulta especifica...");
		System.out.println(" ");
		main.consultar();
		System.out.println(" ");
		System.out.println("consulta ordenada...");
		main.consultaOrdenada();
	}
	
	
	void consultar() {
		LibroBO lbo = new LibroBO();
		
		List <Libro> lista = lbo.select();
		
		Iterator<Libro> it = lista.iterator();
				
		while(it.hasNext()) {
			Libro lib = it.next();
			
			System.out.println(lib.getTitulo() + " "+lib.getAutor().getNombre());
		}
	}
	
	
	void consultaOrdenada() {
	LibroBO lbo = new LibroBO();
		
		List <Libro> lista = lbo.orderSelect();
		
		Iterator<Libro> it = lista.iterator();
				
		while(it.hasNext()) {
			Libro lib = it.next();
			
			System.out.println(lib.getTitulo() + " "+lib.getAutor().getNombre());
		}
		
		
		
	}

}
