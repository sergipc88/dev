package com.SergiCesfExamen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LibroBO {

	public boolean insert(String a, String b, int c) {
		String bd = checking(b);//este metodo cumple 2 funciones, comprabar si existe el isbn en la bbdd y de vuelve el nombre
		boolean bok = true;
		Connection conn;
		if (bd == null) {
			bok = false;
			try {
				conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement("INSERT INTO libros VALUES (?,?,?)");
				pstmt.setString(1, a);
				pstmt.setString(2, b);
				pstmt.setInt(3, c);
				pstmt.execute();
				pstmt.close();
				conn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return bok;
	}

	public void remove(String del) {
		Connection conn;
		try {
			conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement("DELETE FROM libros  WHERE isbn=(?)");
			pstmt.setString(1, del);
			pstmt.execute();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(String isbn, String newTittle) throws LasOEstanProhibidasException {
		String titulo = checking(isbn);//este metodo cumple 2 funciones, comprabar si existe el isbn en la bbdd y de vuelve el nombre
		if(titulo.indexOf('o')==-1) {//el if comprueba si  contiene alguna o.
			Connection conn;
			try {
				conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement("UPDATE libros SET titulo=? WHERE isbn=?");
				pstmt.setString(1, newTittle);
				pstmt.setString(2, isbn);
				pstmt.execute();
				pstmt.close();
				conn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			throw new LasOEstanProhibidasException();
		}
	}

	public List<Libro> list(int minPrice) {
		Connection conn;
		List<Libro> lib = new ArrayList<>();
		try {
			conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM libros Where precio > ? ");
			pstmt.setInt(1, minPrice);
			ResultSet res = pstmt.executeQuery();
			
			while (res.next()) {
				Libro libro = new Libro();
				libro.setTitulo(res.getString("titulo"));
				libro.setIsbn(res.getString("isbn"));
				libro.setPrecio(res.getInt("precio"));
				lib.add(libro);
//				if (libro.getPrecio() > minPrice) {
//					lib.add(libro);
//				}
			}
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lib;
	}

	private String checking(String isbn) {
		String titulo = null;
		Connection conn;
		try {
			conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM libros where isbn = ?");
			pstmt.setString(1, isbn);
			ResultSet libros = pstmt.executeQuery();
			
			while (libros.next()) {
				titulo =libros.getString("titulo");
			}
			
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return titulo;
	}

	public Connection getConnection() throws ClassNotFoundException {

		// Aqu� viene el c�digo que falta
		Connection databaseConnection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Define the data source for the driver
			String sourceURL = "jdbc:mysql://localhost/biblioteca";
			// Create a connection through the DriverManager
			databaseConnection = DriverManager.getConnection(sourceURL, "root", "");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return databaseConnection;
	}

}