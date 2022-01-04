-- 스키마를 ict_practice 쓰도록 해주기.
use ict_practice;

SELECT * FROM usertbl;

-- ORDER BY는 결과물의 개수나 종류에는 영향을 미치지 않지만
-- 결과물을 순서대로(오름차순, 내림차순)정렬하는 기능을 가진다.
-- SELECT 컬럼명 FROM 테이블명 ORDER BY 기준컬럼 정렬기준;
-- 정렬기준은 ASC(오름차순)(점점 올라감), DESC(내림차순)(점점 내려감)
-- 입력이 따로 없는 경우는 기본 정렬은 ASC(오름차순)(점점 올라감)

-- 가입한 순서(reg_date순으로)조회
SELECT * FROM usertbl ORDER BY reg_date;
-- DESC 순으로 조회
SELECT * FROM usertbl ORDER BY reg_date DESC;
-- 키가 작은 순으로 나열해보기
SELECT * FROM usertbl ORDER BY height ASC;

-- 정렬시 동점인 부분을 처리하기 ORDER BY를 두개 이상 동시에 나열도 가능
-- 아래코드는 키로 오름차순을 하되, 동점이면 생년을 오름차순으로 나열한다.
SELECT * FROM usertbl ORDER BY height ASC, birth_year ASC;
-- 손흥민과 스프링의 자리가 바뀜

-- 만약 문자라면 아스키코드 순으로 ORDER BY 정렬이 들어간다.
-- user_name으로 ORDER BY 해보기
SELECT * FROM usertbl ORDER BY user_name ASC;

-- 지역을 가나다 역순으로 나열하되, 만약 지역이 같다면 이름을 오름차순으로 정렬
SELECT * FROM usertbl ORDER BY addr DESC, user_name ASC;

-- DISTINCT 결과물로 나온 컬럼의 중복값을 다 제거하고 고유값을 남긴다.
-- 현재 지역 종류는 6개지만 (데이터 개수는 11개)를 파악하기 어렵다.
-- 중복값을 하나로 출력하기 위해 출력컬럼 앞에 distinct를 붙인다.
SELECT distinct addr FROM usertbl;


-- employees 스키마로 변경
use employees;

-- 출력요소의 개수를 제한할때는 limit 구문을 사용한다.
-- 데이터가 워낙 많다보니 모든 데이터를 보여주지 않고
-- 1000개만 보여주도록 설정되어있다.
SELECT * FROM employees;

-- 테이블명 뒤에 limit 숫자;를 입력하면 그 숫자 만큼만 결과창에 뜬다.
-- 숫자 n을 적으면 자동으로 0번자료부터 n개를 보여준다.
SELECT * FROM employees limit 10;

-- limit는 ORDER BY와 결합도 가능
SELECT * FROM employees ORDER BY hire_date DESC limit 10;

-- 일정 데이터셋을 먼저 얻고, 그 내부적으로 정렬시킬떄는 서브쿼리를 쓴다.
SELECT * FROM (SELECT * FROM employees limit 10) e ORDER BY hire_date DESC;
-- 괄호에 대한 임시테이블명 'e' 부여해서 돌아가도록 한다.

-- 만약 limit 숫자1, 숫자2; 같이 숫자 2개를 넣는 경우
-- 숫자 1번부터 숫자2에 기입한 갯수만큼 보여준다.
SELECT * FROM employees limit 5,10;


use ict_practice;
-- GROUP BY는 같은 데이터를 하나의 그룹으로 묶어준다.
-- GROUP BY의 조건절은 WHERE이 아닌 HAVING절로 처리하게 된다.

SELECT * FROM buytbl;

-- 각 인물별로 구매한 개수 총합을 구해보기.
-- 먼저 각 인물들이 몇개를 구매했는지 조회
SELECT user_id, amount FROM buytbl ORDER BY user_id;
-- SELECT 컬럼명, 집계합수(컬럼명2)... FROM 테이블명 GROUP BY 묶음컬럼명;
SELECT user_id, sum(amount) FROM buytbl GROUP BY user_id;

-- 각 유저별 총 구매액 구하기
-- 집계합수 sum() 괄호사이에서 연산기호가 사용 가능하다.
SELECT user_id, sum(price*amount) FROM buytbl GROUP BY user_id;
-- sum() 뒤에 as 'total'을 붙이면 total로 이름이 변경되서 나온다.
SELECT user_id, sum(price*amount) as 'total' FROM buytbl GROUP BY user_id;

-- 각 유저별 구매 물품의 평균가 구해보기(총액 아님), 평균은 avg()로 처리한다.
SELECT user_id, avg(price) as '평균가' FROM buytbl GROUP BY user_id;

-- 자주쓰는 집계합수 정리
-- avg() 평균
-- min() 최소값
-- max() 최대값
-- count() row개수
-- count(distinct) 종류 개수
-- stdev() 표준편차
-- var_samp() 분산
SELECT count(*) FROM employees.employees;

-- usertbl에서 키가 제일 큰 회원 이름과 키 표시하기.
-- 힌트 -> 서브쿼리로 height절 처리
SELECT user_name, height FROM usertbl WHERE height =
  (SELECT max(height) FROM usertbl);

-- usertbl에서 키가 가장 작은 회원 찾기
-- 서브쿼리 사용
SELECT user_name, height FROM usertbl WHERE height =
  (SELECT min(height) FROM usertbl);

-- usertbl 사용자 전체 키 평균 구하기
SELECT avg(height) as '평균키' FROM usertbl;

-- 기존 쿼리문에서의 조건절은 WHERE절을 이용해서 처리했다.
-- 하지만 GROUP BY를 통해 집계하는 경우 WHERE절을 받을 수 없다.
-- 대신 조건절을 HAVING으로 대체한다.
-- WHERE과 사용법은 같다.
SELECT user_id, sum(price*amount) FROM buytbl GROUP BY user_id;
-- 구매액이 250000원이 넘는 사람만 남겨보기
SELECT user_id, sum(price*amount) FROM buytbl GROUP BY user_id 
HAVING sum(price*amount) > 250000;

-- 키가 평균보다 큰 사람들이 있는 지역만 출력
-- 서브쿼리 사용
SELECT addr, avg(height) FROM usertbl GROUP BY addr HAVING avg(height) >
  (SELECT avg(height) as '평균키' FROM usertbl);



-- SQL 구문의 분류

-- DML : Data Manipulation Language
-- 데이터 조작언어로 SELECT, INSERT, UPDATE, DELETE 구문을 의미
-- 테이블의 데이터를 조회하거나 변경하기 위해서 사용한다.

-- DDL : Data Definition Language
-- 데이터 정의언어로 데이터베이스, 테이블, 뷰, 인덱스 등을 생성하고,
-- 삭제하는 구문으로 CREATE, DROP, ALTER 가 있다.
-- DML과는 달리 commit; 없이도 바로 서버에 반영된다.

-- DCL : Data Control Language
-- 데이터 제어언어로 특정 계정에 대한 권한을 부여하거나 뻇을 떄 사용한다.
-- GRANT, REVOKE, DENY 등이 있다.


-- 테이블 생성
CREATE TABLE testtbl1(
		id int, 
		user_name varchar(3),
		age int
	);

-- 테이블명 뒤에 컬럼정보를 적지 않으면, CREATE TABLE시 설정한
-- 컬럼 정보가 순서대로 대입된다.
INSERT INTO testtbl1 VALUES(1,'홍길동',25);

-- id와 이름쪽에만 데이터를 넣을 때에는 컬럼명을 생략할 수 없다.
INSERT INTO testtbl1(id, user_name) VALUES(2,'정길동');

-- 만약 컬럼명 지정을 안 했지만 age에는 null을 넣고 싶다면
INSERT INTO testtbl1 VALUES(3,'이길동',null);

-- 만약 입력하는 컬럼(열)의 순서를 바꿔서 지정하는 경우(id,user_name,age가 아닌 순으로 넣음)
-- 모든 컬럼에 값을 입력하는 상황이어도 컬럼명을 따로 기입해야한다.
INSERT INTO testtbl1(age, id, user_name) VALUES(19,4,'임길동');

SELECT * FROM testtbl1;








