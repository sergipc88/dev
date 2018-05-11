package Actions;

import com.opensymphony.xwork2.ActionSupport;

import BO.LibroBO;
import entity.Libro;

public class ModificacionAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2607514562877996264L;

	private Libro libro;
	LibroBO lBO = new LibroBO();


	
	public Libro getLibro() {
		return libro;
	}



	public void setLibro(Libro libro) {
		this.libro = libro;
	}



	public String execute(){
		
		lBO.update(libro);
			
			
			return SUCCESS;
		}
	
}
