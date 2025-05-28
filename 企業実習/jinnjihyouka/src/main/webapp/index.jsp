<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>

<h2>ログイン</h2>

<form action="Login" method="post">
  <label for="id">ID：</label>
  <input type="text" id="id" name="id" pattern="[A-Za-z0-9]{10}" title="半角英数字10桁で入力してください" required><br>
  <label for="pass">パスワード：</label>
  <input type="password" id="pass" name="pass" pattern="[A-Za-z0-9]{8}" title="半角英数字8桁で入力してください" required><br>
  <input type="submit" value="ログイン"><br>
</form>
</body>
</html>