package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import model.Customer;

@WebServlet("/NewCustomer")
public class NewCustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String customerName = request.getParameter("customerName");
        String email = request.getParameter("email");

        if (customerName == null || customerName.isEmpty() || email == null || email.isEmpty()) {
            request.getRequestDispatcher("/WEB-INF/jsp/newCustomerError.jsp").forward(request, response);
            return;
        }

        Customer customer = new Customer(customerName, email);
        CustomerDAO dao = new CustomerDAO();
        boolean result = dao.insertCustomer(customer);

        String path = result ? "/WEB-INF/jsp/newCustomerSucces.jsp" : "/WEB-INF/jsp/newCustomerError.jsp";
        request.getRequestDispatcher(path).forward(request, response);
    }
}
