-- 서브쿼리는 where절 뿐만 아니라 select, from, having 에도 사용 가능

-- having에 사용하는 예제
-- 고객 전체의 평균 마일리지보다 평균 마일리지가 더 큰 도시
select 도시, avg(마일리지) as 평균마일리지 from 고객
group by 도시 
having avg(마일리지) > (select avg(마일리지) from 고객);

-- from에 사용하는 예제 ('인라인뷰'라고 부름)
-- 담당자명, 고객회사명, 마일리지, 도시, 해당 도시의 평균 마일리지 
-- 도시의 평균마일리지와 각 고객의 마일리지의 차(-)도 함께 표현
select 담당자명, 고객회사명, 마일리지, 고객.도시, 도시평균마일리지, (도시평균마일리지 - 마일리지) as 차이
from 고객, (select 도시, avg(마일리지) as 도시평균마일리지 from 고객 group by 도시) as 도시별요약
where 고객.도시 = 도시별요약.도시;

-- 서브쿼리만 따로 실행
select 도시, avg(마일리지) as 도시평균마일리지 from 고객 group by 도시;

-- inner join으로 바꾼 예제
select 담당자명,
	고객회사명,
	마일리지,
	고객.도시,
	도시평균마일리지,
	(도시평균마일리지 - 마일리지) as 차이
from 고객
inner join (select 도시, avg(마일리지) as 도시평균마일리지
			 from 고객 group by 도시) as 도시별요약
on 고객.도시 = 도시별요약.도시;

-- select에 사용하는 예제
-- 하나의 컬럼 값만 반환하는 쿼리여야 함 (Scalar SubQuery)
-- 고객번호, 담당자명, 고객의 최종주문일
select 고객번호, 담당자명, (select max(주문일) from 주문 where 주문.고객번호 = 고객.고객번호) as 최종주문일 
from 고객;


-- 다중컬럼 서브쿼리 : 서브쿼리에서 여러 개의 컬럼을 사용하는 경우
-- 각 도시마다 최고 마일리지를 보유한 고객의 정보
select 도시, 담당자명, 고객회사명, 마일리지 from 고객
where (도시, 마일리지) in (select 도시, max(마일리지) from 고객 group by 도시);


-- 상관 서브쿼리 (Corelated SubQuery)
/* main쿼리와 서브쿼리 간의 상관관계를 포함하는 형태의 쿼리
상관서브쿼리는 main쿼리와 한 행씩 실행하며 처리함.
그렇기 때문에 실행속도가 늦어질 가능성이 있음 */
-- 사원의 정보와 상사의 정보를 함께 표현
select 사원번호, 이름, 상사번호, 
	(select 이름 from 사원 as 상사 
		where 상사.사원번호 = 사원.상사번호) as 상사이름
from 사원;

-- 특정 주문일 범위 안에서 각 주문번호당 총 판매금액
select 주문번호, 주문일, 
	(select sum(주문세부.주문수량 * 주문세부.단가) from 주문세부 
		where 주문세부.주문번호 = 주문.주문번호) as 총판매금액
from 주문 
where 주문일 between '2022-01-01' and '2022-12-31';
-- 위의 상관쿼리를 비상관쿼리로 변경하면,
select 주문.주문번호, 주문일, sum(주문세부.주문수량 * 주문세부.단가) as 총판매금액
from 주문
left join 주문세부
on 주문세부.주문번호 = 주문.주문번호 
where 주문일 between '2022-01-01' and '2022-12-31'
group by 주문.주문번호, 주문.주문일 ;

-- '배재용'사원의 부서명 
-- 비상관쿼리
select 부서명 from 부서 
where 부서번호 = (select 부서번호 from 사원 where 이름 = '배재용');

-- 상관쿼리 
select (select 부서명 from 부서 where 부서.부서번호 = 사원.부서번호) as 부서명
from 사원
where 이름 = '배재용';

-- 담당자명, 고객회사명, 주문건수(count), 최초주문일(min), 최종주문일(max)
-- 서브쿼리 이용해서 표현하시오.
select 담당자명, 고객회사명, 주문건수, 최초주문일, 최종주문일
from 고객 
inner join(select 고객번호, 
			count(*) as 주문건수, 
			min(주문일) as 최초주문일, 
			max(주문일) as 최종주문일 
		   from 주문 group by 고객번호) as 주문요약
on 주문요약.고객번호 = 고객.고객번호;

