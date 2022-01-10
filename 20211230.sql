/* 1. 데이터베이스 생성 명령
DB생성 시 한글을 쓸 수 있도록 -> default character set utf8; */
create database ict_practice default character set utf8;

/* 우측 하단의 schemas 클릭 후, 새로고침 후 ict_pratice 우클릭
-> set as default schema 클릭하세요. 이러면 현재 명령을 받을 DB로 지정된다. */

/* default schema 지정은 명령어로도 가능하다.
use 스키마명; 을 사용하면 좌측 schema에서 우클릭 후 default스키마 지정한 효과를 낼 수 있다. */
use sys;
use ict_practice; 

/* 테이블 생성 명령
primary key - 컬럼의 주요 키를 뜻하며, 중복데이터를 방지한다.
테이블 내의 하나의 컬럼은 반드시 primary key 속성을 가져야 한다.
not null -> 데이터에 null 값이 들어오는 것을 방지한다. */
/* 테이블은 클래스랑 구조가 비슷하다, 클래스 내부의 맴버변수를 지정하듯
테이블 요소를 지정해 줄 수 있다. */
/* varchar는 자바의 String 역할 */
CREATE TABLE users(
   id varchar(20) primary key, 
   pw varchar(20) not null,
   user_name varchar(30) not null,
   email varchar(80) 
   ); 
   
   /* 데이터 적재하기
   INSERT INTO 테이블명 (컬럼1, 컬럼2...) VALUES (컴럼1값, 컬럼2값, ...);
   만약 모든 컬럼을 대상으로 지정 시 컬럼은 생략하고 VALUES 이후 값만 지정 할 수 있다.
   INSERT INTO 테이블명 VALUES(컬럼1값, 컬럼2값, ....); */
   INSERT INTO users (id, pw, user_name, email) VALUES
   ('asd000','qwer','자바자바','asd000@naver.com');
   
   INSERT INTO users VALUES ('aaa111','123','가나','aaa@naver.com');
   
   -- 한 줄 주석은 자바와 달리 -- 내용을 적어 작성할 수 있다.
   -- 직접 계정 3개를 넣어 주되, 1개 계정은 이메일을 생략하고 넣어주세요.
    INSERT INTO users VALUES ('bbb222','456','다라','bbb@naver.com');
	INSERT INTO users VALUES ('ccc333','789','마바','ccc@naver.com');
	INSERT INTO users (id, pw, user_name) VALUES ('eee555','000','사아');
   
   /* 데이터 조회하기
   SELECT 컬럼1, 컬럼2, ... FROM 테이블명;
   을 적으면 테이블에 적재된 데이터 조회 가능
   SELECT * FROM 테이블명; 으로 조회시 해당 테이블의 컬럼 조회 가능*/
   SELECT * FROM users;
   SELECT id, pw, user_name, email FROM users;
   
   
   -- 조회구문에 조건을 걸기 위해서 WHERE이라는 구문을 사용한다.
   -- SELECT 조회컬럼 FROM 테이블명 WHERE 컬럼명 = '조건에 맞는 값';
   -- 이름이 자바자바인 사람만 출력하기
   SELECT * FROM users WHERE user_name = '자바자바';
   -- 아이디가 aaa111인 사람을 출력해보세요.
   SELECT * FROM users WHERE id = 'aaa111';
   
   -- 조건 여러개를 걸 경우 AND, OR 키워드를 쓰면 된다.
   -- 아이디가 bbb222이거나 혹은 유저이름이 사아인 것들 얻어오기
   SELECT * FROM users WHERE id = 'bbb222' OR user_name = '사아';
   
   /* 데이터 수정하기
   UPDATE 테이블명 SET 컬럼명1='값1' 컬럼명2='값2'...;
   주의점! WHERE 구문 없이 사용하면 일괄적으로 컬럼내의 모든 값이 바뀐다. */
   UPDATE users SET pw = 'pppp';
   SET SQL_SAFE_UPDATES = 0; -- 0이면 비활성, 1이면 다시 safety모드 활성화
   SELECT * FROM users;
   
-- WHERE 구문을 이용해서 pw컬럼의 값을 모두 다르게 바꿔보기.
   UPDATE users SET pw = '123' WHERE id = 'aaa111';
   UPDATE users SET pw = 'qwer' WHERE id = 'asd000';
   UPDATE users SET pw = '456' WHERE id = 'bbb222';
   UPDATE users SET pw = '789' WHERE id = 'ccc333';
   UPDATE users SET pw = '000', user_name = '가나다라마바' WHERE id = 'eee555';
   
   -- 데이터 삭제
   /* DELETE FROM 테이블명; 을 할경우 테이블 전체 데이터가 싹 다 날아간다.
   DELETE구문 역시 WHERE과 조합해서 사용해야 한다. */
   DELETE FROM users WHERE id = 'q';
   SELECT * FROM users;
   
   -- 도서관 DB 구성 / table이름은 library
   CREATE TABLE library(
   -- 내장데이터
   book_name varchar(30) primary key,
   book_price int(7) not null,
   book_pub varchar(20) not null,
   book_writer varchar(10) not null,
   book_page int(5) not null
   );
   
   INSERT INTO library VALUES ('부의 추월차선','15000','가','엠재이 드마코','300');
   INSERT INTO library VALUES ('데미안','13000','나','데미안1','290');
   INSERT INTO library VALUES ('월급쟁이부자로 은퇴하라','14000','다','너나위','280');
   INSERT INTO library VALUES ('나는 부동산과 맞벌이한다','16000','라','너나부','270');
   INSERT INTO library VALUES ('인간관계론','17000','마','카네기','260');
   INSERT INTO library VALUES ('나미야잡화점의 기적','18000','바','나미야1','250');
   SELECT * FROM library;sys_config
