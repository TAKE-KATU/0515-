<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User,java.util.List, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>職員削除</title>
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

<h2>職員削除</h2>

<form action="UserDelete" method="post">
  <label for="staffNumber">職員番号：</label>
  <input type="text" id="staffNumber" name="staffNumber" pattern="[A-Za-z0-9]{10}" title="半角英数字10桁で入力してください" required><br>
  
  <label for="name">氏名：</label>
  <input type="text" id="name" name="name" required><br>
  
  <input type="submit" value="職員削除"><br>
  <p>※この処理は取り消し出来ません</p>
</form>

<a href="Staff">職員一覧に戻る</a>
<a href="Main">メイン画面へ戻る</a>

</body>
</html>