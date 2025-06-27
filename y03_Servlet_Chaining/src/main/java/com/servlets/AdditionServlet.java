package com.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/add")
public class AdditionServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
			
		String n1 = (String) req.getParameter("num1");
		String n2 = (String) req.getParameter("num2");
		
       int result = Integer.parseInt(n1) + Integer.parseInt(n2);
    		
       req.setAttribute("result" , result);
       RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
       rd.forward(req, res);
    }
}
