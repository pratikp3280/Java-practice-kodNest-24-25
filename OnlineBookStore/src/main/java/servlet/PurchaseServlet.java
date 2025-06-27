package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import dao.PurchaseDAO;
import model.User;

public class PurchaseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int bookId = Integer.parseInt(req.getParameter("bookId"));
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");

        if (user != null && PurchaseDAO.purchaseBook(user.getId(), bookId)) {
            session.setAttribute("msg", "✅ Purchase successful for book ID: " + bookId);
        } else {
            session.setAttribute("msg", "❌ Purchase failed. Try again.");
        }

        res.sendRedirect("userDashboard");
    }
}
