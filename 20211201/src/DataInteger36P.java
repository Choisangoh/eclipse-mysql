
public class DataInteger36P {

	public static void main(String[] args) {
		// 정수는 자료형의 크기에 따른 비트 갯수에 따라 표현 범위가 달라짐
	    // 2의 보수 방식을 취하기 때문에
		// 범위를 넘지 않도록 주의!
				
				byte a = -128; // byte -128 ~ +127
				System.out.println(a);
				
				// 우리가 그냥 숫자를 적으면 int로 간주
				// 그래서 int범위를 벗어난 값은 long형에는 대입이 안됨
				// int 범위를 벗어난 숫자를 대입할때는 숫자 뒤에 L을 추가로 붙입니다.
				long b = 2500000000L;
				System.out.println(b);		
	}

}
