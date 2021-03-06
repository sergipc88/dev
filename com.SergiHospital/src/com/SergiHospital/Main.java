package com.SergiHospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.BO.PacienteBO;
import com.entity.Paciente;


public class Main {

	private static Scanner lector = new Scanner(System.in);
	private static SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
	PacienteBO pBO = new PacienteBO();
	public static void main(String[] args) {
		Main main = new Main();
		boolean serverON = true;

		while (serverON) {
			System.out.println("elije opcion");
			System.out.println("1.alta");
			System.out.println("2.baja");
			System.out.println("3.modificación");
			System.out.println("4.consulta");
		

			int opt1 = lector.nextInt();

			main.opcionEscogida(opt1);
		}	
	}
	
	
	void opcionEscogida(int opt) {
		switch (opt) {

		case 1:
			alta();			
			break;
		case 2:
			baja();
			break;
		case 3:
			modificacion();
			break;
		case 4:
			consulta();
			break;
		default:
			break;

		}
	}
	
	
	
	
	
	void alta() {
		String nombre;
		String apellido;
		String fechaString;
		Date fecha = null;
		System.out.println("insertar paciente:");
		
		System.out.println("insertar nombre");
		nombre = lector.next();
		System.out.println("insertar apellido");
		apellido = lector.next();
		System.out.println("inserta la fecha de alta");
		fechaString = lector.next();
		try {
			fecha = s.parse(fechaString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Paciente p = new Paciente();
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setFecha(fecha);
		
		pBO.alta(p);
	}
	
	void baja() {
		int id;
		boolean deleteOK = true;
		
		while(deleteOK) {
			System.out.println("inserta la ID del paciente a eliminar");
			id = lector.nextInt();
			
			String r;
			System.out.println("esta seguro? (s)(n)");
			r = lector.next();
			
			if(r.equals("s")) {
				pBO.baja(id);
				deleteOK = false;
			}else {
				deleteOK = false;
			}
		}
		
		
		
		
	}

	void modificacion() {
		int id;
		String nombre;
		String apellido;
		String fechaString;
		Date fecha = null;
		
		System.out.println("inserta la id del paciente a MODIFICAR");
		id = lector.nextInt();
		System.out.println("inserta el nuevo NOMBRE");
		nombre = lector.next();
		System.out.println("inserta el nuevo APELLIDO");
		apellido = lector.next();
		System.out.println("inserta la nueva FECHA");	
		fechaString = lector.next();
		
		try {
			fecha = s.parse(fechaString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pBO.modificar(nombre, apellido, fecha, id);
	}
	
	void consulta() {
		System.out.println("----------------------------");
		List<Paciente> consulta = pBO.consulta();
		Iterator<Paciente> it = consulta.iterator();
		while (it.hasNext()) {
			Paciente p = it.next();
			System.out.println("Nombre: "+p.getNombre());
			System.out.println("Apellido: "+p.getApellido());
			System.out.println("Fecha de alta:"+p.getFecha());
			System.out.println("----------------------------");
		}
	}
	
}