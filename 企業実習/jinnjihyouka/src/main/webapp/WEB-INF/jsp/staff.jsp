<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="model.Staff" %>
<html>
<head>
<meta charset="UTF-8">
<title>職員メニュー</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>
<p>
<%
    model.User loginUser = (model.User) session.getAttribute("loginUser");
    if (loginUser == null) {
        response.sendRedirect("Login"); // 未ログインならログイン画面へ
        return;
    }
%>
<%= loginUser.getName() %>さん、ログイン中
<a href="Logout">ログアウト</a>
</p>

<!--表↓-->
<h1>職員一覧</h1>
<table border="1">
    <tr>
        <th>ID</th><th>氏名</th><th>部署</th><th>役職</th><th>備考</th><th>最終評価日時</th><th>評価者ID</th>
    </tr>
    <%
        List<Staff> staffList = (List<Staff>) request.getAttribute("staffList");
        for (Staff s : staffList) {
    %>
    <tr>
        <td><%= s.getStaffId() %></td>
        <td><%= s.getName() %></td>
        <td><%= s.getDepartment() %></td>
        <td><%= s.getPosition() %></td>
        <td><%= s.getRemarks() %></td>
        <td><%= s.getLastEvaluationDateAndTime() %></td>
        <td><%= s.getEvaluationUserId() %></td>
    </tr>
    <% } %>
</table>
<!--表↑-->


<a href="newStaff">新規職員登録</a>
<a href="staffDelete">職員削除</a>
<a href="staffEvaluation">職員評価</a>

<a href="user">ユーザー</a>
<a href="staff">職員</a>
<a href="customer">利用者</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>