package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BO.LibroBO;
import com.entity.Autor;
import com.entity.Libro;

/**
 * Servlet implementation class Seur
 */
@WebServlet("/Seur")
public class Seur extends HttpServlet {
	private static final long serialVersionUID = 1L;
     LibroBO lBO = new LibroBO();  
     Autor au = new Autor();
     Libro lib = new Libro();
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
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String n = request.getParameter("titulo");
		String n1 = request.getParameter("isbn");
		String n2 = request.getParameter("action");
		String n3 = request.getParameter("tituloN");
		au.setId_Autor(3);
		au.setNombre("Menganesimo");
		
		System.out.println(n2);
		
		if(n2.equals("insert")) {
			lib.setAutor(au);
			lib.setTitulo(n);
			lib.setIsbn(n1);	
			
			lBO.alta(lib);
			request.setAttribute("libro", "alta realizada!!!");
			 request.getRequestDispatcher("LibroRecuperado.jsp").forward(request, response);
		}else if(n2.equals("delete")) {
			lBO.baja(n1);
			request.setAttribute("libro", "alta realizada!!!");
			 request.getRequestDispatcher("LibroRecuperado.jsp").forward(request, response);
			
		}else if(n2.equals("update")) {
			lBO.modificar(n1, n3);
			
			request.setAttribute("libro", "alta realizada!!!");
			 request.getRequestDispatcher("LibroRecuperado.jsp").forward(request, response);
		}else if(n2.equals("request")) {
			 List <Libro> lista = lBO.selection();
			 request.setAttribute("libros", lista);
			 request.getRequestDispatcher("LibroRecuperado.jsp").forward(request, response);
		}
		
		
		
		//Libro libro =lBO.select(n1);
		 


		 
		 
		 
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
