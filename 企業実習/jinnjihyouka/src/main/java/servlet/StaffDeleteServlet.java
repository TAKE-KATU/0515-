package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.StaffDAO;

@WebServlet("/StaffDelete")
public class StaffDeleteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String staffId = request.getParameter("staffId");

        if (staffId == null || staffId.isEmpty()) {
            request.getRequestDispatcher("/WEB-INF/jsp/staffDeleteError.jsp").forward(request, response);
            return;
        }

        StaffDAO dao = new StaffDAO();
        boolean result = dao.deleteStaff(staffId);

        String path = result ? "/WEB-INF/jsp/staffDeleteSucces.jsp" : "/WEB-INF/jsp/staffDeleteError.jsp";
        request.getRequestDispatcher(path).forward(request, response);
    }
}
