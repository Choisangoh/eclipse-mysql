package String1;

public class String06P399 {

	public static void main(String[] args) {
		// substring()은 인덱스 기준으로 앞 문자열을 삭제한다.
		// 인덱스 번호를 두개 주면 처음 인덱스번호부터 두번째 인덱스번호 전까지만 남겨준다.
		
		String str = "자바자바JSPJSP스프링스프링";
		String result = str.substring(5); // 문자열의 5번부터 실행
		System.out.println(result);
		
		result = str.substring(10, 15); // 문자열의 10번부터 15번 전인 14번까지 실행
		System.out.println(result);
	}
}
