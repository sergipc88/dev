package com.SergiCesfHibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateUtil.HibernateUtil;
import com.entity.Alumno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Alumno alumno = new Alumno();
		
		alumno.setNombre("Sergi");
		alumno.setEdad(30);
				
		session.save(alumno);
		transaction.commit();
		session.close();
		HibernateUtil.shutdown();
		
		
	}

}
