package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CustomerEvaluation")
public class CustomerEvaluationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String customerId = request.getParameter("customerId");
        String evaluation = request.getParameter("evaluation");

        // 仮実装: 評価を保存
        boolean result = true; // 実際にはDAO処理を呼び出す

        String path = result ? "/WEB-INF/jsp/customerEvaluationSucces.jsp" : "/WEB-INF/jsp/customerEvaluationError.jsp";
        request.getRequestDispatcher(path).forward(request, response);
    }
}