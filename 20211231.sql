-- employees를 사용 스키마로 지정하기.
-- employees 우클릭하고 Set of Default Schema 클릭
-- 또는 use employees; 입력

-- employees 내부의 employees 테이블을 조회해주세요.
-- SQL구문은 명령구문은 무조건 대문자, 테이블명이나 호칭 등은
-- 소문자로 작성하는 것이 관례이다.
-- 무조건 지키지 않아도 실행은 가능하나, 가독성을 위해 되도록이면 지키는것이 좋다.
SELECT * FROM employees;

-- 원래 테이블 조회할때는 스키마명.테이블명으로 모두 표기해야한다.
SELECT * FROM employees.employees;

-- 스키마.테이블명으로 조회시 use중이지 않은 스키마의 테이블도 조회할 수 있다.
SELECT * FROM ict_practice.users;

-- 컬럼을 전체가 아닌 임의로 가져올때는 컬럼명을 ,로 구분한다.
-- 이 경우 모든 컬럼이 아닌 일부 컬럼난 조회할 수 있고,
-- 심지어 한 개의 컬럼만 조회하는 등 개수조절도 가능하다.
-- * 은 쓰지 않는다.
SELECT gender, first_name, last_name FROM employees;

-- CMD환경에서는 좌측 스키마처럼 스키마 목록을 보여주는 창이 없으므로
-- CMD창에 아래 명령어을 이용해 스키마 목록을 확인할 수 있다.
SHOW databases;

-- 현재 DB정보를 조회하기 위해서는
SHOW TABLE STATUS;

-- 특정 테이블이 컬럼 정보를 조회하고 싶다면 아래 명령어를 쓴다.
-- DESCRIBE 테이블명; 또는 DESC 테이블명;
DESCRIBE employees;
DESC employees;

-- ict_practice를 디폴트 스키마로 잡기.
use ict_practice;


-- primary key(주요 키)
-- 각 테이블을 대표할 수 있는 대표데이터(남들과 겹치지 않는 본인만 가지는 데이터)를 저장하는 컬럼에 붙이는 제약조건이다.
-- 모든 테이블은 무조건 하나의 primary key를 가진다.
-- primary key는 자동으로 중복을 방지하고, null도 들어올수 없으므로 not null도 겸한다.

CREATE TABLE userTbl (
   user_id varchar(8) primary key, 
   user_name varchar(10) not null,
   birth_year int(4) not null,
   addr varchar(4) not null, 
   phone_number varchar(11),
   height int(3),
   reg_date DATE
   );
   
   
-- auto_increment(자동증가)
-- int(정수)자료형이 붙은 컬럼에만 붙일 수 있고, 이게 붙은 컬럼은 자동으로 1씩 증가하는 숫자를 배정받는다.
-- 시작은 1부터 
-- INSERT INTO 구문이 실행될 때 마다 해당 컬럼에 들어갈 숫자를 자동으로 배정해준다.
-- 한번 쓴 숫자는 다시 사용되지 않는다.

-- FOREIGN KEY(외래 키)
-- 쇼핑몰의 구매자는 반드시 회원이어야 한다.
-- 특정 테이블에 존재하는 값만 해당 컬럼에 들어올 수 있도록 거는 제약조건
-- FOREIGN KEY를 거는 컬럼의 자료형과 크기는 참조하는 쪽과 원본 모두 같아야 한다.
-- 참조컬럼에 있는 값만(userTbl의 user_id에 존재하는 값만) buyTbl의 user_id에 올 수 있다.

CREATE TABLE buyTbl (
   order_number int auto_increment primary key,
   user_id varchar(8) not null,
   prod_name varchar(6) not null,
   group_name varchar(4),
   price int(7) not null,
   amount int(3) not null,
   FOREIGN KEY(user_id) REFERENCES userTbl(user_id)
   );
   
   INSERT INTO userTbl VALUES('cso','최상오','1999','서울','01012345678','180','2022-01-01');
   INSERT INTO userTbl VALUES('SON','손흥민','1992','영국','01011112222','177','2021-12-31');
   INSERT INTO userTbl VALUES('KANGIN','이강인','2001','스페인','01033334444','172','2022-01-02');
   SELECT * FROM userTbl;
   
   -- 가입한 회원이 물건 구매한 이력이 남도록 해보기.
   INSERT INTO buyTbl VALUES(null,'cso','쇼파','가구',1000000,1);
   -- order_number는 값을 null로 주변 auto_increment에 의해 자동으로 1씩 증가된 숫자를 받음
   INSERT INTO buyTbl VALUES(null,'cso','침대','침대가구',1200000,1);
   -- 없는 회원 아이디로 INSERT를 시도해보기. (userTbl에 SON이라는 아이디 없으면 불가능!)
   INSERT INTO buyTbl VALUES(null,'SON','유니폼','의류',300000,1);
   INSERT INTO buyTbl VALUES(null,'KANGIN','유니폼','의류',200000,1);
   SELECT * FROM buyTbl;
   
   -- DELETE FROM 테이블명; 을 할경우 테이블 전체 데이터가 싹 다 날아간다.
   SET SQL_SAFE_UPDATES = 0;
   DELETE FROM buyTbl WHERE price = '11000000';
   
   

   


