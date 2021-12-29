
public class AndOr02P72 {

	public static void main(String[] args) {
		// &&, ||은 short circuit 연산자
		// &, |과 똑같이 작동하되, 왼쪽의 조건식만으로 모든 결과가 확정되면, 추가적 연산 무시
		// 에러가 발생하는 오른쪽 연산(0으로 나누기)을 생략하는지 테스트
		
		
		System.out.println((1+3 < 4) && (0 < 3/0));
		// 왼쪽이 틀렸기 떄문에 오른쪽은 실행 안하고 바로 &&에서는 false 출력
		
		System.out.println((5 > 4) || (0 < 2/0));
        // 왼쪽이 맞기 떄문에 오른쪽은 실행 안하고 ||에서는 true 출력

	}

}
