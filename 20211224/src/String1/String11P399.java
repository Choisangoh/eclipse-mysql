package String1;

public class String11P399 {

	public static void main(String[] args) {
		// String.valueOf()는 괄호 사이의 자료를 문자열로 바꿔줍니다.
		String a = String.valueOf(1000);
		// int a = 1000;
		System.out.println(a);
		System.out.println(a + 1);
		
		// 실수 하나를 임의로 문자열로 바꿔서 저장해보세요.
	    String b = String.valueOf(123.456);
	    // double b = 123.456;
	    System.out.println(b);
	    System.out.println(b + 1);
 
	    // String.valueOf()를 안쓰고도
	    // + "" 만으로도 문자열로 만들 수 있다.
	    // 자바는 문자열 + 다른자료형이 오는 경우 전부 문자로 치환해 처리한다.
	    String c = 1000 + ""; // = 1000;
	    System.out.println(c);
	    System.out.println(c + 1);
	    
	    // boolean 자료형에 대해서 원하는 방식으로
	    // 문자열화 해서 콘솔에 찍어보세요.
	    String d = true + "";
	    System.out.println(d);
	    System.out.println(d + 1); // d말고 true를 쓰면 에러 발생
	    
	    String e = String.valueOf(false);
	    System.out.println(e);
	    System.out.println(e + 1);
	}
}
