package Random1;

import java.util.Random;

public class Random01P484 {

	public static void main(String[] args) {
		// Random 클래스는 Math.random()보다 좀 더 간단히
		// 다양한 종류와 난수값을 얻을 수 있도록 도와준다.
		// java.util을 통해 import 할 수 있다.
		Random random = new Random();
		
		boolean result = random.nextBoolean();
		
		System.out.println(result);
						
	}
}
