<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>人事評価システム</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>
<form action="Login" method="post">
  <label for="name">ID：</label>
  <input type="text" id="name" name="id"><br>
  <label for="pass">パスワード：</label>
  <input type="password" id="pass" name="pass"><br>
  <input type="submit" value="ログイン"><br>
</form>
</body>
</html>