// NewUserServlet.java
package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.UserDAO;

@WebServlet("/UserDelete")
public class UserDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userId = request.getParameter("userId");

        UserDAO dao = new UserDAO();
        boolean result = dao.deleteUser(userId);

        String path = result ? "/WEB-INF/jsp/userDeleteSucces.jsp" : "/WEB-INF/jsp/userDeleteError.jsp";
        request.getRequestDispatcher(path).forward(request, response);
    }
}