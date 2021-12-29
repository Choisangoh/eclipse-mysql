package Random1;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {

	public static void main(String[] args) {
		// Random객체를 생성한 다음 nextBoolean()기능을 이용해서
		// 동전 던지기 카운팅 프로그램을 만드세요.
		// n회 던졌을 때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서
		// 콘솔에 출력하세요,
		// 실행 횟수는 n회는 스캐너로 입력받습니다.
		
		// 동전 던질 횟수 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("동전 던질 횟수를 입력하세요.");
		int count = scan.nextInt();
		
		// 앞면 뒷면 카운팅할 변수 생성(0부터 시작)
		int front = 0;
		int back = 0;
		
		//랜덤 변수 실행 후 반복은 동전 던질 횟수만큼 돌려서
		Random random = new Random();
		for(int i = 0; i < count; i++) {
			// random.nextBoolean()이 true면 앞면 1 증가
			// false면 뒷면 1증가하도록 조건식 작성
			boolean result = random.nextBoolean();
			if(result) {
				front++;
			}else
				back++;
		}	
		System.out.println(count + "바퀴 돌린 결과값");	
		System.out.println("앞면 " + front);
		System.out.println("뒷면 " + back);
	}	
}
