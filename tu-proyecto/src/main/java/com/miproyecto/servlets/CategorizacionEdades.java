package com.miproyecto.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/categorizacionedades")
public class CategorizacionEdades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategorizacionEdades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer edad = Integer.parseInt(request.getParameter("edad"));
        String categoria;
		
        
        if (edad < 12) {
            categoria = "Infante";
        } else if (edad >= 12 && edad <= 17) {
            categoria = "Adolescente";
        } else if (edad >= 18 && edad <= 60) {
            categoria = "Adulto";
        } else {
            categoria = "Anciano";
        }
        
	    response.getWriter().print("Tu categoria de edad es:  " + categoria);
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