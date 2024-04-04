package com.miproyecto.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mayortres")
public class MayorTres extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayorTres() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  double num1 = Double.parseDouble(request.getParameter("num1"));
	        double num2 = Double.parseDouble(request.getParameter("num2"));
	        double num3 = Double.parseDouble(request.getParameter("num3"));
	        
	        double mayor;
	        if(num1>num2) {
	        	if(num1>num3) {
	        		mayor = num1;
	        	} else {
	        		mayor = num3;
	        	}
	        } else {
	        	if(num2>num3) {
	        		mayor=num2;
	        	} else {
	        		mayor=num3;
	        	}
	        }
        
	    response.getWriter().print("El numero mayor es:  " + mayor);
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