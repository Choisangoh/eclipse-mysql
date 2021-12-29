package structure;

// 클래스를 이용해 개발하는 경우
// main만 담당하는 부분과
// 정의만 담당하는 부분 두 개를 나눕니다.
// 아래 Person은 사람 정의를 담당하는 부분입니다
public class Person {//정의부
	// 자바에서 표현할 사람의 필수 정보를 변수로 선언
	// 이름, 나이, 번호, 연락처를 식별정보로 지정합니다
	// public은 지금단계에서는 무조건 붙여줍니다.
	public String name;// 이름
	public int age;// 나이
	public String pNum; // 연락처
	public int uNum; // 회원번호
}
