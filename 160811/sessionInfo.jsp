<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>세션정보</h1>
	세션ID: <%=session.getId() %><br>
	세션 생성시간: <%=session.getCreationTime() %><br>
	세션 최근접근시간: <%=session.getLastAccessedTime() %> <br>
	세션 Timeout 시간 : <%=session.getMaxInactiveInterval() %> <br>
	세션 isNew : <%=session.isNew() %> <br>
</body>
</html>