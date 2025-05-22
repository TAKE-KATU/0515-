<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>利用者メニュー</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>
<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="Logout">ログアウト</a>
</p>

<!--表↓-->
<p>利用者一覧</p>
<p>利用者番号</p>
<p>氏名</p>
<p>最終評価日時</p>
<p>評価者ID</p>
<p>利用者番号（履歴）</p>
<p>氏名（履歴）</p>
<p>最終評価日時（履歴）</p>
<p>評価者ID（履歴）</p>
<!--表↑-->


<a href="newCustomer">新規利用者登録</a>
<a href="customerDelete">利用者削除</a>
<a href="customerEvaluation">利用者評価</a>

<a href="user">ユーザー</a>
<a href="staff">職員</a>
<a href="customer">利用者</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>