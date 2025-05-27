package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.StaffDAO;
import model.Staff;

@WebServlet("/staffList")
public class StaffListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        StaffDAO dao = new StaffDAO();
        List<Staff> staffList = dao.findAll();

        request.setAttribute("staffList", staffList);
        request.getRequestDispatcher("/WEB-INF/jsp/staff.jsp").forward(request, response);
    }
}
