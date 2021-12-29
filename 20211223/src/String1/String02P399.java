package String1;

public class String02P399 {

	public static void main(String[] args) {
		// indexOf()는 특정 문자열의 시작 인덱스 값을 반환한다.
		// 만약 특정 문자열이 포함되어 있지 않다면 -1를 리턴한다.
		String tomato = "tomato"; // 0 = t 부터 5 = o 까지 있음.
		int get = tomato.indexOf("to");
		
		// 첫번쨰 to 단어는 0번 부터 시작
		System.out.println(get);
		
		// 중복문자 집계(0번이 아닌 1번인덱스부터 조회해서 처음으로 나오는 to를 조회)
		get = tomato.indexOf("to", 1);
		System.out.println(get);
		
		// 없는 문자열 조회시 -1이라는 가상의 인덱스번호를 준다.
		get = tomato.indexOf("banana");
		System.out.println(get);
	}
}
