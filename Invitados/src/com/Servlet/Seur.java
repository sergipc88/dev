package com.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BO.InvitadoBO;
import com.Entity.Invitado;

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
		String paginaDestino = "Listado.jsp";
		InvitadoBO iBO = new InvitadoBO();
		String nombre;
		String ation = request.getParameter("action");
		
		if(ation.equals("alta")) {
			nombre = request.getParameter("invitado");
			iBO.insertar(nombre);
			
		}else if(ation.equals("baja")) {
			nombre = request.getParameter("invitado");
			iBO.eliminar(nombre);
			
		}else if(ation.equals("update")) {
			nombre = request.getParameter("invitado");
			String newName = request.getParameter("nuevlNombre");
			iBO.modificar(nombre, newName);
		}else if(ation.equals("consulta")) {
			List<Invitado>invitaditos = iBO.consultar();	
			request.setAttribute("convidats", invitaditos);
		}
		
		
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
