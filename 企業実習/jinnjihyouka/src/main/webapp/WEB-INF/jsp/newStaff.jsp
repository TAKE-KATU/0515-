<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規職員登録</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>

<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="Logout">ログアウト</a>
</p>

<h2>新規職員登録</h2>

<form action="NewStaff" method="post">
　<label for="name">氏名：</label>
  <input type="text" id="name" name="name"><br>
  
  <label for="id">ID：</label>
  <input type="text" id="id" name="id"><br>
  
  <label for="pass">パスワード：</label>
  <input type="password" id="pass" name="pass"><br>
  
  <input type="submit" value="新規職員登録"><br>
</form>

<a href="user">ユーザー一覧に戻る</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>