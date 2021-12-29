package String1;

public class String09P399 {

	public static void main(String[] args) {
		// 기본적으로 문자열은 참조형 변수이기 때문에
		// 비교를 할 때 주소값 비교가 일어난다.
		String a = new String("테스트");
		String b = new String("테스트");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b); // new를 생성했기 때문에 힙에서 다른 번지수이므로 false이다.
		String c = "테스트";
	    String d = "테스트";
	    System.out.println(c == d); // new를 생성하지 않았기 때문에 같은 번지수로 true이다.
	    
	    // .equals()를 이용하면 주소값 비교가 아닌
	    // 문자열간 비교가 가능하다.
	    System.out.println(b.equals(a)); // 문자열이 a,b 둘다 "테스트"이므로 true이다.
	}
}
