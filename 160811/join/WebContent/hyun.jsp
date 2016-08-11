<%@page import="member.vo.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<style>
body{background: Cornsilk;}
h1{width:450px; border: 3px solid pink; padding: 10px;}
h2{width:350px; border: 3px solid green; padding: 10px;}
ul li{margin-left: 10px; width: 250px;  padding: 10px; font-size: 1.5em; color: blue;}
</style>
<title>Insert title here</title>
</head>
<body>
	<h1>id : ${sessionScope.member1.memId }</h1>
	<h1>비밀번호 : ${sessionScope.member1.memPw}</h1>
	관심사:<ul>
		<c:forEach var="interest" items="${member1.memInterest}">
			<li>${interest}</li>
		</c:forEach>	
	</ul>
	<img src="joo.jpg" ><br>
	<a href="join.html"/>입력화면 
</body>
</html>