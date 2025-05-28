package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.StaffDAO;
@WebServlet("/Staff")
public class StaffServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	StaffDAO dao = new StaffDAO();
        request.setAttribute("staffList", dao.findAll());
        request.getRequestDispatcher("/WEB-INF/jsp/staff.jsp").forward(request, response);
    }
}
