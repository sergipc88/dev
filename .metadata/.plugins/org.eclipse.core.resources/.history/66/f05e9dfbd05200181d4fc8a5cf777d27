package com.BO;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.HibernateUtil.HibernateUtil;
import com.entity.Paciente;


public class PacienteBO {

	
	public void alta(Paciente p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(p);
		transaction.commit();
		session.close();
	}
	
	public void baja(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String queryString = "delete from Paciente where id=?";
		Query<?> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter (0, id);
		hqlQuery.executeUpdate();
		transaction.commit();
		session.close();
	}
	
	public void modificar(String nombre, String apellido, Date fecha, int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String queryString = "update Paciente set nombre = (:name), apellido = (:surname), fecha = (:date) where id = (:condicion)";
		Query<?> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter ("name", nombre);
		hqlQuery.setParameter ("surname", apellido);
		hqlQuery.setParameter ("date", fecha);
		hqlQuery.setParameter ("condicion", id);
		hqlQuery.executeUpdate();
		transaction.commit();
		session.close();
	
	}
	
	public List<Paciente> consulta(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Paciente> hqlQuery = session.createQuery("FROM  Paciente");
		List<Paciente> lista = hqlQuery.list();
		session.close();
		return lista;
		
		
	}
	
	
	
	public Paciente recuperarPaciente(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Paciente WHERE id_paciente = (:condicion)";
		Query <Paciente>hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", id);
		Paciente p = hqlQuery.uniqueResult();
		session.close();
		return p ;
	}
	
	
//	public  void modificarPaciente(int id, String nombre, String apellido, Date fecha ) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		String queryString = "UPDATE Paciente SET nombre = (:name) + apellido = (:surname) + fecha = (:date) WHERE id_paciente = (:condicion)";
//		Query <Paciente>hqlQuery = session.createQuery(queryString);
//		hqlQuery.setParameter("condicion", id);
//		hqlQuery.setParameter("name", nombre);
//		hqlQuery.setParameter("surname", apellido);
//		hqlQuery.setParameter("date", fecha);
//	}
	
	
}
