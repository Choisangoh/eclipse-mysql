
public class Method05P204 {
	// int c, int num을 받아서
	// System.out.println(c + num); 만 실행하고 종료되는
	// plus2메서드를 정의해주신 다음
	// main 내부에서 c에는 10, num에는 20을 전달해 실행하도록
	// 코드를 작성해보세요.
	public static void plus2(int c, int num) {
		System.out.println(c + num);
	}

	public static void main(String[] args) {
		plus2(10, 20);
		// 중괄호 여닫는 부분을 "지역"이라고 합니다.
		// 중괄호가 닫히면 해당 "지역"과 "지역" 내 자료들은 함께 소멸됩니다.
		//System.out.println(c);
		//System.out.println(num);
	}
}
