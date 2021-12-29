
public class BinaryP63 {

	public static void main(String[] args) {
		// 이항 연산자는 양 변에 하나씩 항목을 취하는 연산자
		// 산술 연산자는 우리가 잘 알고 있는 사칙연산 등을 활룡
		// 연산 우선순위도 그대로 사용
		// 단 % 연산자의 우선순위는 *,/ 와 동일하다
		// +, -, *
       
		System.out.println(3+5);
		System.out.println(17-21);
		System.out.println(2*3);
		
		// 나누기(/)는 왼쪽 수를 오른쪽 수로 나눠서 몫을 구함 (정수/정수=정수)
         System.out.println(7.0/2); // 3.5를 정수로 바꿔서 출력
         
         // %는 정수 최대 몫을 구하고 남은 값을 출력
          System.out.println(10%4);
         
         // 연산자의 우선순위는 그대로 존재
          System.out.println((10+6)%4);
	}

}
