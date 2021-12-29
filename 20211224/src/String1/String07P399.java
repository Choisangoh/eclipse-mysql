package String1;

public class String07P399 {

	public static void main(String[] args) {
		// soUpperCase()는 문자열 전체를 대문자로 바꾼다.
		// 대문자였던것은 대문자 유지, 소문자였던것은 대문자로 바뀐다.
		String hello = "Hello Java";
		System.out.println(hello.toUpperCase()); // 영구적이 아닌 일시적으로만
		System.out.println(hello);
		
		// toLowerCase() 문자열 전체를 소문자로 바꾼다.
		// 소문자였던것은 소문자 유지, 대문자였던것은 소문자로 바뀐다.
		System.out.println(hello.toLowerCase()); // 영구적이 아닌 일시적으로만
		System.out.println(hello);
		
	}
}
