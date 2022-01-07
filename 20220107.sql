use ict_practice;

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


/* MYSQL에서도 프로그래밍이 가능하고
변수나 함수 등을 지정할 수 있다.
물론 자바, 파이썬, CPP 등의 프로그램밍과는 달리
제한되는 점이 많지만, 이를 활용하는 경우가 빈번하기 떄문에
먼저 변수 지정 및 출력부터 해보겠음 */

-- <MySQL에서 변수 사용하기>
-- MySQL에서 변수를 지정할때는 SET @변수명 = 값; 의 문법을 쓴다
SET @myvar1 = 5;
SET @myvar2 = 3;
SET @myvar3 = 4.25;
SET @myvar4 = '가수의 이름 =>';
-- 변수에 지정된 값을 출력 시 SELECT @변수명; 사용
SELECT @myvar4;

-- 만약 계산식 등이 있다면 SELECT 구문 실행 이전에 계산을 모두 마치고 그 결과를 화면에 보여준다.
SELECT @myvar2 + @myvar3;

-- SELECT 구문이 그렇듯 콤마(,)를 이용해서 출력데이터를 여러개 나열 가능
SELECT @myvar4, user_name FROM usertbl;

-- 일반 구문에서 limit에는 변수를 입력해서 쓸 수 없다.
SELECT * FROM usertbl limit 3;
-- SELECT * FROM usertbl limit @myvar2; (@myvar2값은 3이지만 변수이므로 불가능)


-- PREPARE 구문
-- PREPARE 구문은 가변적으로 들어갈 문장요소 자리를
-- ?로 구멍을 뚫어놓고, 그 자리를 채우는 방식으로 만든다.
-- 사용법은
-- PREPARE 구문이름 FROM '실제 쿼리문'; 방식으로 선언해두고
-- 호출은 EXECUTE 구문이름 USING 전달변수; 로 호출한다.
SET @myvar5 = 3; -- @myvar5에 3 저장
PREPARE myQuery FROM 'SELECT user_name, height FROM usertbl limit ?';
EXECUTE myQuery USING @myvar5; -- myQuery 실행하기, 저장된 구문의 ?에 값을 전달하기 위해 USING 전달값을 쓴다.


-- <MySQL의 데이터형식과 형 변환>
-- 데이터 변환 시 CAST(), CONVERT() 등의 함수를 이용해서 처리한다.
-- 두 함수의 차이점은 거의 없다.
-- 문법
-- CAST(실행문 as 바꿀자료형);
-- CONVERT(실행문, 바꿀자료형);
SELECT avg(price) as '평균가' FROM buytbl; -- 실수(double)로 나오는 평균 구매수

SELECT CAST(avg(price) as SIGNED INTEGER) as '평균가' FROM buytbl; -- double을 int로 변경

SELECT CONVERT(avg(price), SIGNED INTEGER) as '평균가' FROM buytbl; -- double을 int로 변경

-- CAST를 이용하면 날짜 양식을 통일 시킬 수 있다.
SELECT CAST('2022$01$07' as DATE);
SELECT CAST('2022/01/07' as DATE);
SELECT CAST('2022%01%07' as DATE);
SELECT CAST('2022@01@07' as DATE);
SELECT CAST('2022.01.07' as DATE);

-- Oracle SQL에서는 sysdate, MYSQL에서는 now()를 이용해서
-- 현재 시간을 확인 할 수 있다.
SELECT now();

-- <일시적 형 변환(자동 형 변환)>
SELECT '100' + 200; -- 문자와 숫자 연산 => 정수로 변환
SELECT '100' + '300'; -- 문자와 문자 연산 => 정수로 변환
SELECT '가나다' + 100 + '500'; -- 숫자로 변환할 수 없는 문자 + 정수 => 정수끼리만 연산

-- 만약 문자를 붙여서 출력하고 싶다면 concat()을 활용한다.
SELECT CONCAT('100', '200'); -- 100과200을 그대로 붙여서 100200 출력
SELECT CONCAT(100, 300); -- 100과300을 그대로 붙여서 100300 출력

-- 문자 첫 머리에 숫자가 포함 된 경우 : 첫 글자를 숫자로 변환
SELECT 3 > '2abc';
-- 문자만 있는 경우 : 0으로 변환
SELECT 1 > 'Abc';
-- 논리식의 경우 0은 false, 1은 true


-- <MySQL 내장함수>
-- CONCAT, CAST, CONVERT 등과 같이
-- 내부에 이미 선언되어있어서 바로 호출 가능한 함수들

-- if(수식, 참일때 리턴, 거짓일때 리턴)
-- 삼항연산자와 비슷하게 판단한다.
SELECT if(300>200, '참', '거짓');

-- IFNULL(수식1, 수식2)
-- 수식1이 null이 아니면 수식1 반환, 수식1이 null이면 수식2로 반환.
SELECT IFNULL(100, '널입니다'), IFNULL(null, '널입니다');

-- NULLIF(수식1, 수식2)
-- 수식1과 수식2가 같으면 null을 반환, 다르면 수식1 반환.
SELECT NULLIF(100,100), NULLIF(200,100);

-- CASE ~ WHEN ~ ELSE ~ END는
-- SWITCH ~ CASE문과 비슷하게 들어온 자료와 일치하는 구간이 있으면 출력
-- 없을떄는 ELSE쪽 자료를 출력
-- 단, SQL은 {}로 코드 시작과 끝나는 범위를 표현하지 않기 때문에
-- 구문이 끝나는 시점에 END를 써줘야 한다.
SELECT
  CASE 2 -- CASE 1로 쓰면 '일' 출력
  WHEN 1 THEN '일'
  WHEN 5 THEN '오'
  WHEN 10 THEN '십'
  ELSE '모름'
END as '결과';


-- <문자열 함수>
-- 문자열을 조작하는데 쓰고 활용도가 높은 편이다.
-- ASCII(문자), CHAR(숫자)를 넣으면
-- 문자는 숫자로, 숫자는 문자로 바뀐다.
-- CHAR()는 worlbench 버그로 인해 모든 문자가 BLOB로 표현된다.
-- 원래 값을 보려면 (입력창BLOB 우클릭 -> open value in viewer -> text 탭 선택)
SELECT ASCII('B'); -- 대문자A = 65
SELECT ASCII('B'), CHAR(41000);

-- 문자열 길이를 그떄그때 확인하기 위해서
-- CHAR_LENGTH(문자열)을 사용한다.
-- 이때 결과로 나오는 숫자는 문자열의 길이이다.
SELECT CHAR_LENGTH('가나다라마바사');
SELECT CHAR_LENGTH('sadio mane'); -- 띄어쓰기도 문자열 길이에 포함

-- CONCAT(문자열1, 문자열2....);
SELECT CONCAT('아,야,어,여,오,요,으,이,우,유');

-- CONCAT_WS(구분자, 문자열1, 문자열2....);
-- 문자열과 문자열 사이를 구분자를 이용해 붙여준다.
SELECT CONCAT_WS('--', '1', '2', '1592389');

-- FORMAT(숫자, 소수점자리를 몇 칸 나오게 할건지)
SELECT FORMAT(3.14159265, 2);

-- BIN(숫자)는 이진수
-- HEX(숫자)는 16진수 
-- OCT(숫자)는 8진수
-- 정수로 10진수 숫자를 바꿔서 표현해준다.
SELECT BIN(31), HEX(31), OCT(31);

-- INSERT(기준문자열, 위치, 길이, 삽입할 문자열);
-- 기준 문자열의 위치 ~ 길이 사이를 지우고, 그 사이에
-- 삽입할 문자열을 새로 넣어준다.
SELECT INSERT('abcdefghi', 3, 4, '@@@@@'); -- 3번부터 4개를 지우고, 지운 자리에 @@@@@ 삽입 (a는 1부터 시작)

-- LEFT(문자열, 길이), RIGHT(문자열, 길이)
-- 해당 문자열의 왼쪽, 오른쪽에서 시작해서 숫자만큼 문자열 길이를 남긴다.
SELECT LEFT('abcdefghi', 3), RIGHT('abcdefghi', 4);

-- UCASE(영문자열)는 소문자를 대문자로 
-- LCASE(영문자열)는 대문자를 소문자로
SELECT LCASE('abcDEF'), UCASE('abcDEF');
-- UPPER(문자열), LOWERE(문자열)로 줄여서 쓰기도 한다.
SELECT UPPER('abcDEF'), LOWER('abcDEF');

-- LPAD(문자열, 길이, 채울문자열), RPAD(문자열, 길이, 채울문자열)
-- 문자열을 길이만큼 늘려놓고, 빈 칸에 채울 문자열을 채워준다.
SELECT LPAD('이것', 5, '#'), RPAD('저것', 6, '@');

-- LTRIM(문자열), RTRIM(문자열)
-- 문자열의 왼쪽/오른쪽 부분의 공백을 모두 없앤다.
-- 단, 가운데 부분의 공백은 사라지지 않는다.
SELECT LTRIM('        이것'), RTRIM('저것        '); -- 공백 없음
SELECT '         이것', '저것       '; -- 공백 있음

-- TRIM(문자열), TRIM(방향 '자율문자' FROM '대상문자')
-- TRIM은 기본적으로 LTRIM + RTRIM 형식으로 양쪽 모든 공백 다 삭제한다.
-- 공백이 아닌 특정 문자를 삭제하도록 구문을 지정할 수 도 있다.
SELECT TRIM('     호롤롤     ');

-- 방향은 BOTH(양쪽), LEADING(왼쪽), TRAILING(오른쪽)
-- 중 하나를 고르면 된다.
SELECT TRIM(BOTH 'ㅋ' FROM 'ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㄹㅇㅋㅋㅋㅋㅋㅋㅋㅋㅋ');
SELECT TRIM(LEADING 'ㅋ' FROM 'ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㄹㅇ아아아아아');
SELECT TRIM(TRAILING 'ㅋ' FROM '아아아아아ㄹㅇㅋㅋㅋㅋㅋㅋㅋㅋㅋ');

-- REPEAT(문자열, 횟수)
-- 문자열을 횟수만큼 반복한다.
SELECT REPEAT('ㅋ', 3);


-- REPLACE(문자열, 원래문자열, 바꿀문자열)
-- 문자열에서 원래문자열을 찾아 바꿀문자열로 교체한다.
SELECT REPLACE('true입니다.', 'true', '참');

-- REVERSE(문자열)
-- 문자열을 인덱스 역순으로 재배치한다.
SELECT REVERSE('이효리');

-- SPACE(길이)
-- 길이만큼 공백을 사이에 넣어준다.
SELECT CONCAT('이것', SPACE(50), '저것');

-- SUBSTRING(문자열, 시작위치, 길이)
-- SUBSTRING(문자열 FROM 시작위치 FOR 길이)
-- 시작위치부터 길이만큼의 문자를 반환한다.
-- 길이를 생략하고 파라미터를 2개만 주면
-- 시작지점부터 끝까지 모든 문자를 반환한다.
SELECT SUBSTRING('자바스프링마이에스큐엘', 6, 4);
SELECT SUBSTRING('자바스프링마이에스큐엘' FROM 6 FOR 4);
SELECT SUBSTRING('자바스프링마이에스큐엘' FROM 6);


-- <SQL 프로그래밍과 프로시저>
-- SQL에서도 변수선언이 되는것을 봤지만
-- 심지어 프로그램밍도 진행할 수 있다.
-- 문법은
-- DELIMITER $$ -- (시작지점)
-- CREATE PROCEDURE 선언할 프로시저이름()
-- BEGIN -- (실제 실행코드는 비긴 아래에 작성한다.)
--      실행코드...
-- END $$
-- DELIMITER ;

-- 선언해둔 프로시저는
-- CALL 프로시저명(); 으로 호출 가능

-- IF ~ ELSE문을 프로시저로 작성 (100입니다 출력)
DELIMITER $$
CREATE PROCEDURE ifproc()
BEGIN
  DECLARE var1 INT;
  SET var1 = 100;
  IF var1 = 100 THEN
    SELECT '100입니다.';
  ELSE 
	SELECT '100이 아닙니다';
  END IF;
END $$
DELIMITER ;
CALL ifproc();

-- 프로시저 삭제는 DROP PROCEDURE 프로시저명; (프로시저명 오른쪽 ()는 뺸다.)
DROP PROCEDURE getUser;


-- 테이블 호출구문을 프로시저로 만들어보기
-- getUser()를 만들기, usertbl을 조회하고, 다 만들고 호출까지 진행
DELIMITER $$
CREATE PROCEDURE getUser()
BEGIN  #(프로시저 내부에서 주석 쓰는법)
  SELECT * FROM usertbl;
END $$ #({}가 없으므로 닫는 부분을 END로 대체)
DELIMITER ;
CALL getUser();

-- 프로시저를 활용해 employees 테이블의 10001번 직원의 
-- 입사일이 5년이 넘었는지 여부를 확인해보기
-- hire_date 컬럼의 DATE 자료를 이용해 판단한다.
use employees;
DELIMITER $$
CREATE PROCEDURE checkFiveYear()
BEGIN
  DECLARE hireDATE DATE; # 입사일 얻어오기
  DECLARE todayDATE DATE; # 오늘 날짜 얻어오기
  DECLARE days INT; # 오늘날짜 - 입사일 해서 경과일수 얻어오기
  
  SELECT hire_date INTO hireDATE
  FROM employees WHERE emp_no = 10001;
  # hire_date INTO hireDATE는
  # 위 쿼리문의 결과로 나온 10001번 직원의 hire_date의 값을 hireDATE에 저장해준다.
  SET todayDATE = CURRENT_DATE(); # 오늘 날짜를 구해오는 기본기능
  SET days = DATEDIFF(todayDATE, hireDATE); #  todayDATE - hireDATE 수행
  
  # 경과일수 구하는 조건
  IF(days/365) >= 5 THEN # 입사경과일을 365로 나눠서 5년 이상인지 체크
    SELECT CONCAT('입사한지 ', days, '일이 경과했습니다.');
  ELSE
    SELECT CONCAT('5년미만이고, ', days, '일째 근무중');
  END IF;
END $$
DELIMITER ;
CALL checkFiveYear();

-- DROP하고 다른직원도 조회
DROP PROCEDURE checkFiveYear;

-- 위 처럼 10001이라는 값을 직접 내부에서 선언하지 않고 그떄그때 프로시저를 호출할 떄 마다
-- 값을 바꿔넣을수 있도록 파라미터 처리를 해보겠음.
DELIMITER $$
CREATE PROCEDURE checkFiveYear2(
  emp_number INTEGER   # checkFiveYear2는 호출 시 emp_number를 입력하면됨.
)
BEGIN
  DECLARE hireDATE DATE; # 입사일 얻어오기
  DECLARE todayDATE DATE; # 오늘 날짜 얻어오기
  DECLARE days INT; # 오늘날짜 - 입사일 해서 경과일수 얻어오기
  
  SELECT hire_date INTO hireDATE
  FROM employees WHERE emp_no = emp_number;
  # hire_date INTO hireDATE는
  # 위 쿼리문의 결과로 나온 emp_number 직원의 hire_date의 값을 hireDATE에 저장해준다.
  SET todayDATE = CURRENT_DATE(); # 오늘 날짜를 구해오는 기본기능
  SET days = DATEDIFF(todayDATE, hireDATE); #  todayDATE - hireDATE 수행
  
  # 경과일수 구하는 조건
  IF(days/365) >= 5 THEN # 입사경과일을 365로 나눠서 5년 이상인지 체크
    SELECT CONCAT('입사한지 ', days, '일이 경과했습니다.');
  ELSE
    SELECT CONCAT('5년미만이고, ', days, '일째 근무중');
  END IF;
END $$
DELIMITER ;
CALL checkFiveYear2(20000);