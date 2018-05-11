package BO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import HibernateUtil.HibernateUtil;
import entity.Libro;





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
		Query <Libro>hqlQuery = session.createQuery("FROM  Libro");			
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
	
	public Libro recuperarLibro(Libro libro) {
		int id = libro.getId_Libro();
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Libro WHERE id_Libro = (:condicion)";
		Query <Libro>hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", id);
		Libro l = hqlQuery.uniqueResult();
		session.close();
		return l ;
	}

}
