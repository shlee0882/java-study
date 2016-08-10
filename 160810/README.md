**[날짜 선택화면](../README.md)**

프로토콜, 서버이름, 경로, 쿼리 문자열

?문자열 -> 쿼리 문자열

http://localhost:8090/J2EEPrj/hello.jsp?name=dooly



<% 

String str1 = "Hello JSP"
Date mydate

%>

request response 기본객체 제공됨.

정적 자원 -> 이미지, 텍스트
동적 자원 -> 회원정보 보여주려면 jsp,asp,php 사용해야함

폼 태그가 있다. 입력항목을 form이라는 태그에 감싸줘야한다.

<form method="GET"> 
<form method="POST">

자바스크립트를 사용해 체크여부 알람 알려줄수있음.


url 보낼 길이가 제한되어 있다. 
게시판 글보기 

서버상태가 변하지 않는게 get방식 사용

데이터 입력해서 DB에 저장한다면 post방식 사용

get방식은 파라미터 값 길이 제한 있음.
post방식은 파라미터 값 길이 제한 없음.

분기시켜줄때 response.sendRedirect


J2EEPrj -> war(web Archive)

export -> war -> browse -> C:\java\apache-tomcat-8.0.36\webapps

-> export함 ->  start.bat 서버 실행 -> server스타트되면서 자동으로 압축풀어짐. 

http://localhost:8087/ 실행 C:\java\apache-tomcat-8.0.36\webapps\ROOT\index.jsp -> http://localhost:8087/JavaEEPrj/form.html 확인

## 서블릿 클래스 만들기

Java Resources -> src -> chap01 -> HelloServlet.java

tomcat Server Webapps - JavaEEPrj

개발환경 | 배포된 환경
