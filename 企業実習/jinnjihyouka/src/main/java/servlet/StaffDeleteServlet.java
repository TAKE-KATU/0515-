package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.StaffDAO;

@WebServlet("/staffDelete")
public class StaffDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String staffId = request.getParameter("staffId");
        StaffDAO dao = new StaffDAO();
        dao.delete(staffId);
        response.sendRedirect("staff");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/staffDelete.jsp").forward(request, response);
    }
}
