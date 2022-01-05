 use ict_practice;
 
 SELECT * FROM testtbl1;
 
 -- 지금 testtbl1 경우 id를 수동으로 입력해주고 있다.
 -- 이 경우 매번 id값을 사용자가 계산해서 insert해야기 떄문에
 -- 굉장히 불편한데 auto_increment 속성을 컬럼에 걸어주면
 -- 데이터를 입력받지 못한다면 컴퓨터가 순차적으로 컬럼에 중복되지 않고
 -- 증가하는 숫자를 자동 입력해준다
 
 CREATE TABLE testtbl2 (
   id int auto_increment primary key,
   user_name varchar(3),
   age int
);
  -- id컬럼에는 auto_increment가 붙어있으므로 null로 처리해도
  -- 자동으로 1부터 숫자가 1씩 증가한다.
 INSERT INTO testtbl2 VALUES(null, '양', 4);
 INSERT INTO testtbl2 VALUES(null, '소', 2);
 INSERT INTO testtbl2 VALUES(null, '말', 1);

-- 현재 3개의 데이터가 들어갔으므로 auto_increment의 다음 값은 4이다.
SELECT * FROM testtbl2;

-- auto_increment의 기준값은 1부터 1씩 자동으로 증가하지만
-- 만약 사용자가 임의로 값을 바꾸고 싶다면 ALTER TABLE을 이용해
-- auto_increment의 값을 수정할 수 있다

-- auto_increment의 현재 값을 1000으로 수정하는 구문
ALTER TABLE testtbl2 auto_increment = 1000;
INSERT INTO testtbl2 VALUES(null, '곰', 10);
INSERT INTO testtbl2 VALUES(null, '사자', 3);

-- CMD(커멘드라인)에서 testtbl2 컬럼에 데이터를 3개 더 입력하고 조회해보기.
-- CMD에서 데이터 3개를 추가했으면 MYSQL에서도 나오는지 확인
SELECT * FROM testtbl2;

-- auto_increment는 기본 1씩 증가하는데
-- 이 증가분을 수정하고 싶다면 서버측 변수인
-- @@auto_increment_increment를 바꿔야 한다.
-- @@auto_increment_increment를 바꾸면 전체 테이블에 적용된다.
CREATE TABLE testtbl3 (
   id int auto_increment primary key,
   user_name varchar(3),
   age int
);
-- testtbl3의 초기 auto_increment 값을 1500으로 수정해보기
ALTER TABLE testtbl3 auto_increment = 1500;

-- 증가분을 1이 아닌 3으로 세팅하는법
set @@auto_increment_increment = 3;

-- 동물 3마리 testtbl3에 추가
INSERT INTO testtbl3 VALUES(null, '기린', 4);
INSERT INTO testtbl3 VALUES(null, '하마', 2);
INSERT INTO testtbl3 VALUES(null, '수달', 1);
SELECT * FROM testtbl3;

-- testtbl2도 3씩 증가하는 확인하기 위해 동물 3마리 추가하고 확인
INSERT INTO testtbl2 VALUES(null, '치타', 3);
INSERT INTO testtbl2 VALUES(null, '늑대', 5);
INSERT INTO testtbl2 VALUES(null, '표범', 2);
SELECT * FROM testtbl2;

-- 증가분을 3에서 다시 1로 세팅
set @@auto_increment_increment = 1;
-- CMD에서 동물 추가해서 testtbl2도 다시 1씩 증가하는지 확인
SELECT * FROM testtbl2;

-- 하나의 INSERT INTO구문으로 여러 row를 추가할때는 VALUES 뒤쪽에 ,을 이용해 쭉 작성한다.
INSERT INTO testtbl2 VALUES(null,'오리',1), (null,'사슴',1), (null,'알파카',1);
SELECT * FROM testtbl2;

-- UPDATE 구문은 기존에 입력되어 있는 값을 변경할 때 사용한다.
-- WHERE 조건절을 걸지 않는다면, 컬럼 하나의 값을 전부 바꾼다.
-- 따라서 일반적으로는 무조건 조건절과 조합해서 사용한다.
-- UPDATE 테이블명 SET 컬럼1=바꿀값1, 컬럼2=바꿀값2...;

-- testtbl2의 user_name을 전부 '소'로 바꾸는 구문
-- UPDATE testtbl2 SET user_name = '소'; 이렇게하면 SET sql_safe_updates = 1; 활성이므로 에러 발생, 
-- CMD에서는 가능하므로 CMD에서 실행
SELECT * FROM testtbl2;
-- SET sql_safe_updates = 0;으로 바꿔서 전부 '말'로 바꿔보기
SET sql_safe_updates = 0;
UPDATE testtbl2 SET user_name = '말';

-- 특정 나이대의 user_name을 좋아하는 동물로 교체해보기
-- WHERE을 이용해 age를 필터링하기
-- between 사용해서 특정 나이대 지정
UPDATE testtbl2 SET user_name = '강아지' WHERE age between 0 and 2;

-- UPDATE구문이 전체 컬럼에 적용될 수 있다는것을 응용해 특정 컬럼의 값을 일괄적으로
-- 계산식에 따라 새로운 결과값으로 갱신하는것도 가능하다.
-- testtbl2의 나이를 2배 늘려보기
UPDATE testtbl2 SET age = age*2;
-- 다시 원래 나이로 되돌리기
UPDATE testtbl2 SET age = age/2;

-- DELETE FROM 구문은 데이터를 삭제하는 구문이다.
-- SELECT는 특정 컬럼들만 조회하거나, 전체를 모두 조회하는 등의
-- 경우의 수가 있었기 때문에 SELECT와 FROM 사이에 구체적인 컬럼명이나,
-- 혹은 *을 붙여서 전체 컬럼을 조회했다.
-- DELETE 특정 컬럼만 삭제하는 경우가 없고 삭제할거면 
-- 전체 row를 삭제하거나,삭제를 안하거나 두가지 경우만 있어서
-- DELETE와 FROM 사이에 아무것도 적지 않는다.
-- DELETE 역시 일반적으로는 WHERE절과 함께 사용한다.
-- WHERE 없이 사용시 해당 테이블의 전체 데이터를 다 삭제한다.

-- id가 1인 데이터 삭제 해보기(WHERE사용)
DELETE FROM testtbl2 WHERE id = 1;
SELECT * FROM testtbl2;

-- limit을 사용하면 상위 n개만 삭제 가능
-- 검색 결과물 중 상위 2개 삭제해보기
DELETE FROM testtbl2 limit 2;

-- WHERE절 없이 DELETE해서 테이블 내의 전체 데이터 삭제해보기
DELETE FROM testtbl2;

-- DELETE FROM은 삭제 할 때 시간이 조금 더 오래 걸리는 편인데 
-- 이유는 트랜잭션 로그라는것을 한 로우마다 작성하기 떄문이다.
-- 따라서 속도를 끌어올리고 싶다면 TRUNCATE TABLE를 DELETE FROM 대신 쓰는 경우도 있다.
TRUNCATE TABLE testtbl2;

-- TRUNCATE와 DELETE FROM의 속도차이을 체험보기 위해
-- employees 테이블의 자료를 복사해보겠음
CREATE TABLE testtbl4 (
   id int,
   first_name varchar(50),
   last_name varchar(50)
);
INSERT INTO testtbl4 (SELECT emp_no, first_name, last_name FROM employees.employees);
-- 괄호 안에 자료들을 먼저 조회하고,
-- 조회가 끝난 데이터를 testtbl4에 복사해서 저장해줌
SELECT * FROM testtbl4;
-- CMD에서 DELETE FROM으로 삭제후 소요시간 체크 (17.10초 / 30024 row 이력 남음)
-- CMD에서 TRUNCATE TABLE로 삭제후 소요시간 체크 (1.05초 / 0 row 이력 남음)


-- 조건부로 데이터 입력하기
-- 예를 들어 100개의 데이터를 입력하려고 할때 첫번쨰 자료만
-- 기존 데이터의 id와 중복되는 값이 있고, 이후 99 건은 pk가 중복되지 않는다 해도
-- SQL 시스템 상 전체 데이터가 입력되지 않는 문제가 발생한다.
-- 따라서 이 때 중복되는 데이터 1건은 중복된다면 무시하고
-- 이후 나머지 99개 데이터는 중단 없이 정상적으로 입력하도록 만들 수 있다.
CREATE TABLE membertbl (
   user_id varchar(6) primary key,
   user_name varchar(3) not null,
   addr varchar(3) not null
);
-- MYSQL은 구문을 통쨰로 묶어서 실행할 경우 모두 실행하거나 모두 실행하지 않거나 두개의 경우뿐이다.
INSERT INTO membertbl VALUES('Son', '손흥민', '대구');
INSERT INTO membertbl VALUES('Ki', '기성용', '서울');
INSERT INTO membertbl VALUES('Park', '박지성', '부산');

-- 추가 데이터를 입력하되 한 건은 중복, 두건은 중복 없도록 입력하면 중복되는 것 때문에 에러 발생
INSERT INTO membertbl VALUES('Son', '손흥민', '대구');
INSERT INTO membertbl VALUES('Cso', '최상오', '미국');
INSERT INTO membertbl VALUES('Jo', '조현우', '울산');

-- 만약 primary key가 겹치면 무시하고 입력해주는 코드로 변환할 때는 INSERT와 INTO사이에 ignore 입력
INSERT ignore INTO membertbl VALUES('Son', '손흥민', '대구');
INSERT ignore INTO membertbl VALUES('Cso', '최상오', '미국');
INSERT ignore INTO membertbl VALUES('Jo', '조현우', '울산');

-- ignore는 기존 데이터를 유지하고 신규데이터를 막는 구문이었는데
-- 이미 존재하는 데이터를 신규데이터로 갱신해서 넣고 싶은 경우에는
-- ON DUPLICATE KEY UPDATE 구문을 쓰면 된다.
INSERT INTO membertbl VALUES('Park', '박주영', '제주');
INSERT INTO membertbl VALUES('Park', '박주영', '제주')
  ON DUPLICATE KEY UPDATE user_name = '박주영', addr = '제주';
  
SELECT * FROM membertbl;

-- ON DUPLICATE KEY UPDATE는 자료가 없으면 INSERT INTO에 적힌 대로 데이터를 넣고
-- 자료가 겹친 경우에 ON DUPLICATE KEY UPDATE를 실행하는 구문이기 떄문에
-- 만약 데이터가 겹치지 않아도 잘 작동한다.
-- 기존 테이블 요소와 겹치지 않는것을 넣어서 잘 들어가는지 CMD에서 실행후 조회
SELECT * FROM membertbl;


-- [사용자 관리하기]
-- 현재 root계정은 모든 권한(수정, 삭제, 조회, 변경, 계정생성 등)을 가진 계정이다.
-- 그렇지만 모든 사람이 모든 권한을 가지는 일은 그만큼 DB접근이 용이해져 위험을 내포하고 있고,
-- 작년 초에도 유명 게임사에서 DB를 날려먹는 사건이 발생한 만큼
-- 일정 규모 이상의 개발사에서는 직급이나 권한별로 DB계정을 나눠서 관리한다.
-- 이제 root가 아닌 사용자를 만들고, 그 사용자에 대해
-- 권한부여를 하는 방법과 권한 개념에 대해 알아보겠음.

-- workbench에서 계정생성 및 권한부여하기
-- 1. 좌측의 navigator에서 Administration 클릭
-- 2. Users and Privileges 클릭
-- 3. 열리는 화면에서 좌하단 Add Account 클릭 후
-- Login name, password 등을 입력
-- 4. 우하단 apply를 누르면 계정생성 완료
-- 5. Account Limits는 시간당 기능 사용 가능 횟수를 설정
-- 6. Administrative Roles는 어떤 권한을 가질건지 설정

-- CMD 환경에서 생성하는 경우는
-- CREATE USER 계정명@'%' IDENTIFIED BY '비밀번호';
-- GRANT ALL on *.* TO 계정명@'%' WITH GRANT OPTION;
-- 위 두 줄을 이용ㅇ해서 생성 가능하다.
-- CMD에서 새로운 계정 만들어보기 (계정명 ict2, 비밀번호 ictICT)

-- 계정 접속 방법
-- CMD 접속시 mysql -u 계정명 -p로 연결 가능
-- 접속 후 show databases; 이용해서 DB목록 확인 가능
-- use mysql; 입력하고 
-- SELECT user, host FROM user; 할 경우 생성된 계정목록 조회가능
show databases; -- DB목록 조회


-- workbench에서 계정 권한 주기
-- Navigator하단 Administration에서 유저 선택 후 Administrative Roles에서 주고싶은 권한을
-- 체크해주면 됨(DBA 선택시 모든 권한 획득)

-- 새로운 계정 만들어서 (계정명 icttest, 비밀번호 ictICT03)
-- CMD에서 계정에게 전체가 아닌 일부 권한만 주기
-- GRANT 권한1, 권한2... ON DB명.테이블명 TO 아이디@'%';
-- ict_practice 데이터베이스의 testtbl3 테이블에 대한 SELECT, DELETE 권한만 주도록
-- 부여한다면  GRANT SELECT, DELETE on ict_practice.testtbl3 TO icttest@'%';
-- GTANT <권한1, 권한2...> ON DB명.테이블명 TO 계정명@'%';














