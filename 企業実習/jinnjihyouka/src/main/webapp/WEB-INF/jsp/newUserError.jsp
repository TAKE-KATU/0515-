<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録失敗</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>

<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="Logout">ログアウト</a>
</p>

<h2>新規ユーザー登録失敗</h2>
<p>サーバーエラー、または入力内容に問題がある可能性があります。</p>
<p>もう一度お試しください</p>

<a href="newUser">新規ユーザー登録に戻る</a>
<a href="user">ユーザー一覧に戻る</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>