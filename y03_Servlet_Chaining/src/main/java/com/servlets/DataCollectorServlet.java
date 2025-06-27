package com.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/collect")
public class DataCollectorServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
			
		String n1 = req.getParameter("num1");
		String n2 = req.getParameter("num2");
		
       req.setAttribute("num1" , n1);
       req.setAttribute("num1" , n2);
       
       RequestDispatcher rd = req.getRequestDispatcher("add");
       rd.forward(req, res);

       
    }
}
