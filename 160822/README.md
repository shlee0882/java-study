**[날짜 선택화면](../README.md)**

1. AJAX 통신(Asynchronous JavaScript and Xml)

2. Javascript XMLHttpRequest(XHR)

3. IE일때는 어떻게하고, 크롬일때는 어떻게 하고 브라우저 종류별로 다르게 코딩하는것이 크로스브라우징이다.

-> 일일히 하나하나 다 크로스브라우징 위해 코딩하는 것은 피곤하다 라이브러리 쓰자. jquery 쓰자

##XML

XML은 eXtensible Markup Language의 약자 이다.

XML은 구조가 있고 데이터가 있고 스타일이 있다.

  - 구조 : .XSD(SCHEMA), .dtd
    + 태그 명
    + 태그 순서
    + 태그 출현횟수

  - 스타일 : .XSL(Xml stylesheet language) - 꾸밀수 있다. css와 같은 역할
  
  - 내용(Content) : XML


##html과 xml과 다른점은 뭘까?

- html은 태그가 정해져 있어서 만들어진 태그만 쓸수 있지만

- xml은 맘대로 태그를 정의해서 쓸수 있다.

##XML 특징

- 사용자가 필요한 Tag를 정의할 수 있다.

- XML은 데이터 교환이 목적이다.

- 문서교환이 목적이다. 특정플랫폼에 종속되지 않는다.

- 텍스트 포맷을 보내야하는데 어떤 포맷으로 보내야할지 정해야 됨.

- **텍스트기반 문서 주고 받는데 표준화된 형식이 필요 했는데 XML이 그런역할을 한다.**

- 예전에는 시중은행에서 발생되는 거래상 전문이 있는데 XML기반 교환한다.

주소라는 정보를 담는 태그는 address로 하자 .
집전화번호는 home태그로 하자.
태그를 태그명이나 태그순서를 정하지 않으면 
규칙을 미리 정의해놓고 XML문서가 만들어줘야 한다.

## XML Parsing

- \<name>홍길동</name>

- 태그와 태그사이 데이터 추출하는 것을 XML Parsing이라 한다.

- XML Parsing은 두가지 방식으로 나눠진다.
  - SAX(Simple Api for XML)
  - DOM(Document Object Model)

자바에 API가 있다.

- 삭스와 돔에 차이는 삭스는 XML문서를 처음부터 끝까지 싹다 읽어서 파싱하는 방식이고 xml 조작은 안됨. 읽기만 가능

- 돔은 문서자체를 메모리 상에서 올려놓고 특정 태그만 뽑아오거나 조작 변경 등록 다 된다.

- XML문서 사이즈가 큰데 돔을 쓰면 메모리에 다 올려놓고 트레벌스 하기 때문에 메모리 딸림.

- XML대량 문서라면 단지 읽어서 태그만 뽑겠다라면 삭스 쓰면 되는 것이구 XML 문서 변경하고 싶다면 돔을 쓰면 된다. 

- 태그와 태그사이 뽑아내는것에 사이즈와 파싱에 대한 부담이 생겨 json 포맷이 생김

##JSON은 배열방식, 오브젝트방식 

##SpringMVC 기반에서 JSON 포맷으로 data를 작성하는 방법

:one: Jackson Library 다운로드 -> Json data를 Handling 하기 위한 API

:two: Spring bean 설정 파일(beans.xml)에  MappingJacksonHttpMessageConverter를 bean으로 등록
- MappingJacksonHttpMessageConverter가 JSON 포맷의 data를 HttpMessage로 변환해주는 역할

편리한 Tag 사용
- \<MVC:annotation-driven />

:three: @ResponseBody 어노테이션 사용
Controller 클래스 내부에 선언된 메서드에서 @ResponseBody 사용
@ResponseBody는 server가 client에게 전달하는 response를 java object가 아니라 text형태의 포맷으로 변환해주는 역할이다.


##jackson

1. mvnRepository에서 jackson-mapper 검색,

2. Class MappingJacksonHttpMessageConverter

##AJAX

AJAX는 비동기 방식으로 client가 화면상에서 입력하거나 조작해도 사용자는 화면을 계속 본다.

##데이터 전송형식

1. CSV형식 -  데이터를 콤마,로 구분함.

2. XML형식 - csv개선해서 나온 형식 태그를 사용해서 쉽게 데이터 나타냄., 가독성 좋음, 용량 커지면 파싱속도 떨어짐.

3. RSS형식 - 글 새로올라온것 공지 , 신문 기사 같은것. 

4. JSON형식 - 용량 적다 가독성 좋다.

##XMLHttpRequest

XMLHttpREquest는 자바스크립트가 Ajax를 사용할때 사용하는 객체 간단하게 xhr이다.


## JQuery 사용하고 작업 vs JavaScript 만 사용해서 작업

런타임중에 마우스 이벤트나 키보드 이벤트 

- 런타임에 동적으로 수행하는 것은 자바스크립트로 해야한다.

- html 태그를 계속 끌고 와야한다. document.getElementById이다.

- 태그를 가져와서 mydiv.style.color="red"; 설정할수 있다.

- mission1_q.html 는 jquery 이용안하고 javascript만으로 작업한 것.

- jquery.com -> download -> using jquery with a cdn -> https://code.jquery.com/

- uncompressed(개발용)는 소스 다 볼수있음. minified(운영용) 소스가 공백없이 뺵뺵히 붙어있음.

##mission1_jquery.html 은 jquery 사용해서 사용

````javascript
<div>
  <p>
    <h1></h1>
  </p>
    <p>
      <p></p>
  </p>
</div>

$('div > p')

div 밑에 p만 가져온다.

$('div p')

div 밑에 후손까지 다가져온다.
````
##Spring 나머지공부 정리

Server - 톰캣 서버 |
-----------------------|
ProjectServer - 프로젝트 안의 서버|
web.xml|

- run이 시작했을때 web.xml이 가장먼저 시작된다.

- 스프링 MVC DipatcherServlet

- 리스트 누르면 Dispatcher 서블릿으로 감.

----------------------------------------------------------------------------------------

:one: index.jsp 의 리스트 누를시 list.do로 정의된 곳을 찾음.

````jsp

<p><a href="list.do">리스트</a></p>
<p><a href="add.do">추가</a></p>
<p><a href="update.do">업데이트</a></p>
<p><a href="delete.do">삭제</a></p>

````

:two: RequestMapping이 되어있는 Controller.java로 찾아가게됨.

````java

public class Controller {

  @Autowired
  EmpDAO DAO;
  
  @RequestMapping("list.do")
  public String listShow(Model model){
    List<EmpwebVO> list=DAO.selectAll();
    model.addAttribute("list", list);
    return "list.jsp";
    
    }
  }

````
- DAO는 EmpwebImpl.java의 인터페이스이다.
- EmpwebImpl에는 CRUD 메서드가 만들어진 곳이다.
- list로 해당 리스트를 받아오고 model은 request이다. model을 사용해 list의 담긴 데이터를 list라는 변수에 저장시킨다.
- 데이터를 model에 addAttribute 이후 list.jsp로 보내버린다.


:three: list.jsp에서 model addAttribute의 list라는 변수를 사용해 저장한 리스트 데이터 값을 사용한다.

````jsp


<c:forEach var="emp" items="${list}">

<p>${emp.empid} ,    ${emp.empname} ,  ${emp.empdept}  ,${emp.emphireddate}  ,${emp.empsalary}  


</c:forEach>

````

- ${emp.empid},  ${emp.empname} ... 등등은 getempid, getempname 의 메서드를 호출하는 것이다.
- jstl의 foreach를 써서 반복한다.

----------------------------------------------------------------------------------------------

그럼 어떻게 @어노테이션을 사용하고 Autowired 되서 서로 왔다갔다 할수 있을까?

````xml

<!-- db.properties 경로 연결 -->
<context:property-placeholder  location="classpath:empweb/config/db.properties"/>

<!-- annotation 사용 위해(쓰기위해) component-scan 쓰는것이다. -->
<context:component-scan base-package="empweb"></context:component-scan>


````

- beans.xml - BasicDataSource, SqlSessionFactoryBean, SqlSessionTemplate 사용
  - BasicDataSource : db.properties 의 내용 연결 시켜줌.

````xml

  <bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource"
    p:driverClassName="${db.driver}" p:url="${db.url}" p:username="${db.username}" 
    p:password="${db.password}" p:maxActive="${db.max}" p:minIdle="${db.min}" /> 

````
- setdriverClassName, seturl, setusername ... 메서드가 있다.
     

````xml

<bean id="sqlSessionFacory" class="org.mybatis.spring.SqlSessionFactoryBean">
  <property name="dataSource" ref="dataSource"></property>
  <property name="configLocation" value="classpath:empweb/config/mybatisConfig.xml"></property>
  <property name="mapperLocations" ><!-- user.xml -->
    <list>
      <value>classpath:empweb/config/Empweb.xml</value>
    </list>
  </property>
</bean>

````

- SqlSessionFactoryBean은 db의 정보를 얻어오고, empVO 연결  ,sql쿼리문을 작성한 user.xml연결한다.

````xml

<bean id="sqlTemplate" class="org.mybatis.spring.SqlSessionTemplate">
<constructor-arg  ref="sqlSessionFactory"></constructor-arg>
</bean>

````
- SqlSessionTemplate에 최종적으로 연결시켜준다.


--------------------------------------------------------------------------------

그럼 beans.xml을 이렇게 다 구성하고 @autowired가 잘되는지 테스트해보아야 한다.

테스트가 완료되면 프로젝트 서버(web.xml)로 가서 beans.xml을 연결해줘야 한다.

-------------------------------------------------------------------------------

web.xml은 크게 3개로 구성된다.

필터 - CharacterEncodingFilter

리스너 - ContextLoaderListener

디스패쳐서블릿 - DispatcherServlet

````xml

  <filter><!-- 인코딩하는 것. -->
    <filter-name>EncodingHangle</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
    <init-param>
      <param-name>encoding</param-name><!-- setencoding 메서드임. -->
      <param-value>utf-8</param-value>
    </init-param>
  </filter>
  
  <filter-mapping>
  <filter-name>EncodingHangle</filter-name>
  <url-pattern>/*</url-pattern>
  </filter-mapping>

````

- 필터 클래스는 정확히 적어줘야 한다. 
- param-name은 setencoding이라는 메서드 이다.
- setencoding의 값은 utf-8로 설정

````xml

 <!-- needed for ContextLoaderListener -->
  <context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>classpath:empweb/config/beans.xml</param-value>
  </context-param>

  <!-- Bootstraps the root web application context before servlet initialization -->
  <listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
  </listener>

````

- ContextLoaderListener 추가시 다 생성된다.
- beans.xml의 파일경로를 지정해준다.

````xml

  <!-- The front controller of this Spring Web application, responsible for handling all application requests -->
  <servlet>
    <servlet-name>springDispatcherServlet</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>classpath:empweb/config/beans.xml</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
  </servlet>

  <!-- Map all requests to the DispatcherServlet for handling -->
  <servlet-mapping>
    <servlet-name>springDispatcherServlet</servlet-name>
    <url-pattern>*.do</url-pattern>
  </servlet-mapping>

````

- bans.xml 경로 지정해준다.
- .do로 끝나는 형식을 모두 처리하겠다 라는 뜻이다.