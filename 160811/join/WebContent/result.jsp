<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="member.vo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
h1{width:450px; border: 3px solid pink; padding: 10px;}
h2{width:350px; border: 3px solid green; padding: 10px;}
ul li{margin-left: 10px; width: 250px;  padding: 10px; font-size: 1.5em; color: blue;}
</style>
<title>회원정보</title>
</head>
<body>
	<h1>회원정보 입력 결과</h1>
	<!-- el -->
	<h2>아이디:  ${member1.memId}</h2><!-- get을 뺸 메소드 넣음 -->
	<h2>비밀번호:  ${member1.memPw }</h2><br>
	관심사:<ul><!-- jstl -->
		<c:forEach var="interest" items="${member1.memInterest}">
			<li>${interest}</li>
		</c:forEach>	
	</ul>
</body>
</html>