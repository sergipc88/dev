package com.sergi.amor2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class suma
 */
@WebServlet("/suma")
public class Suma extends HttpServlet {
	private static final long serialVersionUID = 1L;
    SumaBO sBO = new SumaBO(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Suma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1 = request.getParameter("numero1");
		String n2 = request.getParameter("numero2");
		String actn = request.getParameter("action");
		
		int x = Integer.parseInt(n1);
		int y = Integer.parseInt(n2);
		int r = sBO.distribucion(x, y, actn);
		
		
		
		response.getWriter().append(""+r);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
