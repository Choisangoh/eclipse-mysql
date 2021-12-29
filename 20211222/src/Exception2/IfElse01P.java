package Exception2;

import java.util.Scanner;

public class IfElse01P {

	public static void main(String[] args) {
		// int a, b에 스캐너로 각각 정수를 입력받아주세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("a정수를 입력해주세요");
		int a = scan.nextInt();
		System.out.println("b정수를 입력해주세요");
		int b = scan.nextInt();		
	    // a / b의 결과를 콘솔에 띄어주시되		
		// a / b를 실행하기전에 b가 0인지 검사해서 0인 경우
		// a / b를 하지말고 0으로 숫자를 나눌 수 없습니다 라고 경고를 띄우세요.
		if(b == 0) {
			System.out.println("0으로 숫자를 나눌 수 없습니다.");
		} else {
			System.out.println(a / b);
	}
		System.out.println(a / b);
	    }
	}

