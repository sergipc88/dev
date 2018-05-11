package com.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LibroBO.LibroBO;
import com.LibroEntity.Libro;

/**
 * Servlet implementation class Seur
 */
@WebServlet("/Seur")
public class Seur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Seur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paginaDestino = "listado.jsp";
		String action = request.getParameter("action");
		LibroBO lBO = new LibroBO();
				
	
		
		if (action != null && action.equals("alta")) {		
			
			String titulo = request.getParameter("tituloAlta");
			int precio = Integer.parseInt(request.getParameter("precioAlta"));
			
			Libro l = new Libro(titulo,precio);
			lBO.alta(l);
			
			
			
		}else if(action != null && action.equals("modificar")) {
			int id = Integer.parseInt(request.getParameter("id_libro"));
			String newTitulo = request.getParameter("nombre");
			int newPrice = Integer.parseInt(request.getParameter("precio"));
			
			
			Libro l1 = new Libro(newTitulo, newPrice);
			l1.setId_Libro(id);
			lBO.update(l1);
			
		}else if(action != null && action.equals("eliminar")) {
			int id = Integer.parseInt(request.getParameter("id_libro"));
	
			Libro l1 = new Libro();
			l1.setId_Libro(id);
			lBO.delete(l1);
			
			
		}else {	}
		
		
		
		List<Libro> lista = lBO.selection();
		
		 request.setAttribute("libros", lista);
		
		request.getRequestDispatcher(paginaDestino).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
