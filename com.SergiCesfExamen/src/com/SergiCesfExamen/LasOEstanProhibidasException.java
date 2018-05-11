package com.SergiCesfExamen;

import java.io.PrintStream;

public class LasOEstanProhibidasException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void printStackTrace(PrintStream s) {
	System.out.println("lo siento las 'O' estan prohibidas ");
		super.printStackTrace(s);
	}
	
	

}
