package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/NewStaff")
public class NewStaffServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String staffName = request.getParameter("staffName");
        String position = request.getParameter("position");

        boolean result = true; // DAO登録処理を想定

        String path = result ? "/WEB-INF/jsp/newStaffSucces.jsp" : "/WEB-INF/jsp/newStaffError.jsp";
        request.getRequestDispatcher(path).forward(request, response);
    }
}