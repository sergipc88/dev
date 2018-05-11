package com.personas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String paginaDestino = "index.jsp";
		Persona p1 = new Persona("Juan", "45667f", "calle beethoven");
		Persona p2 = new Persona("Curro", "34628f", "calle Pulgas");
		Persona p3 = new Persona("Julen", "55639f", "calle Lluria");
			
		
		List <Persona>personitas = new ArrayList<>();
		
		personitas.add(p1);
		personitas.add(p2);
		personitas.add(p3);
		
		
		
		request.setAttribute("personas", personitas);
		request.getRequestDispatcher(paginaDestino).forward(request, response);
		response.sendRedirect(request.getContextPath() + paginaDestino);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
