package com.BO;



import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.HibernateUtil.HibernateUtil;
import com.entity.Libro;

public class LibroBO {
	
public  List <Libro> select() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Libro> criteria = builder.createQuery(Libro.class);
		Root<Libro> root = criteria.from(Libro.class);
		criteria.select(root).where(builder.like(root.get("titulo"), "%titulo1%"));
		TypedQuery<Libro> q=session.createQuery(criteria);
				
		List<Libro> list = q.getResultList();

		
		
		return list;
	}




public  List <Libro> orderSelect(){
	
	Session session = HibernateUtil.getSessionFactory().openSession();		
	CriteriaBuilder builder = session.getCriteriaBuilder();
	CriteriaQuery<Libro> criteria = builder.createQuery(Libro.class);
	Root<Libro> root = criteria.from(Libro.class);
	criteria.orderBy(builder.asc(root.get("titulo")));
	TypedQuery<Libro> q=session.createQuery(criteria);
			
	List<Libro> list = q.getResultList();

	
	
	return list;
	
	
}

}
