package com.SergiCoches;

import com.entity.Vehiculo;

public class VehiculoSiniestro {

	private Vehiculo vehiculo;
	private Integer perdida;

	public VehiculoSiniestro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehiculoSiniestro(Vehiculo vehiculo, Integer perdida) {
		super();
		this.vehiculo = vehiculo;
		this.perdida = perdida;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Integer getPerdida() {
		return perdida;
	}

	public void setPerdida(Integer perdida) {
		this.perdida = perdida;
	}

}
