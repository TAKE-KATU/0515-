package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
@WebServlet("/Customer")
public class CustomerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	CustomerDAO dao = new CustomerDAO();
        request.setAttribute("customerList", dao.findAll());
        request.getRequestDispatcher("/WEB-INF/jsp/customer.jsp").forward(request, response);
    }
}
