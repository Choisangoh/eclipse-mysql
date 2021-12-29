
public class Overflow {

	public static void main(String[] args) {
	
		// 오버플로우는 표현할 수 있는 최대 숫자를 넘겨서 표현하면
		// 그 자료형으로 표현할 수 있는 최소값으로 초기화 되는 현상
		// 아래와 같이 -128 ~ 127 사이의 범위를 표현할 수 있는 byte의 최대값인
		// 127을 넘으면 최소 표현값 -128부터 다시 잡힘
		
		byte a=127;
		byte b=1;
		System.out.println((byte)(a+b));
		

	}

}
