<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規ユーザー登録</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>

<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="Logout">ログアウト</a>
</p>

<h2>新規ユーザー登録</h2>

<form action="NewUser" method="post">
　<label for="name">氏名：</label>
  <input type="text" id="name" name="name" required><br>
  <label for="id">ID：</label>
  <input type="text" id="id" name="id" pattern="[A-Za-z0-9]{10}" title="半角英数字10桁で入力してください" required><br>
  <label for="pass">パスワード：</label>
  <input type="password" id="pass" name="pass" pattern="[A-Za-z0-9]{8}" title="半角英数字8桁で入力してください" required>><br>
  <input type="submit" value="新規ユーザー登録"><br>
</form>

<a href="user">ユーザー一覧に戻る</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>