<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザーメニュー</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>
<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="Logout">ログアウト</a>
</p>

<!--表↓-->
<p>ユーザー一覧</p>
<p>氏名</p>
<p>管理区分</p>
<p>最終ログイン</p>
<p>最終ログアウト</p>
<p>氏名（一覧）</p>
<p>管理区分（一覧）</p>
<p>最終ログイン（履歴）</p>
<p>最終ログアウト（履歴）</p>
<!--表↑-->


<a href="newUser">新規ユーザー登録</a>
<a href="userDelete">ユーザー削除</a>

<a href="user">ユーザー</a>
<a href="staff">職員</a>
<a href="customer">利用者</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>