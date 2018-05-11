package com.futbolServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.futbolBO.EquipoBO;
import com.futbolBO.JugadorBO;
import com.futbolEntity.Equipo;
import com.futbolEntity.Jugador;

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
		String paginaDestino = "equipos.jsp";
		EquipoBO eBO = new EquipoBO();
		JugadorBO jBO = new JugadorBO();
		String consulta = request.getParameter("action");
		String codigo = request.getParameter("equipo_cod");
		String fotoEscudo = request.getParameter("foto_escudo");
		String fotoEquipo = request.getParameter("foto_equipo");
		
		if(consulta!= null&& consulta.equals("consulta")) {		
			
			int codJugador = Integer.parseInt(codigo);
			List<Jugador>plantilla = jBO.consultajugadores(codJugador);			
			request.setAttribute("jugadores", plantilla);
			request.setAttribute("fequipo", fotoEquipo);
			request.setAttribute("fescudo", fotoEscudo);
			paginaDestino = "aliniacion.jsp";
			
		}else {
		
			List<Equipo> equipos = eBO.consultaEquipo();		
			request.setAttribute("equipos", equipos);		
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