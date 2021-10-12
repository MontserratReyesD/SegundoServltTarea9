package mx.edu.uacm.progweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MontserratReyesServlet_2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*
         * Recibe los parametros. 
         */
		
		String nombre = req.getParameter("nombre");
		System.out.println("El nombre es: " + nombre);
		
		String apellido = req.getParameter("apellido");
		System.out.println("El apellido es: " + apellido);
        
        PrintWriter salida = resp.getWriter();
        //Utilice salida para enviar el contenido al navegador web
        salida.println("Hola tu nombre es " + nombre + " " + "y tu apellido es " + apellido);
        
	}
	
	
	
	
	
	
	
	
	
	

}
