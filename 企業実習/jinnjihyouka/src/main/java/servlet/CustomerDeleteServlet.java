package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.CustomerDAO;

@WebServlet("/CustomerDelete")
public class CustomerDeleteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String customerId = request.getParameter("customerId");

        if (customerId == null || customerId.isEmpty()) {
            request.getRequestDispatcher("/WEB-INF/jsp/customerDeleteError.jsp").forward(request, response);
            return;
        }

        CustomerDAO dao = new CustomerDAO();
        boolean result = dao.deleteCustomer(customerId);

        String path = result
            ? "/WEB-INF/jsp/customerDeleteSucces.jsp"
            : "/WEB-INF/jsp/customerDeleteError.jsp";

        request.getRequestDispatcher(path).forward(request, response);
    }
}
