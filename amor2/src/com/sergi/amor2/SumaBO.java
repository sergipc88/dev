package com.sergi.amor2;

public class SumaBO {
	
	public int distribucion(int x, int y, String act) {
		
		int r = 0;
		
		switch(act){
			case "+":
				r = sumar(x,y);
				break;
			case "-":
				r = restar(x,y);
				break;
			case "*":
				r = multiplicar(x,y);
				break;
			case "/":
				r = dividir(x,y);
				break;
			default:
				break;
		}
		
		return r;
	}

	
	private  int sumar(int x, int y){int result = x + y; return result;}
	
	private int restar(int x, int y){int result = x - y; return result;}
	
	private int multiplicar(int x, int y){int result = x * x; return result;}
	
	private int dividir(int x, int y){int result = x / y; return result;}
	
	
}