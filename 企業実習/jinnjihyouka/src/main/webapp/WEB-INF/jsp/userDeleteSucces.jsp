<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー削除完了</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>

<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="Logout">ログアウト</a>
</p>

<h2>ユーザー削除完了</h2>

<a href="userDelete">ユーザー削除に戻る</a>
<a href="user">ユーザー一覧に戻る</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>