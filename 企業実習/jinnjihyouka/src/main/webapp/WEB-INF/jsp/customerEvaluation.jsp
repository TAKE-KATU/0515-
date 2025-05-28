<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User,java.util.List, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>利用者評価</title>
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

<h2>職員評価</h2>

<form action="CustomerEvaluation" method="post">
　<label for="customerNumber">利用者番号：</label>
  <input type="text" id="customerNumber" name="customerNumber" pattern="[A-Za-z0-9]{10}" title="半角英数字10桁で入力してください" required><br>
  
  <label for="name">氏名：</label>
  <input type="text" id="name" name="name" required><br>
  
  <label for="evaluation1">評価項目1：</label>
  <input type="text" id="evaluation1" name="evaluation1"><br>
  
  <label for="evaluation2">評価項目2：</label>
  <input type="text" id="evaluation2" name="evaluation2"><br>
  
  <label for="evaluation3">評価項目3：</label>
  <input type="text" id="evaluation3" name="evaluation3"><br>
  
  <label for="evaluation4">評価項目4：</label>
  <input type="text" id="evaluation4" name="evaluation4"><br>
  
  <label for="evaluation5">評価項目5：</label>
  <input type="text" id="evaluation5" name="evaluation5"><br>
  
  <label for="evaluation6">評価項目6：</label>
  <input type="text" id="evaluation6" name="evaluation6"><br>
  
  <label for="evaluation7">評価項目7：</label>
  <input type="text" id="evaluation7" name="evaluation7"><br>
  
  <label for="evaluation8">評価項目8：</label>
  <input type="text" id="evaluation8" name="evaluation8"><br>
  
  <label for="evaluation9">評価項目9：</label>
  <input type="text" id="evaluation9" name="evaluation9"><br>
  
  <label for="evaluation10">評価項目10：</label>
  <input type="text" id="evaluation10" name="evaluation10"><br>
  
  <label for="remarks">備考：</label>
  <input type="text" id="remarks" name="remarks0"><br>
  
  <input type="submit" value="利用者評価"><br>
</form>

<a href="customer">利用者一覧へ戻る</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>