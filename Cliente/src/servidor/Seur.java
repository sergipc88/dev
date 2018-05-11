package servidor;

import java.io.IOException;
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
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String paginaDestino = "resultado.jsp";
		
		String nombre = request.getParameter("client");
		String material = request.getParameter("material");
		String medida = request.getParameter("tamano");
		String comentario = request.getParameter("comentarios");
		
		
		String frase = nombre+ " quiere una caja de "+material+" de tamaño "+medida+" y comenta que: "+ comentario;
		
		request.setAttribute("resultado", frase);
		
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
