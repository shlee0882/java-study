**[날짜 선택화면](../README.md)**

employees 테이블과 job_history 테이블을 outer join 사용함.

모든 직원들의 사원번호, 업무코드, 시작일자, 종료일자, 부서번호

부서이동 이력이 있는 사원의 정보도 출력하고,

부서이동 이력이 없는 사원의 정보도 출력해야 한다.

SubQuery(부분쿼리)

1. 메인쿼리와의 연관성 여부

  a. 연관성 없는 서브쿼리(Noncorrelated subquery)
  
    A. 단일 ROW, 단일 칼럼을 반환하는 서브쿼리
    
    B. 다중 ROW, 단일 칼럼을 반환하는 서브쿼리
    
    C. 다중 컬럼을 반환하는 서브쿼리

    메인쿼리와 서브쿼리가 각자 개별적으로 실행 가능.

  b. 연관성 있는 서브쿼리(Correlated subquery)
    - 메인쿼리와 서브쿼리 사이에 조인조건을 주는 쿼리


2. 서브쿼리가 위치하는 곳에 따라

- 일반 서브쿼리: select절

- 인라인뷰:from절

- 중첩쿼리(nested query): where절
