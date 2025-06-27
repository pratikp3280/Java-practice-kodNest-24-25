package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.tomcat.jakartaee.bcel.classfile.ClassFormatException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ClassFormatException, IOException, ServletException {
        
        String dbUname = "Rohit";
        String dbPass = "4545";
		
		String username = request.getParameter("username");
        String password = request.getParameter("password");

      //  PrintWriter writer = response.getWriter();
        
        
        // Dummy credentials
//        if (dbUname.equals(username) &&  dbPass.equals(password)) {
//            response.sendRedirect("success.html");
//        } else {
//            response.sendRedirect("error.html");
//        }
        
       
        if (dbUname.equals(username) &&  dbPass.equals(password)) {
        	 request.setAttribute("dbUname", username);
            RequestDispatcher rd =  request.getRequestDispatcher("/Home.jsp");
            rd.forward(request, response);
        } else {
        	 RequestDispatcher rd =  request.getRequestDispatcher("/error.html");
             rd.forward(request, response);
        }
        
        
    }
}

/* there are 2 ways to Open Pages(Response) from the Servalet 
 *.1.=>  using  response.sendRedirect("success.html");
 *
 *.2.=>  using  RequestDispatcher rd =  request.getRequestDispatcher("/success.html");
            	rd.forward(request, response);
 * */
