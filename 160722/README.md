[날짜 선택화면](../README.md)

[7/22 1일차]()

##자바의 2개 구분

1. JDK(java development kit)
 - for java developer

2. JRE(java runtime environment)
 - for java user

--------------------------------------------------------------

 IDE(Integrated development Environment)
 - eclipse

Window -> Show View -> Navigator 로 bin > chap01 > .class 파일 생성된 것 확인가능

---------------------------------------------------------------

입력 | 결과
------------------|-----------------
main ctrl+space bar | public static void main(String[] args)
sysout ctrl+space bar | System.out.println(); 
이클립스에서 해당 클래스나 메서드의 소스보기 | f3
*attach Source -> external location -> jdk -> src.zip -> f3*

C:\Program Files\Java\jdk1.8.0_91\bin/javadoc.exe 은 자바의 클래스, 메서드, 인터페이스에 대한 주석 설명을 doc 형태로 바꿔줘서

이클립스에서 확인할수 있다.

웹으로도 자바에 대한 api doc을 확인할수 있다.

[JAVA SE API](https://docs.oracle.com/javase/8/docs/api/) 

[JAVA EE API](https://docs.oracle.com/javaee/7/api/) 

##이클립스와 웹브라우저 크롬 연동하기

- general -> web browser -> use external web browser
- name: chrome
- location: C:\Program Files (x86)\Google\Chrome\Application\chrome.exe

------------------------------------------------------------------------------------------------

Java SE(Standard Edition)

- awt(GUI), core, JDBC(java application을 sql로 수정할때 필요함) JDBC(Java Database Connectivity) -> 지금은 mybatis(DB연동할때 씀) 많이 씀
 JNDI(java naming directory interface) ip서버 숫자주소를 영문으로 도메인 연동

- swing(gui) 자바 gui 화면구성은 swing, xml(extensible markup language) parsing(sax,dom)

------------------------------------------------------------------------------------------------


Java EE(Enterprise Edition)

1. `인터페이스` 위주 구성
2. 스탠다드 에디션은 클래스만 많고 해당 기능 다 부여 되어있음.
3. 엔터프라이즈 에디션은 인터페이스만 되어있다는 것은 이런이런기능이 있다 정의(선언)만 되어있다.

was(web application server)는 구현해준다.

제우스 - 공공기관 사용
웹로직, 웹스피어 - 은행쪽은 ibm was 사용

웹서버는 단순한 html 실행만
자바 기반 웹서버 구동 위해선 was 역할 필요

EJB, faces(web application framework), json

json과 xml은 비슷함.
xml은 무겁고 파싱해야함. address태그를 쓰고 태그 사이에 데이터 집어넣어서 사용해야함. 데이터 양 많아지면 파싱해야 하는 부담이 있음.
json은 가볍게 interchange 표준 포맷 제공

persistence, servlet,jsp,websocket,jaxb,ws(web service)

jaxb 는 xml -> java 객체, java 객체 -> xml 바인딩 변환해줌

---------------------------------------------------------------------

##서블릿 프로젝트 생성하기

- new-> web-> dynamic web project -> generate web.xml 체크 ->

- java resources src -> new -> servlet -> constructors from superclass 체크 해제 

어노테이션@ 을 보고 서블릿클래스구나 하고 알아냄.

-------------------------------------------------
- 배운 것 정리 -

1. jdk, 이클립스 설정
2. api doc 즐겨찾기
3. 자바프로젝트 생성
4. java standard edition 제공하는 기술(awt,swing,lang,jdbc,jndi,xml parsing) 개념 
5. java enterprise edition 제공하는 기술(ejb,servlet,jsp) 개념
6. ee 구현
7. 서블릿, jsp 구현하려면 was(run할수있는 환경 제공 톰캣 사용) 이클립스와 크롬 연결, was 연동
8. was 이용 서블릿 실행, 

  1. 어노테이션 @WebServlet("/HelloServlet") 방식, 

  2. web.xml 수정 방식 
  
  <!-- Servlet 클래스 설정 -->
  <servlet>
   <servlet-name>Hello</servlet-name>
  	<servlet-class>chap01.HelloServlet</servlet-class>
  </servlet>
  <!-- 브라우저 상에서 서블릿 실행될때 요청해야한다. 부르고자 할때 호출하는 url 지정하는것. -->
  <!-- 서블릿이름은 동일하게 -->
  <servlet-mapping>
  	<servlet-name>Hello</servlet-name>
  	<url-pattern>/hello1</url-pattern>
  </servlet-mapping>


