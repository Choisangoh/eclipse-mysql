
public class Unary01P65 {

	public static void main(String[] args) {
		// 단항 연산자 ++ 와 -- 는 숫자 왼쪽 혹은 오른쪽에 붙임
		// 왼쪽에 붙는 경우를 전위수식, 오른쪽에 붙는 경우를 후위수식
		// 어디에 붙느냐에 따라 실행 순서가 달라짐
		// ++는 대상 변수의 숫자를 1증가시키고 --는 숫자를 1 감소시킴
		
		int a=1;
		System.out.println(++a); // 전위수식 a값 1 증가
		// 1. a값을 먼저 1 증가시킴 : a = a(1) + 1
		// 2. 증가된 a값을 콘솔에 찍음 : sysout(a(2))
		
		System.out.println(a); // a값 2 유지
		
		System.out.println(a++); // a값 2 출력후 1 증가
		// 1. a값을 콘솔에 찍음 : sysout(a(2)) 
		// 2. a값을 1 증가시킴 : a = a(2) + 1
		
		System.out.println(a); // a값 3이 됨
		
	}

}
