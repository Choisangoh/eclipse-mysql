-- 권한 뺏기
-- GRANT 들어갈 자리에 REVOKE 사용
-- 단, REVOKE는 GRANT와 TO FROM과 연동해서 쓴다.
-- REVOKE 권한명... ON DB이름.테이블이름 FROM 계정명;


-- [조인(JOIN)]
-- 테이블 2개를 합치는 기능
-- 연관된 데이터를 여러 테이블에 나눠담았을때
-- 그것을 다시 재조합해준다.
-- 조인 문법
-- SELECT 테이블1.컬럼1, 테이블1.컬럼2, 테이블2.컬럼1, 테이블2.컬럼2...
--      FROM 테이블1 JOIN구문 테이블2
--      ON 테이블1.공통컬럼 =  테이블2.공통컬럼;
--      WHERE구문은 ON으로 합쳐진 결과컬럼에 대한 필터링을 해준다.
use ict_practice;
SELECT * FROM buytbl INNER JOIN usertbl ON buytbl.user_id = usertbl.user_id;
SELECT * FROM usertbl;
SELECT * FROM buytbl;
-- 'user_id'라는 공통컬럼(join할때 필수로 있어야됨)이므로  buytbl과 usertbl을 연결해주는 단서

-- 지금 현재 구매자 정보를 조회하려고 하는데, 필요한 정보는
-- buytbl의 구매 물품정보 전체에, 구매자 정보는 택배를 받기 위해
-- 이름, 주소, 휴대폰번호만 있으면 되는 상황이다.
SELECT buytbl.order_number, buytbl.user_id, buytbl.prod_name, buytbl.group_name, 
buytbl.price, buytbl.amount, usertbl.user_name, usertbl.addr, usertbl.phone_number 
FROM buytbl INNER JOIN usertbl ON buytbl.user_id = usertbl.user_id;

-- 위의 경우처럼 특정 테이블 전체 데이터를 출력하는 경우에는
-- 테이블명.*로 가능하다.
SELECT buytbl.*, usertbl.user_name, usertbl.addr, usertbl.phone_number 
FROM buytbl INNER JOIN usertbl ON buytbl.user_id = usertbl.user_id;

-- FROM구문에서 테이블명 띄고 별명 형식으로 적을 경우는
-- 테이블명을 다 적지않고 별명으로 대체해서 호출할 수 있어서 더 편리하다.
SELECT b.order_number, b.user_id, b.prod_name, b.group_name,
b.price, b.amount, u.user_name, u.addr, u.phone_number
FROM buytbl b INNER JOIN usertbl u ON b.user_id = u.user_id;


-- WHERE절은 먼저 JOIN구문의 결과가 나온 상태에서, 추가 필터링만을 담당한다.
-- 구매물품의 가격이 210000이상만 남기는 구문
SELECT b.order_number, b.user_id, b.prod_name, b.group_name,
b.price, b.amount, u.user_name, u.addr, u.phone_number
FROM buytbl b INNER JOIN usertbl u ON b.user_id = u.user_id
WHERE price >= 210000;

-- 위쪽 JOIN구문을 활용하되, 가격이 200000이하인 품목만 남기고
-- 그 품목들을 가격순으로 내림차순해서 출력해보기
SELECT b.order_number, b.user_id, b.prod_name, b.group_name,
b.price, b.amount, u.user_name, u.addr, u.phone_number
FROM buytbl b INNER JOIN usertbl u ON b.user_id = u.user_id
WHERE price <= 200000 ORDER BY b.price DESC;


-- LEFT JOIN, RIGHT JOIN은 공통데이터가 아닌 데이터도 방향에 따라 
-- 출력이 되기 때문에 공통데이터(INNER)가 아닌 데이터(OUTER)까지
-- 출력되는 점을 이용해 OUTER JOIN이라고 부른다.
-- LEFT OUTER JOIN은 JOIN구문의 왼쪽 테이블의 자료는 모두 출력하고
-- 오른쪽 테이블 데이터는 왼쪽 기준컬럼이 일치 시에만 출력한다.
-- 반대로 RIGHT OUTER JOIN은 JOIN구문의 오른쪽 테이블의 자료는 모두 출력하고
-- 왼쪽 테이블 데이터는 왼쪽 기준컬럼이 일치 시에만 출력한다.
SELECT * FROM usertbl; -- 회원 11명
SELECT * FROM buytbl; -- 구매 이력있는 회원은 5명

-- LEFT OUTER JOIN인데, usertbl을 LEFT에, buytbl을 RIGHT에 두고 작성하세요.
-- INNER JOIN을 넣은 자리에 대신 LEFT OUTER JOIN으로 고쳐주기만 하면 작동한다.
-- 테이블의 컬럼은 전체 출력한다.
SELECT * FROM usertbl LEFT OUTER JOIN buytbl ON buytbl.user_id = usertbl.user_id;
-- RIGHT OUTER JOIN 경우 buytbl을 LEFT에, usertbl을 RIGHT에 두고 작성하세요.
SELECT * FROM buytbl RIGHT OUTER JOIN usertbl ON buytbl.user_id = usertbl.user_id;

-- FULL OUTER JOIN은 누락데이터 없이 양쪽 테이블의 모든 자료를 보여준다.
-- ORACLE SQL에서는 FULL OUTER JOIN을 구문으로 지원하지만 MYSQL에서는 
-- FULL OUTER JOIN은 UNION 명렁어를 이용해서
-- LEFT OUTER JOIN과 RIGHT OUTER JOIN의 결과물을 합쳐서 구현한다.
-- 이 때 접점이 없는 데이터는 반대쪽 데이터를 null로 표시된다.
-- UNION은 위쪽 결과물과 아래쪽 결과물을 합쳐준다.
SELECT * FROM buytbl b LEFT OUTER JOIN usertbl u ON b.user_id = u.user_id
     UNION -- UNION은 위 아래 결과 화면을 합쳐준다. (LEFT, RIGHT 사이에 넣으면 됨)
SELECT * FROM buytbl b RIGHT OUTER JOIN usertbl u ON b.user_id = u.user_id;

-- FULL OUTER JOIN 이해를 돕기 위해 추가 데이터 생성
CREATE TABLE student(
	user_name varchar(3) primary key,
	user_addr char(2) not null
 );
CREATE TABLE membership(
   user_name varchar(3) primary key,
   user_point int not null
);

INSERT INTO student VALUES ('김삼성', '서울');
INSERT INTO student VALUES ('이롯데', '부산');
INSERT INTO student VALUES ('박한화', '수원');
SELECT * FROM student;

INSERT INTO membership VALUES ('김삼성', 15000);
INSERT INTO membership VALUES ('이롯데', 37000);
INSERT INTO membership VALUES ('정엘지', 500);
SELECT * FROM membership;

-- LEFT OUTER JOIN, RIGHT OUTER JOIN 실행구문
SELECT * FROM student s LEFT OUTER JOIN membership m ON s.user_name = m.user_name;
SELECT * FROM student s RIGHT OUTER JOIN membership m ON s.user_name = m.user_name;
-- FULL OUTER JOIN 실행구문 (UNION 사용)
SELECT * FROM student s LEFT OUTER JOIN membership m ON s.user_name = m.user_name
UNION
SELECT * FROM student s RIGHT OUTER JOIN membership m ON s.user_name = m.user_name;
-- 위에 UNION으로 처리되는 구문은 user_name이 두번 출력되는 문제가 있다.
-- 한번만 출력되도록 해보세요.
SELECT m.user_name, s.user_addr, m.user_point FROM student s 
RIGHT OUTER JOIN membership m ON s.user_name = m.user_name
UNION
SELECT s.user_name, s.user_addr, m.user_point FROM student s 
LEFT OUTER JOIN membership m ON s.user_name = m.user_name;
