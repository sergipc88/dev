package com.LibroBO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.HibernateUtil.HibernateUtil;
import com.LibroEntity.Libro;


public class LibroBO {
	
	
	public void alta(Libro lib) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		session.save(lib);
		transaction.commit();
		session.close();
		
		
	}
	
	public  List <Libro> selection(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Query hqlQuery = session.createQuery("FROM  Libro");			
		List<Libro> list = hqlQuery.getResultList();	
		return list;
	}
	
	
	public void update(Libro l) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		session.update(l);
		transaction.commit();
		session.close();		
	}
	
	public void delete(Libro l) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		session.remove(l);
		transaction.commit();
		session.close();		
	}
	
	

}