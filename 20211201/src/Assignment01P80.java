
public class Assignment01P80 {

	public static void main(String[] args) {
		// 대입 연산자란 특정 변수 값을 연산자 우측에 해당하는 값을 이용해
		// 연산한 결과값으로 계산해 저장하는 기능을 수행
		// 단순 연산자인 = 이 있으며, 추가로 확장된
		// 복합대입연산자로 +=, -=, /=, *=, %= 등이 있다.
		// 대입 연산자를 사용하는 경우 코드 실행방향이 오른쪽에서 왼쪽
		int a = 10;
		System.out.println(a);
		a += 10; //a = a + 10;	// 10을 증가시키는 코드
		
		System.out.println(a);// 20으로 증가된 것 확인
		a -= 5; //a = a - 5;// 5를 감소시키는 코드
		
		System.out.println(a);//15로 감소한 것 확인
		a *= 3; //a = a * 3; // 3배 증가시키는 코드
		
		System.out.println(a);// 45로 증가한 것 확인
		a /= 4; //a = a / 4; // 4로 나누는 코드(정수)
		
		System.out.println(a);// 11이 나오는것 확인
		a %= 12; //a = a % 12;// 12 나머지 연산 코드
		
		System.out.println(a);// 11이 나오는것 확인

	}

}
