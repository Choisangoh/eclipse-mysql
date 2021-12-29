package StringBuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제하세요.
		// 힌트 : 반복문 사용
		
		// 문자열은 "abcdefghijklmnopqrstuvwxyz"
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		for(int i = 0; i < a.length(); i++) {
			System.out.println("i % 3의 결과 : " + i % 3); // % 는 나머지
			System.out.println("현재 i의 값 : " + i);
			System.out.println(a);
			System.out.println("-----------------------");
			if(i % 3 == 0) {
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);
	}
	    // 원래 0번이 삭제가되면 1번이 새로운 0번이 된다!!!
}
