

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Seur
 */
@WebServlet("/Seur")
public class Seur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Seur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paginaDestino = "vista.jsp";
		HttpSession session = request.getSession();
		String cerrarSesion = request.getParameter("action");
		Integer sumaSesion = 0;
		if (cerrarSesion != null && cerrarSesion.equals("cerrar")) {
			session.invalidate();
			request.getRequestDispatcher("vista.jsp").forward(request, response);
			response.sendRedirect(request.getContextPath() + "/vista.jsp");
		} else {
			String element1 = request.getParameter("elemento1");
			String element2 = request.getParameter("elemento2");
			int elR = 0;
			Integer el1 = 0;
			Integer el2 = 0;
			if (element1 == null || element2 == null) {

			} else if ((element1.equals("") || element2.equals(""))) {

			} else {
				el1 = Integer.parseInt(element1);
				el2 = Integer.parseInt(element2);
				elR = el1 + el2;
				request.setAttribute("resultado", elR);
			}

			session = request.getSession();
			sumaSesion = (Integer) session.getAttribute("sumaSe");
			if (sumaSesion == null) {
				sumaSesion = 0;
			}
			sumaSesion = sumaSesion + elR;

			if (sumaSesion > 1000) {
				try {
					throw new SesionexcededException();
				} catch (SesionexcededException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					paginaDestino = "error.jsp";
					session.invalidate();
				}
			} else {
				session.setAttribute("sumaSe", sumaSesion);
			}

			ServletContext ctx = getServletContext();
			Integer sumaApp = (Integer) ctx.getAttribute("app");
			if (sumaApp == null) {
				sumaApp = 0;
			}

			sumaApp = sumaApp + elR;
			ctx.setAttribute("app", sumaApp);

			request.getRequestDispatcher(paginaDestino).forward(request, response);
			response.sendRedirect(request.getContextPath() + paginaDestino);
		}

		// ------------------ este es el ejercicio uno -----------------------------
		// String element1 = request.getParameter("elemento1");
		// String element2 = request.getParameter("elemento2");
		// int elR = 0;
		// Integer el1 = 0;
		// Integer el2 = 0;
		// if(element1 == null||element2 == null) {
		//
		// }else if((element1.equals("")||element2.equals(""))) {
		//
		// }else {
		// el1 = Integer.parseInt(element1);
		// el2 = Integer.parseInt(element2);
		// elR = el1 + el2;
		// request.setAttribute("resultado", elR);
		// }

		//
		// HttpSession session = request.getSession();
		// Integer sumaSesion = (Integer) session.getAttribute("sumaSe");
		// if(sumaSesion == null) {
		// sumaSesion = 0;
		// }
		// sumaSesion = sumaSesion + elR;
		// session.setAttribute("sumaSe", sumaSesion);
		//
		//
		// ServletContext ctx = getServletContext();
		// Integer sumaApp = (Integer) ctx.getAttribute("app");
		// if(sumaApp == null) {
		// sumaApp = 0;
		// }
		//
		// sumaApp = sumaApp + elR;
		// ctx.setAttribute("app",sumaApp);

		// ArrayList al = (ArrayList) session.getAttribute("palabras");
		// if(al==null){
		// al = new ArrayList();
		// }
		//
		// al.add(request.getParameter("elemento"));
		//
		//
		// session.setAttribute("palabras", al);
		// request.getRequestDispatcher("vista.jsp").forward(request, response);
		// response.sendRedirect(request.getContextPath() + "/vista.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
