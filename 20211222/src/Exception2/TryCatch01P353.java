package Exception2;

import java.util.Scanner;

public class TryCatch01P353 {

	public static void main(String[] args) {
		// try~catch구문은 크게 예외가 발생할 가능성이 있는 구문을 적어두는
		// try블럭과, 예외가 실제로 발생했을 때 대처할 코드를 실행하는
		// catch블럭으로 나뉜다.
		
		// 스캐너로 int a,b에 정수를 입력받는 부분 작성
		Scanner scan = new Scanner(System.in);
		System.out.println("a정수를 입력해주세요");
		int a = scan.nextInt();
		System.out.println("b정수를 입력해주세요");
		int b = scan.nextInt();
		
		try {
			// 예외가 발생할 가능성이 있는 구문을 전부 다 쓴다.
			System.out.println(a / b);
			System.out.println("계산 끝!");
		} catch(Exception e) {
			// catch블록에는 (Exception e)가 기본으로 들어간다.
			// Exception e로 적는경우 예외 종류를 막론하고 전부 처리가 가능하다.
			// 추후에 특정한 종류의 예외를 따로 처리하고 싶은 경우는 다른 예외명을 적으면 된다.
			System.out.println("나누는 숫자가 0이 될 수 없습니다.");
		} finally {
			// 모든 실행구문이 다 끝나고 나서 실행할 코드는
			// finally 블럭 내부에 작성합니다.
			System.out.println("코드 끝!");		
		}
	}
}