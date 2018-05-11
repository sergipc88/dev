package com.personas;

public class Persona {
	
	private String nombre;
	private String direccion;
	private String dni;
	
	
	public Persona(String nombre, String direccion, String dni) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
