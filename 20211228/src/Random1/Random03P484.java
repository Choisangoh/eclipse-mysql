package Random1;

import java.util.Random;

public class Random03P484 {

	public static void main(String[] args) {
		// Random 클래스의 nextInt()는 나올 숫자 범위를 지정할 수 있다.
		// 바로 정수로 나오기 때문에 코드가 좀 더 간결하다.
		Random random = new Random();
		
		// 범위입력을 안 하는 경우 그냥 정수 아무거나 나옴
		int result = random.nextInt();		
		System.out.println(result);
		
		// 따라서 정수 숫자 하나(n)를 파라미터로 넣어줘야 0 <= 결과값 < n 이 나온다
		int result2 = random.nextInt(5); // 0, 1, 2, 3, 4 중 하나가 나온다.
		System.out.println(result2);		
	}
}
