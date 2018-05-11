package com.BO;



import java.util.List;

//import javax.persistence.TypedQuery;
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Root;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.Session;

import com.HibernateUtil.HibernateUtil;
import com.entity.Libro;

public class LibroBO {
	
public  Libro select(String isbn) {
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Libro> hqlQuery = session.createQuery("FROM Libro  WHERE isbn = ?");
		hqlQuery.setParameter(0, isbn);
		Libro libro = hqlQuery.getSingleResult() ;		
		session.close();
		
		return libro;
	}





public void alta(Libro lib) {
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();	
	session.save(lib);
	transaction.commit();
	session.close();
	
	
}

public void baja(String isbn) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	String queryString = "delete from Libro where isbn=(:condicion)";
	Query hqlQuery = session.createQuery(queryString);
	hqlQuery.setParameter("condicion", isbn);
	hqlQuery.executeUpdate();
	transaction.commit();
	session.close();
}

public void modificar(String isbn, String titulo) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	String queryString = "update Libro set titulo = (:condicion) where isbn = (:condicion2)";
	Query hqlQuery = session.createQuery(queryString);
	hqlQuery.setParameter("condicion", titulo);
	hqlQuery.setParameter("condicion2", isbn);
	hqlQuery.executeUpdate();
	transaction.commit();
	session.close();
}




public  List <Libro> selection(){
	
	Session session = HibernateUtil.getSessionFactory().openSession();		
	Query hqlQuery = session.createQuery("FROM  Libro");			
	List<Libro> list = hqlQuery.getResultList();	
	return list;
}
	
	
}


