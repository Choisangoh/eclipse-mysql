package thiskeyword;

public class Main01P224 {

	public static void main(String[] args) {
		// Person을 두명 생성하되,
		// 생성 시 지역 간의 데이터 교환을 염두하고 확인하면서 생성하세요.
		// 생성된 Person은 getInfo()를 실행합니다.
		
	   Person p1 = new Person("최상오", 23, 10000,"앱개발");
	   p1.getInfo();
	
	
       Person p2 = new Person("최상오2", 24, 20000, "웹개발");
	   p2.getInfo();	

	}

}
