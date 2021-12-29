
public class ForQ1P112 {

	public static void main(String[] args) {
		// Hello Java를 10번 출력하는 구문을 작성해보세요.
		// for문을 사용해서 작성해주세요.
		
		for(int i = 0; i < 10; i++) {
			// System.out.println()의 경우 콘솔창에서 한 줄씩 출려되지만
			// System.out.print()의 경우 다음줄로 내리지 않고 계속 이어서 작성합니다
		System.out.println("Hello Java");
		System.out.println("다 끝났습니다.");
	 }
		// 반복문 내의 System.out.print()는 다음줄로 내려주는 기능이 없어서
		// 계속해서 한 줄에 이어서 출력됩니다.
		// 다른 출력 없이 그냥 한 줄만 내려주고 싶은 경우는
		// 괄호가 비어있는 System.out.println(); 을 실행시켜주면 됩니다.
		System.out.println();
   }
}