<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<style>
	table tr td{
	padding-right: 20px;
    border: 4px solid skyblue;
    text-align: center;
    margin: 10px;
     }
     table tr th{
     border: 4px solid pink;
     color: green;
     padding-right: 20px;
     }
 </style>
<body>
	<h1>상현이의 구구단</h1>

	<table>
		<% for (int i = 2; i <= 9; i++) {%><tr>
			<th><%=i%>단</th>
			<% for (int j = 1; j <= 9; j++) {%>
			<td><%=i%> x <%=j%> = <%=i*j%></td>
			<% 
						}
					}
				%>
		</tr>
	</table>
</body>
</html>