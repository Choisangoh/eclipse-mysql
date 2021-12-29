
public class Parseint01 {

	public static void main(String[] args) {
		// 정수자료는 문자로 바꾸고 싶을때 
		// "문자열" + 정수자료 를 하면 자동으로 문자로 변경된다.
		// 그러나 문자 전체가 정수로만 이루어진 문자열을
		// 정수로 치환하기 위해서는 별도의 문법을 사용해야된다.
		
		String str = "2021";
		int year = Integer.parseInt(str);
		// Integer.parseInt(문자열) 을 집어 넣으면 정수로 교환해줌
		
		// 정수 2021 + 정수 1 == 2022 출력
		System.out.println(year + 1);
		
		// 문자 2021 + 정수 1 == 20211 출력
		System.out.println(str + 1);						

	}

}
