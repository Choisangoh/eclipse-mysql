package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		// student가 Person을 상속했기 때문에
		// Student는 Person의 지원을 사용할 수 있다.
		Student s1 = new Student();
		s1.name = "최상오";
		s1.age = 23;
		s1.stuNum = 01;
		
		s1.getInfo();
		s1.getStudentInfo();

	}

}
