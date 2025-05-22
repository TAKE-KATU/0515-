<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>利用者登録完了</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>

<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="Logout">ログアウト</a>
</p>

<h2>新規利用者登録完了</h2>

<a href="newCustomer">新規利用者登録に戻る</a>
<a href="customer">利用者一覧に戻る</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>