<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー削除</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>

<h2>ユーザー削除</h2>

<form action="UserDelete" method="post">
  <label for="id">ID：</label>
  <input type="text" id="id" name="id"><br>
  <label for="pass">パスワード：</label>
  <input type="password" id="pass" name="pass"><br>
  <input type="submit" value="ユーザー削除"><br>
  <p>※この処理は取り消し出来ません</p>
</form>

<a href="user">ユーザー一覧に戻る</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>