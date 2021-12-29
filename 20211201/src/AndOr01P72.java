
public class AndOr01P72 {

	public static void main(String[] args) {
		// 논리 연산자는 둘 이상의 논리식을 나열해서 제시할때 사용
		// 논리식1 & 논리식2 의 경우는 양쪽 모두 true인 경우
		// 논리식1 | 논리식2 의 경우는 한 쪽 이상의 논리식이 다 true인 경우
		// 최종 조건식을 true로 판단
		
		System.out.println((100 > 50) & (30 > 50));
		// 둘다 참이여야 true가 나오고 지금처럼 하나라도 틀리면 false
		
		System.out.println(100 > 50 | 30 > 50);
       // 하나라도 참이니까 true
	}

}
