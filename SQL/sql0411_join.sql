-- join이란, 두 개 이상의 테이블을 연결하여 데이터를 검색하는 방법
/*
<join의 종류>
cross join 
inner join
outer join
self join
*/
-- cross join : 한 쪽 테이블의 각 행마다 다른 쪽 테이블의 모든 행이 한 번씩 매칭되는 join
select 부서.부서번호, 부서명, 이름, 사원.부서번호 from 부서 cross join 사원 where 이름 = '배재용';

-- inner join(내부 조인) : 각 테이블에서 join 조건에 일치하는 데이터만 join
-- '이소미'사원의 사원번호, 직위, 부서번호, 부서명
-- ANSI sql 조인 
select 사원번호, 직위, 부서.부서번호, 부서명 from 사원 inner join 부서 on 사원.부서번호 = 부서.부서번호 where 이름 = '이소미';
-- Non-ANSI sql 조인 (위 방법과 결과는 같으나 문법이 다름 )
select 사원번호, 직위, 부서.부서번호, 부서명 from 사원 inner join 부서 where 사원.부서번호 = 부서.부서번호 and 이름 = '이소미';


-- 고객회사들이 주문한 주문건수를 많은 순서대로 보이시오.
-- 컬럼은 고객번호, 담당자명, 고객회사명, 주문건수
select 고객.고객번호, 담당자명, 고객회사명, count(*) as 주문건수 from 고객 inner join 주문 on 고객.고객번호 = 주문.고객번호 group by 고객.고객번호, 담당자명, 고객회사명 order by count(*) desc;

-- 고객별로 주문금액 합을 보이되, 주문금액 합이 많은 순서대로 
-- 컬럼은 고객번호, 담당자명, 고객회사명, 주문금액합 
select 고객.고객번호, 담당자명, 고객회사명, sum(주문수량 * 단가) as 주문금액합 from 고객 
inner join 주문 on 고객.고객번호 = 주문.고객번호 inner join 주문세부 on 주문.주문번호 = 주문세부.주문번호  
group by 고객.고객번호, 담당자명, 고객회사명
order by 4 desc;
-- non ANSI st
select 고객.고객번호, 담당자명, 고객회사명, sum(주문수량 * 단가) as 주문금액합 from 고객, 주문, 주문세부
where 고객.고객번호 = 주문.고객번호 and 주문.주문번호 = 주문세부.주문번호  
group by 고객.고객번호, 담당자명, 고객회사명
order by 4 desc;

-- 할인율을 반영하려면 아래 수식 사용!!
-- sum(truncate(주문수량*단가-(주문수량 * 단가 * 할인율) , 1)) as 주문금액합
select 

-- 모든 사원의 사원번호, 이름, 부서명
select 사원번호, 이름, 부서명 from 사원 inner join 부서 on 사원.부서번호 = 부서.부서번호; 

-- 주문번호 'H0255'의 제품명과 주문수량, 단가 표시
-- 테이블 이름이 길거나 많은 곳에 사용될 경우, 별명을 사용하는 것이 좋다.
select o.주문번호, p.제품명, o.주문수량, o.단가 
from 주문세부 o
inner join 제품 p 
on o.제품번호 = p.제품번호 where o.주문번호 = 'H0255'; 

-- Non-Equi Join : '='연산자가 아닌 부등호 비교연산자를 이용한 Join
select 고객번호, 고객회사명, 담당자명, 마일리지, 등급명 from 고객
inner join 마일리지등급 on 마일리지 >= 하한마일리지 and 마일리지 <= 상한마일리지 
where 담당자명 = '이은광';

-- Outer Join(외부 조인)
-- 사원 중에 부서 배치가 되지 않은 사원이 누군지 확인 가능 (사원 입장에서)
-- outer 키워드 생략 가능
select 사원번호, 이름, 부서명 from 사원 
left outer join 부서 on 사원.부서번호 = 부서.부서번호;
-- 부서 중에 사원이 소속 되어 있지 않은 부서 확인 가능 (부서 입장에서)
select 사원번호, 이름, 부서명 from 사원 
right join 부서 on 사원.부서번호 = 부서.부서번호;

-- self Join : 동일한 테이블 안에서 한 컬럼이 다른 컬럼을 참조하는 경우에 사용
-- 마치 동일한 테이블을 다른 테이블인 것처럼 Join 시키는 방법 (본인이 본인을 Join 시킴)
select 사원.사원번호, 사원.이름, 상사.사원번호 as '상사의 사원번호' , 상사.이름 as '상사의 이름' 
from 사원 
inner join 사원 as 상사 on 사원.상사번호 = 상사.사원번호;
-- 상사가 없는 사원까지 포함된 데이터를 요구할 경우 사용
select 사원.사원번호, 사원.이름, 상사.사원번호 as '상사의 사원번호' , 상사.이름 as '상사의 이름' 
from 사원 
left join 사원 as 상사 on 사원.상사번호 = 상사.사원번호;




