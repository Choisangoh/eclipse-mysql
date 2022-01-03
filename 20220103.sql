-- 스키마를 ict_practice 쓰도록 해주기.
use ict_practice;

-- 앞에 스키마명을 추가로 입력해 스키마명.테이블명으로 조회도 가능하다.
SELECT * FROM usertbl;

-- 유저를 두명 더 추가
-- 정보는 전부 알아서 하고, 한명의 키는 160대로 입력.
INSERT INTO usertbl VALUES('Hwang','황희찬','1993','잉글랜드','01055556666','170','2022-01-03');
INSERT INTO usertbl VALUES('Ki','기성용','2000','서울','01077778888','175','2022-01-05');

-- 새로 추가한 2명의 구매내역을 추가
-- 2명 구매내역 합산 3개를 추가
SELECT * FROM buytbl;
INSERT INTO buytbl VALUES(null,'Hwang','축구화','스포츠',500000,1);
INSERT INTO buytbl VALUES(null,'Ki','양말','패션',15000,1);
INSERT INTO buytbl VALUES(null,'Ki','바지','패션',200000,1);

-- 지금까지의 SELECT구문은 조건 없이 모든 데이터를 다 조회했다.
-- 극단적인 경우 employees 테이블의 모든 row를 조회하다보니
-- 조회시간이 굉장히 오래걸리는 케이스가 있었다.
-- 따라서 조건에 맞도록 필터링을 할 수 있고, 이를 위해 사용하는 구문은 WHERE 구문이다.
-- SELECT 컬럼명1, 컬럼명2, .... FROM 테이블명 WHERE 컬럼명=조건식;

-- 아래는 이름이 손흥민인 사람만 조회하는 구문이다.
SELECT * FROM usertbl WHERE user_name = '손흥민';
-- 서울에 사는 사람 조회.
SELECT * FROM usertbl WHERE addr = '서울';

-- 관계연산자를 이용해서 대소비교(숫자 자료만 가능)를 하거나 
-- and, or 을 이용해 조건 여러개를 연결할 수 있다.

-- 키 170이상인 사람만 조회.
SELECT * FROM usertbl WHERE height >= 170;

-- and를 이용해 91~99년생까지만 조회하는 구문 만들기
SELECT * FROM usertbl WHERE (birth_year >= 1991) and (birth_year <= 1999);
-- between ~ and 구문을 이용하면 birth_year을 한번만 적어도 가능하다.alter
SELECT * FROM usertbl WHERE birth_year between 1991 and 1999;

-- 위와 같이 숫자는 연속된 범위를 갖기 떄문에 범위연산자로 처리가 가능하지만
-- addr같은 자료는 서울이 크다던가 영국이 작다던가 하는 연산 처리가 불가능하다.

-- or를 이용해 지역이 서울이거나 영국인 사람의 정보를 WHERE로 조회.
SELECT * FROM usertbl WHERE (addr = '서울') or (addr = '영국');

-- in키워드를 사용하면 컬러명 in (데이터1, 2, 3, 4 ... );
-- 특성 컬럼에 괄호에 담긴 데이터가 포함되는 경우를 전부 출력한다.

-- 서울, 영국, 스페인에 있는 사람들만 in 키워드로 조회.
SELECT * FROM usertbl WHERE addr in ('서울', '영국', '스페인');

-- like 연산자는 일종의 표현 양식을 만들어준다.
-- like 연산자를 이용하면 % 라고 불리는 와일드카드나 혹은 _ 라고 불리는 
-- 와일드카드 문자를 이용해 매칭되는 문자나 문자열을 찾는다.

-- 최씨를 찾는 경우(% 는 몇글자가 오더라도 상관없음)
-- 아래 구문은 최로 시작하는 모든 요소를 다 가져온다, '최'도 포함
SELECT * FROM usertbl WHERE user_name like '최%';

-- %를 이용해 휴대폰 번호가 01로 시작하는 모든 사람 조회.
SELECT * FROM usertbl WHERE phone_number like '01%';

-- 두글자만 찾는 케이스 ( _ 는 하나에 한글자씩)
SELECT * FROM usertbl WHERE addr like '____';

-- _를 이용해 유저 아이디가 3글자이면서 o로 끝나는 사람 조회.
SELECT * FROM usertbl WHERE user_id like '__o';

-- 서브쿼리(하위쿼리)란 1차적 결과를 얻어놓고, 
-- 거기서 다시 조회구문을 중첩해서 날리는것을 의미한다.

-- 이강인보다 키카 큰 사람을 조회하는 예시

-- 원시적인 방법
-- 1. 이강인의 키를 WHERE 이용해 확인한다.
SELECT height FROM usertbl WHERE user_name = '이강인';
-- 2. 확인한 이강인의 키를 쿼리문에 넣는다
-- 172보다 큰 사람의 이름과 키만 조회.
SELECT user_name, height FROM usertbl WHERE height > 172;

-- 서브쿼리 활용방법
-- 서브쿼리는 ()를 이용해
-- SELECT 구문을 한번 더 활용한다.
SELECT user_name, height FROM usertbl WHERE height > 
    (SELECT height FROM usertbl WHERE user_name = '이강인');
    
-- 서브쿼리를 활용해 '최상오'보다 먼저 태어난 사람들만 골라보세요.
-- 1. 최상오의 생년을 얻는 쿼리문
SELECT birth_year FROM usertbl WHERE user_name = '최상오';
-- 2. 입력할 생년보다 더 작은 생년을 가진 요소만 출력하는 쿼리문
SELECT user_name, birth_year FROM usertbl WHERE birth_year <
  (SELECT birth_year FROM usertbl WHERE user_name = '최상오'); 

-- 최대값은 max()로 구한다.
-- 아래는 현재 user_id컬럼에서 가장 나이가 적은 사람의 생년 조회.
SELECT max(birth_year) FROM usertbl;

-- user_id에 K가 포함된 사람들 중 키가 제일 작은사람보다
-- 키가 더 큰 사람을 구하시오,(min을 활용)
SELECT * FROM usertbl WHERE height > 
  (SELECT min(height) FROM usertbl WHERE user_id like '%K%'); 


-- 2022년 가입자중에서 가입일이 제일 빠른 사람보다 키가 큰 사람 조회.
-- 날짜도 부등호로 조회 가능 (작다: 이전날짜, 크다: 이후날짜)

-- 1. 2021년 가입자중 가이일이 제일 빠른 사람의 가입일자 구하기.
SELECT min(reg_date) FROM usertbl WHERE reg_date >= '2022-01-01';
-- 2. 1의 쿼리문 조건으로 가입일이 제일 빠른 사람의 키 구하기.
SELECT height FROM usertbl WHERE reg_date =
  (SELECT min(reg_date) FROM usertbl WHERE reg_date >= '2022-01-01');
-- 3. 2에서 구한 키를 조건으로 해서 최종명단 얻기.
SELECT * FROM usertbl WHERE height >
 (SELECT height FROM usertbl WHERE reg_date =
    (SELECT min(reg_date) FROM usertbl WHERE reg_date >= '2022-01-01'));
    
    -- 서브쿼리나 삼중쿼리 등 무조건 가장 안쪽 ()부터 바깥쪽 ()순으로 실행
    
-- 유저 다섯명 추가 
INSERT INTO usertbl VALUES('KJV','김자바','1983','강원','01099998888','182','2021-12-25');
INSERT INTO usertbl VALUES('ADR','압둘라','1995','서울','01088887777','185','2021-09-22');
INSERT INTO usertbl VALUES('YSO','야스오','1987','경기','01077776666','187','2022-12-31');
INSERT INTO usertbl VALUES('ZYA','장위안','1988','부산','01066665555','173','2021-12-21');
INSERT INTO usertbl VALUES('SPR','스프링','1990','부산','01055553333','177','2022-03-05');
INSERT INTO usertbl VALUES('JSP','쟈스피','1994','전라','01033332222','169','2021-07-20');

-- ANY, ALL, SOME 구문은 서브쿼리와 조합해서 사용한다.
-- 지역이 서울인 사람보다 키가 작은 사람을 찾는 쿼리문
-- 1. 서울사람의 키 전체 리스트 조회.
SELECT height FROM usertbl WHERE addr = '서울';
-- 위 구문을 서브쿼리로 해서 서울사람보다 키가작은 사람을 찾을 경우 에러가 난다.
-- 현재 데이터셋은 결과가 185,180,163 3개인데 어느 데이터를 기반으로
-- height을 조건에 잡아줄지 애매하기 때문에 에러가 발생하는 이유
SELECT * FROM usertbl WHERE height <
  (SELECT height FROM usertbl WHERE addr = '서울');

-- ANY 구문을 사용하면 163, 180, 185 모든 데이터에 대해 OR로 처리가 된다.
-- 개별값 모두에 대해 OR처리가 붙고, 그래서 아래와 같이 
-- (height < 163) OR (height < 180) OR (height < 185)
-- 3개 조건이 OR로 연결된다.
-- ANY는 OR로 연결된다는 특성상 범위가 가장 넓은 조건 하나로 통일한다.
-- ex) 아래 코드는 185보다 작은 데이터가 전부 잡혀나온다.
SELECT * FROM usertbl WHERE height < ANY
  (SELECT height FROM usertbl WHERE addr = '서울');
  
  -- ANY와 SOME은 사실상 차이가 없는 구문이라고 봐도 무방하다.
  -- ANY자리에 SOME을 대신 넣어도 똑같이 작동한다.

-- ALL 구문을 사용하면 163, 180, 185 모든 데이터에 대해 AND로 처리된다.
-- 개별값 모두에 대해 AND처리가 붙고 그래서 아래와 같이
-- (height < 163) AND (height < 180) AND (height < 185)
-- 3개의 조건을 다 만족하는 해야한다.
SELECT * FROM usertbl WHERE height < ALL
  (SELECT height FROM usertbl WHERE addr = '서울');
-- ALL는 AND로 연결된다는 특성 163보다 작은 값만 TRUE로 판정한다.









