package servlet;

import java.io.IOException;                          // For input/output operations
import javax.servlet.*;                              // For general servlet classes
import javax.servlet.http.*;                         // For HTTP-specific servlet classes
import DB_Connection.DataHandler;

public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handles POST requests sent from the registration form
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // 1. Get form parameters from the HTTP request
        String uname = req.getParameter("username");           // Gets value of <input name="name">
        String password = req.getParameter("password");   // Gets value of <input name="password">
        
        DataHandler.insertData(uname, password);
        
    }
}