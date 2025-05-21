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
　<label for="staffNumber">職員番号：</label>
  <input type="text" id="staffNumber" name="staffNumber" pattern="[A-Za-z0-9]{10}" title="半角英数字10桁で入力してください" required><br>
  
  <label for="name">氏名：</label>
  <input type="text" id="name" name="name" required><br>
  
  <label for="department">部署：</label>
  <input type="text" id="department" name="department"><br>
  
  <label for="position">役職：</label>
  <input type="text" id="position" name="position"><br>
  
  <label for="age">年齢：</label>
  <input type="text" id="age" name="ager" pattern="\d{2}" title="半角数字2桁で入力してください" required><br>
  
  <label for="gender">性別：</label>
	<select id="gender" name="gender" required>
  		<option value="" disabled selected>選択してください</option>
  		<option value="male">男性</option>
  		<option value="female">女性</option>
  		<option value="other">その他</option>
	</select>
<br>
  
  <label for="dateOfHire">入社年月日：</label>
  <input type="date" id="dateOfHire" name="dateOfHire"><br>
  
  <label for="license">資格1(国家資格)：</label>
  <input type="text" id="license" name="license"><br>
  
  <label for="certification">資格2(民間資格)：</label>
  <input type="text" id="certification" name="certification"><br>
  
  <input type="submit" value="新規職員登録"><br>
</form>

<a href="staff">職員一覧に戻る</a>
<a href="main">メイン画面へ戻る</a>

</body>
</html>