**[날짜 선택화면](../README.md)**

##properties파일 생성 불러다 사용

values를 properties파일로 빼서 사용하겠다.


##AOP

코드 재사용
소프트웨어 재사용하는 방법 low-level

1. Copy & Paste
2. 함수 or 메서드 
3. 상속(Inheritance)
4. AOP(Aspect Oriented Programming 관점지향프로그래밍, 객체지향을 더 객체지향으로)

공통메서드(aspect) 앞뒤로 끼어넣기가 AOP이다

공통메서드 호출하는 문장이 없지만 공통메서드 호출하는 효과를 런타임에 받을수 있다.

1. Biz 로직 = 핵심기능
2. 로깅, 인증 = 부가기능

관계를 타이트하게 루즈하게 

AOP 적용하지 않으면 핵심기능과 부가기능이 섞여 있다.

##AOP 용어 - Aspect 부가기능

AOP종류

- AspectJ - 고레벨 어려움
- SpringAOP - 저레벨

우리가 배울건 SpringAOP

Advice + PointCut(명령어) = Aspect

1. Advice : 부가기능을 정의한 클래스(코드)

2. Target : 핵심기능을 정의한 클래스(코드)(Biz Logic 포함)
Advice(부가기능)를 적용할 대상

3. PointCut : Advice(부가기능)를 어떤 Target(핵심기능)에 적용할지를 선택하는 정규 표현식, 선별하는 식

4. JoinPoint 

pointcut에 excution(* myspring user * )

Advice + Target 어드바이스가 합쳐지는 지점.

Advice가 Target과 합쳐지는 지점이 JoinPoint라 한다.

SpringAOP의 JoinPoint는 Target의 메서드가 Runtime에 호출되는 시점

5. Aspect(=Advisor)

    - Advisor는 Spring Aop에서만 사용되는 용어

    - Advice + Pointcut = Aspect

    - 타겟이 어드바이스(로그 메서드) 호출

    - advice가 target을 선택해 연결해주는것.

##기존방식

advice에서 log메서드 만들었어 인자 2개 , 3개 만듬 , target 소스 고쳐야함. 기존방식은

## AOP 방식

target에는 어노테이션(@) 있거나  xml작성되있거나 pointcut 작성 되어있음.

---------------------------------------------------------------------------------

Maven Repository 에서 aspectj runtime, sprint aop 검색해서 받기

http://mvnrepository.com/artifact/org.aspectj/aspectjweaver/1.7.4
http://mvnrepository.com/artifact/org.springframework/spring-aop/3.2.17.RELEASE

##Advice 종류(유형)

1. Before Advice - 전처리,  

2. After Advice - 후처리(정상,오류), 거래 끝난과 동시에 읽음. 

3. After Returning Advice - 후처리(정상) 정상적일때만 처리

4. After Throwing Advice - exception 후처리(오류) 발생 오류 발생했을때 처리

5. Around Advice - 앞뒤로 처리 , 

이 타겟메서드가 수행시간이 얼마나 걸리는지 만들려면 시작 전 시간 체크, 시작 후 시간 체크

##XML기반 AOP 어플리케이션 작성절차

1. Advice 작성
    - Around Advice 유형 선택
    - PerformanceTraceAdvice.java 작성

2. Bean 설정파일
    - 작성한 Advice를 <bean>으로 등록
    - PointCut 표현식 정의

##POJO (Plain Old Java Object)

순수 객체 만듬 POJO

##PointCut

.은 바로 밑 파일 하나랑 맵핑 된다.
.. 은 하위 패키지

##Log4j(Log For Java)

- 자바를 위한 로그

sysout.prinln 찍으면 운영에 넘기기전에 필요없는 로그 없애야한다.
쓰잘데기 없는 로그 찍히는 것.

- 로그찍는것도 레벨을 두자
    - FATAL
    - ERROR
    - WARN
    - INFO

- 메이븐에서 log4j 검색 pom.xml에 복사

##log4j 구성요소

- Logger  - 로그파일 작성 관리
- Appender - Logging 메세지를 어디에 출력 또는 저장할지 결정하는 역할
- Layout - Logging 메세지