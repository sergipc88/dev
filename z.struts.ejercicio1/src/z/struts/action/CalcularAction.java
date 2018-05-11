package z.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class CalcularAction extends ActionSupport {

	private int n1;
	private int n2;
	private String op;
	private int resultado;
		


	public int getN1() {
		return n1;
	}



	public void setN1(int n1) {
		this.n1 = n1;
	}



	public int getN2() {
		return n2;
	}



	public void setN2(int n2) {
		this.n2 = n2;
	}



	public String getOp() {
		return op;
	}



	public void setOp(String op) {
		this.op = op;
	}



	public int getResultado() {
		return resultado;
	}



	public void setResultado(int resultado) {
		this.resultado = resultado;
	}



	public String execute(){
switch(op) {		
		case "+":
			resultado = sumar(n1,n2);
			break;
		case "-":
			resultado = restar(n1,n2);
			break;
		case "*":
			resultado = multiplicar(n1,n2);
			break;
		case "/":
			resultado = dividir(n1,n2);
			break;
		}
	return SUCCESS;
	}
	
	
	
	private int sumar(int n1, int n2) {
		
		int r = n1 + n2;
		
		return r;
		
	}
	
	private int restar(int n1, int n2) {
		
		int r = n1-n2;
		
		
		return r;
		
	}

	private int multiplicar(int n1, int n2) {
	
	int r = n1*n2;
	
	
	return r;
	
	}
	
	private int dividir(int n1, int n2) {
		
		int r = n1/n2;
		
		
		return r;
		
	}
}
