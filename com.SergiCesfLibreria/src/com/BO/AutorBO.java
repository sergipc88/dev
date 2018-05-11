package com.BO;


import org.hibernate.Session;
import org.hibernate.Transaction;
import com.HibernateUtil.HibernateUtil;
import com.entity.Autor;
import com.entity.Libro;

public class AutorBO {

	public void alta(String nombre, String titulo, String titulo2, String titulo3) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Autor a = new Autor();
		a.setNombre(nombre);
		Libro libro1 = new Libro(titulo, a);
		Libro libro2 = new Libro(titulo2, a);
		Libro libro3 = new Libro(titulo3, a);
		Libro libro4 = new Libro("titulo1", a);
		Libro libro5 = new Libro("titulo1", a);
		a.getLibros().add(libro1);
		a.getLibros().add(libro2);
		a.getLibros().add(libro3);
		a.getLibros().add(libro4);
		a.getLibros().add(libro5);
		session.save(a);
		transaction.commit();
		session.close();
		
	//	return id;
	}
}