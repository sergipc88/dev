package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Siniestro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Para generar n�meros autoincrementados
	private int id_siniestro;
	private Date fecha;
	private int perdida;
	@ManyToOne
	private Vehiculo vehiculo;

	public int getId_siniestro() {
		return id_siniestro;
	}

	public void setId_siniestro(int id_siniestro) {
		this.id_siniestro = id_siniestro;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPerdida() {
		return perdida;
	}

	public void setPerdida(int perdida) {
		this.perdida = perdida;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}