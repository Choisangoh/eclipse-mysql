package Math1;

public class Math01 {

	public static void main(String[] args) {
		// Math는 자바에서 이미 기본으로 제공하는 기능이라
		// import 없이 사용가능하다.
		
		int a = -1024;
		System.out.println(Math.abs(a)); // .abs()는 절대값이므로 부호 없이 숫자만
		
		double b = 3.14;
		System.out.println(Math.ceil(b));  // .ceil()는 올림
		
		double c = 19.9;
		System.out.println(Math.floor(c)); // .floor()는 내림		
	}
}
