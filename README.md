 jdk(java development kit)
 - for java developer

 jre(java runtime environment)
 - for java user

 IDE(Integrated development Environment)
 - eclipse

Window -> Show View -> Navigator

main 
ctrl+space bar 메인메시지 

sysout 
ctrl+space bar System.out.println(); 

이클립스 
소스보고 싶으면 f3

attach Source -> external location -> jdk -> src.zip -> f3 

시스템 클래스에 주석이 많이 달려있는데 

jAVA밑에 

C:\Program Files\Java\jdk1.8.0_91\bin/javadoc.exe


자바 클래스 설명하는 주석 달고 javadoc라는 프로그램 실행하면 

클래스 설명 메서드 설명 주석 달려있는데 

java8 api doc

general -> web browser -> use external web browser

name: chrome
location: C:\Program Files (x86)\Google\Chrome\Application\chrome.exe

로컬에서 동작하는 자바 어플리케이션 만들수 있다.

Java SE(Standard Edition)

- awt(GUI), core, JDBC(java application을 sql로 수정할때 필요함) JDBC(Java Database Connectivity) -> 지금은 mybatis(DB연동할때 씀) 많이 씀
 JNDI(java naming directory interface) ip서버 숫자주소를 영문으로 도메인 연동

- swing(gui) 자바 gui 화면구성은 swing, xml(extensible markup language) parsing(sax,dom)

------------------------------------------------------------------------------------------------


 Java EE(Enterprise Edition)


ejb 인터페이스만 만다.
스탠다드 에디션은 클래스만 많고 해당 기능 다 부여 되어있음.
엔터프라이즈 에디션은 인터페이스만 되어있다는 것은 이런이런기능이 있다 정의(선언)만 되어있다.

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

new-> web-> dynamic web project -> generate web.xml 체크 ->

java resources src -> new -> servlet -> constructors from superclass 체크 해제 

어노테이션@ 을 보고 서블릿클래스구나 하고 알아냄.

- 배운 것 정리 -

jdk, 이클립스 설정
api doc 즐겨찾기
자바프로젝트 생성
java standard edition 제공하는 기술(awt,swing,lang,jdbc,jndi,xml parsing)
java enterprise edition 제공하는 기술(ejb,servlet,jsp)
ee 구현
서블릿, jsp 구현하려면 was(run할수있는 환경 제공 톰캣 사용)
was 이용 서블릿 실행, 어노테이션,


