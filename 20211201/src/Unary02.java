
public class Unary02 {

	public static void main(String[] args) {
		// 단항 연산자로 쓰인 +와- 양수와 음수를 표현
		System.out.println(+50); // 양수 50, 실제로는 그냥 50 표기
		System.out.println(-22); // -22로 표기
	
		// 비트 반전 연산자는 비트단위 값을 0->1로, 1->0으로 바꿔준다(1의 보수처럼 만들어줌)
		System.out.println(~1);
		
		// 논리 반전 연산자 !는 true->false, false->true로 바꿔준다
		System.out.println(!false);
		
		// 자료형을 바꿔주는 cast연산자 ((자료형)자료)
		System.out.println((double)21);
	}

}
