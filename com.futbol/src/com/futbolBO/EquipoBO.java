package com.futbolBO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.HibernateUtil.HibernateUtil;
import com.futbolEntity.Equipo;

public class EquipoBO {

	public List <Equipo> consultaEquipo(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Equipo");
		List<Equipo> equipos = hqlQuery.list();
		
		session.close();
		
		return equipos;
	}
	
	
}
