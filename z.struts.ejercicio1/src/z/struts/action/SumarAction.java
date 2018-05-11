package z.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class SumarAction extends ActionSupport {

	private int n1;
	private int n2;
	private int resultado;
	
	public String execute(){
			resultado = n1+n2;
		return SUCCESS;
	}

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

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	
	
}
