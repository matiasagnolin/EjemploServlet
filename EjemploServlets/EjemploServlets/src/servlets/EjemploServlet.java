package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Estudiante;

//Esta es una forma alternativa al web.xml de asociar Servlets a una URL.
//@WebServlet("/EjemploServlet")
public class EjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EjemploServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre(request.getParameter("inputNombre"));
		estudiante.setApellido(request.getParameter("inputApellido"));
		
		ArrayList<Estudiante> alumnos = (ArrayList<Estudiante>) request.getSession().getAttribute("Alumnos");
		if(alumnos == null){
			alumnos = new ArrayList<Estudiante>();
			request.getSession().setAttribute("Alumnos", alumnos);
		}
		alumnos.add(estudiante);		
		System.out.println(estudiante.toString());
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
