package String1;

public class String01P399 {

	public static void main(String[] args) {
		// String 클래스의 주요 메서드 확인 1. charAt();
		String greeting = "Hello Java"; // 0 = H 부터 9 = a 까지 있음.
		char get = greeting.charAt(9); // charAt()으로만 가능!!!
		System.out.println(get);
		// 자바는 문자배열 인덱스를 허용하지 않습니다.
		// System.out.println(greeting[6]); 안됨!!!
	}
}