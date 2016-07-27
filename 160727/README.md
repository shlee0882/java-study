**[날짜 선택화면](../README.md)**

저장영역이 다름

final

힙에 저장

static final

+public #protected ~default -private

## JDBC


- DB에 종속적으로 코딩하면 안됨.

- DB에 질질 끌려다녀선 안됨

- 벤더가 바뀌더라도 JDBC 이용해서 작성하는것 똑같음.


- WAS가 바껴도 코딩방식은 똑같음. servlet/jsp 쓸수있고 tomcat 쓸수있고 개발자는 인터페이스만 보고 가져다 씀.


- 중립적으로 코딩위해 개발자는 인터페이스만 메서드 보고 코딩하고 구현은 DBMS 벤더에게 맡김.


- 개발자가 중립적으로 코딩하는것이 중요해짐.

![jdbc](../resources/jdbc.JPG)

**DBMS 벤더**

JDBC(Java DataBase Connectivity) : DB와 연동하는 Java어플리케이션 작성할때 사용하는 javaAPI

1. (개발자 작성)규약사용
 - Java Application이 JDBC API 사용

2. (sun이 만듬) 규약정의
 - JDBC API(java.sql, javax.sql, interface) 

3. (DB벤더) 규약구현
 - 오라클 ojb.jar -> JDBC Driver 제공해줘야함.
 - MySQL mysql.jar
 - MsSQL mssql.jar

****

- sql을 진짜 많이 씀. 쿼리작성

- SQL문 에디팅할수있는 툴을 많이 씀. 대표적인 툴로 TOAD, orange4Oracle(SQL Editor) 이 있다.

- 오라클클라이언트 자동으로 깔리지 않음.

1. Oracle11g XE(Express Edition)
2. Orange4Oracle(SQL Editor)
3. 오라클 클라이언트 설치

- jar를 클래스패스 설정하고 jdbc api 사용해서 java application 작성해보는것이 실습

DB는 예외처리 필수적으로 함.

[DB Express Edition 11g](http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html)
[JDBC Driver](http://www.oracle.com/technetwork/database/enterprise-edition/jdbc-112010-090769.html)

build path -> configure build path -> add external jars -> ojdbc6.jar 추가 

DBMS 벤더별로 제공하는 Driver 클래스 등록해야함.
DBMS와 연결해야하는데 Connection 이라는 객체 생성됨.
연결했으면 SQL문을 작성해서 DBMS한테 전달해야함.
statement 작성해서해야하고 전송 및 실행
SQL 실행한 결과를 받아서 콘솔에 뿌려주거나 UI에 뿌려줌.
closed를 통해 Connection Statement 객체들을 반납해줘야함