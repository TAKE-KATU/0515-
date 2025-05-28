<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User,java.util.List, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>人事評価システム</title>
<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
</head>
<body>
<h1>人事評価システム</h1>

<%
User loginUser = (User) session.getAttribute("loginUser");
if (loginUser == null) {
%>
    <p>ログイン情報が取得できません。ログインし直してください。</p>
    <a href="index.jsp">ログイン画面へ</a>
<%
    return; // それ以上実行しない
}
%>
<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="Logout">ログアウト</a>
</p>

<!--表↓-->
<p>更新履歴</p>
<p>更新日時</p>
<p>更新種別</p>
<p>更新者</p>
<p>更新内容</p>
<p>更新日時（履歴）</p>
<p>更新種別（履歴）</p>
<p>更新者（履歴）</p>
<p>更新内容（履歴）</p>
<!--表↑-->


<a href="User">ユーザー</a>
<a href="Staff">職員</a>
<a href="Customer">利用者</a>

</body>
</html>