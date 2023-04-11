<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><a href="/chapter06_SpringMaven"><img src="../img/king.gif" width="50px" height="50px"></a>회원 가입</h1>
<form>
	<table border="1">
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" id="name">
			<div id="nameDiv"></div>
			</td>
		</tr>
		
		<tr>
			<th>아이디</th>
			<td><input type="text" name="id" id="id">
			<div id="idDiv" ></div>
			</td>
		</tr>
		
		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="pwd" id="pwd">
			<div id="pwdDiv"></div>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="등록" id="writeBtn">
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
</form>

<script src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script src="../js/write.js"></script>
</body>
</html>