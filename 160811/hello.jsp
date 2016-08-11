<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
	<body>
	<!-- <% %> 안에서 자바 코드를 마음대로 작성할수 있다. -->
	<!-- 임포트 -->
	<%-- 자바 --%>
	   <%@ include file="sub.jsp" %> <!-- 중복되는 코드 별도로 모아놓음 -->
		<%
			String str1 = "Hello str1";
			Date myDate = new Date();
			out.println(myDate.toString());
			String value = request.getParameter("name");
		%>
	   <jsp:include page="title.jsp">
	   		<jsp:param name="myName" value="<%=value%>" />
	   </jsp:include><!-- jsp:include page는 page읽고 다시 돌아온다.  -->
		안녕하세요?<%=value%>님<br>
		<%-- 자바 --%>
		<%! String str2 = "Hello str2"; %>
		str1 변수 값은 : <%=str1%> <br>
		str2 변수 값은 : <%=str2%>
	</body>
</html>