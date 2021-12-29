
public class SwitchCase01P99 {

	public static void main(String[] args) {
		// switch ~ case 구문은 변수에 들어있는 자료가 case문에 제시된
		// 자료와 일치하는지 여부로 논리식을 실행한다.
		// switch(변수값) {
		// case 값1:
		//     실행문;
		// case 값2...
		// }
		// 와 같이 작성합니다.
		// 마지막에 default 문을 작성시 if~else문의 else처럼 기능한다.
		
		int a = 3; 
		switch(a) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");   // 변수값이 int = 3 이므로 case 3부터 실행
		default :
			System.out.println("1~3이 아니네요.");
			break; // 가독성을 위해 필요없지만 default에도 break를 작성하기도 함.
			
      
		}

	}

}
