package z.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class saludarAction extends ActionSupport {

	private String nombre;
	private String resultado;
	
	

	public String execute(){
		resultado = "Hola "+nombre;
		return SUCCESS;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
	
	
	
}
