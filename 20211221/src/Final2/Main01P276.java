package Final2;

public class Main01P276 {

	public static void main(String[] args) {
		// final변수를 쓰기 위한 조건
		// 1. Country라는 소속을 써줘야함.
		// 2. .상수명을 적어서 Country에 소속된 상수들을 호출함
	    System.out.println(Country.KOREA);
	    System.out.println(Country.CHINA);
	    System.out.println(Country.USA);
	    System.out.println(Country.CANADA);	    
	    // 값 재할당 불가! Country.KOREA = 1000; 안됨.
	    
	    // Math(수학)
	    System.out.println(Math.PI);
	}
}
