<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User,java.util.List, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>職員登録完了</title>
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

<h2>新規職員登録完了</h2>

<a href="newStaff">新規職員登録に戻る</a>
<a href="staff">職員一覧に戻る</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>