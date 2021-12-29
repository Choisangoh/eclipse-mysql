import java.util.Scanner;


public class ScannerQ1P93 {
 
	public static void main(String[] args) {
		// 환율 계산기를 만들어보겠습니다.
		// 네이버에 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장하고,
		// 스캐너를 이용하여 won 변수에 원화 금액을 입력해주세요.
		// 원화와 환율을 이용하여
		// 원화 xxx원을 환전 시 xxx(화폐)입니다. 로 결과물을 출력해주세요.
		
		Scanner scan = new Scanner(System.in);
		
		double rate = 1183.00;
		
		
		System.out.println("미국 달러의 환율은 " + rate + "입니다.");
		System.out.println("원화를 입력해주세요.");
		int won = scan.nextInt();
	
		System.out.println("원화" + won + "원을 미국 달러로 환전 시");
		
		// won/rate를 Math.round()로 감싸고, 10의 n승을 곱하고 10.0의 n승으로 나눠주면
		// n승에 해당하는 자리수만큼 소수점 자리까지만 나옵니다 (보기만 하기)
		
		System.out.println(won / rate + "dollar입니다.");
		
		// 다 사용한 scan변수는 .close();로 닫아줘야 메모리가 회수된다.
		
		
				
	}
	}
