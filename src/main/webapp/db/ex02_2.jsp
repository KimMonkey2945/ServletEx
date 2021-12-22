<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입하기</title>
</head>
<body>

	<!-- 자기소개가 너무 길어질 수 있어서 post로 한다
		무작정 jsp로하는 것이 아니다...
	 -->
	<form method="post" action="/db/ex02_insert">
		<div>
			<label>이름: </label><input type="text" name="name">
		</div>
		<div>
			<label>생년월일: </label><input type="text" name="yyyymmdd">
		</div>
		<div>
			<label>자기소개 </label>
			<textarea rows = "5" cols="50" name="introduce"></textarea>
		</div>
		<div>
			<label>이메일: </label><input type="text" name="email">
		</div>
		<input type="submit" value="가입">
	</form>
	


</body>
</html>