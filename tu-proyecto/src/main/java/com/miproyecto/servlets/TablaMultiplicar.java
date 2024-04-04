package com.miproyecto.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/tablamultiplicar")
public class TablaMultiplicar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TablaMultiplicar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html");
	        int numero = Integer.parseInt(request.getParameter("numero"));

	        if (numero < 1 || numero > 10) {
	            response.getWriter().print("El número debe estar entre 1 y 10.");
	        } else {
	            response.getWriter().print("Tabla de multiplicar del " + numero + ":<br>");
	            for (int i = 1; i <= 10; i++) {
	                response.getWriter().print(numero + " x " + i + " = " + (numero * i) + "<br>");
	            }
	        }
	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    // response.getWriter().print("entrada al doPost");
		doGet(request, response);
	}
}

