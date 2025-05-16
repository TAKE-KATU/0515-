package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // GETメソッドでの処理が必要であればここに記述
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        String pass = request.getParameter("pass");

        User inputUser = new User(id, pass);

        LoginLogic loginLogic = new LoginLogic();
        boolean isLogin = loginLogic.execute(inputUser);

        if (isLogin) {
            // ログイン成功：DBからユーザー情報を取得してセッションに保存
            dao.UserDAO dao = new dao.UserDAO();
            User user = dao.findByIdAndPass(id, pass);

            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("loginUser", user);  // セッションにユーザー情報を格納
            } else {
                // ユーザーが見つからない場合、エラーメッセージをリクエストに設定
                request.setAttribute("errorMessage", "ユーザー情報が正しくありません");
            }
        } else {
            // ログイン失敗：エラーメッセージをリクエストに設定
            request.setAttribute("errorMessage", "ユーザー名またはパスワードが間違っています");
        }

        // 結果をJSPに渡して表示
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/loginResult.jsp");
        dispatcher.forward(request, response);
    }
}
