package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.UserDAO;
import model.User;

@WebServlet("/NewUser")
public class NewUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            request.getRequestDispatcher("/WEB-INF/jsp/newUserError.jsp").forward(request, response);
            return;
        }

        UserDAO dao = new UserDAO();
        boolean result = dao.insertUser(new User(username, password));

        String path = result ? "/WEB-INF/jsp/newUserSucces.jsp" : "/WEB-INF/jsp/newUserError.jsp";
        request.getRequestDispatcher(path).forward(request, response);
    }
}