package com.SergiCesfExamen;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

	private static Scanner lector;

	public static void main(String[] args) {
		Main main = new Main();
		// TODO Auto-generated method stub

		lector = new Scanner(System.in);
		boolean serverON = true;
		int opt;
		
		System.out.println("Servidor iniciado...");
		while (serverON) {
			System.out.println("elija una opcion: ");
			System.out.println("1.alta");
			System.out.println("2.baja");
			System.out.println("3.modificacion");
			System.out.println("4.consulta");
			System.out.println("5.salir");
			opt = lector.nextInt();

			serverON = main.options(opt);

		}

	}

	public boolean options(int op) {
		// LibroBO bd = new LibroBO();
		// String titulo;
		// String isbn;
		// int precio;
		// //String tituloNuevo;
		 boolean bok = true;

		switch (op) {

		case 1:// alta
			insercion();
			break;
		case 2:// baja
			confirmRemove();
			break;
		case 3:// modificacion
			modificar();
			break;
		case 4:// consulta
			consultar();
			break;
		case 5:
			bok = false;

		default:
			break;
		}
		return bok;
	}

	public void insercion() {// metodo que gestiona la vista de la opcion de hacer un alta
		LibroBO bd = new LibroBO();
		String titulo;
		String isbn;
		int precio;
		// String tituloNuevo;
		boolean bok;

		System.out.println("insertar libro ...");

		System.out.println("introduce el titulo");
		titulo = lector.next();

		System.out.println("introduce el isbn");
		isbn = lector.next();

		System.out.println("introduce el precio");
		precio = lector.nextInt();

		System.out.println("insertando ...");

		// esta funcion hace la insercion, devuelve true o false dependiendo si se ha
		// podido hacer la insercion o no
		bok = bd.insert(titulo, isbn, precio);

		if (bok == false) {
			System.out.println("insertado con exito");
		} else {
			System.out.println("error este invitado ya existe");
		}

	}

	public void confirmRemove() {// metodo que gestiona la vista de opcion de la opcion de eliminar, pide confirmacion antes de
									// llevarla a cabo
		LibroBO bd = new LibroBO();
		String isbn;
		boolean confirm = true;

		while (confirm) {

			System.out.println("introduce el ISBN del libro a eliminar");
			isbn = lector.next();
			System.out.println("seguro que quieres eliminarlo?");
			System.out.println("si (s), no(n)");
			String respuesta = lector.next();

			if (respuesta.equals("s")) {
				bd.remove(isbn);
				System.out.println("eliminado con exito!!");
				confirm = false;
			} else {
				confirm = false;
			}
		}
	}

	public void consultar() {// metodo que gestiona la vista de la opcion de la consulta
		LibroBO bd = new LibroBO();
		int precio;
		System.out.println("a partir de que precio quieres consultar los libros?");
		precio = lector.nextInt();

		List<Libro> listado = bd.list(precio);
		Iterator<Libro> it = listado.iterator();

		while (it.hasNext()) {
			Libro libro = it.next();
			System.out.println(libro.getTitulo() + " " + libro.getIsbn() + " " + libro.getPrecio());
		}

	}

	public void modificar() {// metodo que gestiona la vista de la opcion de la modificacion
		LibroBO bd = new LibroBO();
		String isbn;
		String tituloNuevo;
		
		System.out.println("inserta el isbn del libro a modificar");
		isbn = lector.next();
		System.out.println("Inserta el titulo nuevo");
		tituloNuevo = lector.next();
		
		try {
			bd.update(isbn, tituloNuevo);
		} catch (LasOEstanProhibidasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
