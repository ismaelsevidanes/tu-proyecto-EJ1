package com.miproyecto.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/diasemana")
public class DiaSemana extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemana() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer numero = Integer.parseInt(request.getParameter("dia"));
        String diaDeLaSemana;
        
        switch (numero) {
            case 1:
                diaDeLaSemana = "Lunes";
                break;
            case 2:
                diaDeLaSemana = "Martes";
                break;
            case 3:
                diaDeLaSemana = "Miercoles";
                break;
            case 4:
                diaDeLaSemana = "Jueves";
                break;
            case 5:
                diaDeLaSemana = "Viernes";
                break;
            case 6:
                diaDeLaSemana = "Sabado";
                break;
            case 7:
                diaDeLaSemana = "Domingo";
                break;
            default:
                diaDeLaSemana = "Numero incorrecto";
        }
        
	    response.getWriter().print("El dia de la semana es :  " + diaDeLaSemana);
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