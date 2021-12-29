package Casting;

public class casting {

	public static void main(String[] args) {
		// Animal로 Cat을 받아서 생성
		Animal q = new Cat("쿠쿠",5);
		// a변수와 연결된 heap쪽 자료가 Cat인지 확인
		System.out.println(q instanceof Cat);
		// a변수와 연결된 heap쪽 자료가 Dog인지 확인
		System.out.println(q instanceof Dog);
		// a변수와 연결된 heap쪽 자료가 Animal인지 확인
		System.out.println(q instanceof Animal);
	}
}
