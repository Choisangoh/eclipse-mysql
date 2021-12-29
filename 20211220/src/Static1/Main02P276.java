package Static1;

public class Main02P276 {

	public static void main(String[] args) {
		// static변수는 생성 없이도 활용가능
		System.out.println(StaticTest.num2);
		// System.out.println(StaticTest.num1);은 안됨
         
		// static 메서드도 설정 가능하며 나머지 사항은 변수와 같다.
		StaticTest.check();
		
		// s1 생성후 s1을 이용해 .check()를 호출해보세요.
		StaticTest s1 = new StaticTest();
		s1.check();
	}
}
