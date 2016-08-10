**[날짜 선택화면](../README.md)**

##URL과 웹페이지

- http://localhost:8090/J2EEPrj/hello.jsp?name=dooly
  - 프로토콜, 서버이름, 경로, 쿼리 문자열

- ?문자열 -> 쿼리 문자열


- 정적 자원 -> 이미지, 텍스트
- 동적 자원 -> 회원정보 보여주려면 jsp,asp,php 사용해야함

##폼 메소드 GET,POST

\<form method="GET"> 

- 서버상태가 변하지 않는게 get방식 사용
- get방식은 파라미터 값 길이 제한 있음.
- 쿼리 내용이 주소에 나타남.
- 게시판 글보기 

\<form method="POST">

- 데이터 입력해서 DB에 저장한다면 post방식 사용
- post방식은 파라미터 값 길이 제한 없음.
- 쿼리 내용이 주소에 사라짐.

자바스크립트를 사용해 체크박스 체크여부 알람 넣기 가능.

##J2EEPrj -> war(web Archive) export 하기

1. Tomcat(톰캣) 이용 server start
 
프로젝트 폴더 -> export -> war -> browse -> C:\java\apache-tomcat-8.0.36\webapps

-> export함 ->  start.bat 서버 실행 -> server스타트되면서 자동으로 압축풀어짐. 

http://localhost:8087/ 실행 C:\java\apache-tomcat-8.0.36\webapps\ROOT\index.jsp -> http://localhost:8087/JavaEEPrj/form.html 확인


## 서블릿 클래스 만들기

Java Resources -> src -> chap01 -> HelloServlet.java

tomcat Server Webapps - JavaEEPrj

![deployment](../resources/deployment.JPG)

- 웹페이지의 기능별로 하위 디렉토리 생성 구분하여 작업함.


##scope

1. page scope

2. request scope

3. session scope

4. application scope

setAttribute() 메서드가 있고 getAttribute() 있다.

(key,value) 페어 형태, 

페이지 간 정보공유 할땐 페이지스콥 정해줌.
request scope은 공유하는 정보를 request scope에 넣어주는것.


응답주면 응답끊어지고 정보 유지 못함.
커넥션 유지를 못하니깐

setAttribue

패키지생성 student.cotroller -> new create servlet


MyServlet

1. form data 추출
2. form data를 VO객체를 생성
3. VO객체를 request객체에 저장(즉 request scope에 저장)

request

데이터 공유시 범위가 어디까지인지

리퀘스트는 매번 생성된다. 리퀘스트 객체 생성은 was가 해준다. 여기서 여기 넘어갈때 여기서 여기 넘어갈때 request객체 생성됨.



VO객체를 request 객체에 저장한다.

mvc1모델 서블릿 안쓰고 jsp 안에서 모두 작성한것,
mvc2모델 서블릿 사용 컨트롤러 뷰 역할을 나눔.
java
request scope

기존
1. form.html에서 action="result.jsp" 로 보냄
2. result.jsp에서 처리

mvc2 서블릿 추가후

1. form.html에서 action="StudentController" 보냄
2. Servlet으로 doGet, doPost, requestProcess안에서 처리 RequestDispatcher 사용

request.getattributte와 같은역할 태그가 jsp:userbean 태그다.

jsp:userbean 단일 데이터만 딱딱 가져올수있다.

jsp에는 jsp페이지 복잡해지고 유지보수 힘들어짐. 자바코드를 가급적 없애자라며 usebean getproperty가 나온것임. 그 이후 jsp2.0 jstl이 나오면서 태그중심으로 가고있다.


vo get메서드 호출하겠다. 
getStuNumber()
stuNumber

##usebean 유즈빈 


##EL(Expression Language)

##JSTL

- 별도의 라이브러리 필요함
- chap12 -> web-inf -> lib -> jstl-1.2 jar 복사 붙여넣기
- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


5장 8장 10장 11장 12장
