package structure;

public class Structure02P190 {

	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 연락처 : " + p.pNum + ", 번호 : " + p.uNum);
	}
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a, b)
		Person a = new Person();
		a.name = "채종훈";
		a.age = 20;
		a.pNum = "010-1234-5678";
		a.uNum = 32;
		
		Person b = new Person();
		b.name = "김자바";
		b.age = 10;
		b.pNum = "010-9999-8888";
		b.uNum = 22;
		getInfo(a);//a의 주소값을 getInfo의 p에 전달
		getInfo(b);//b의 주소값을 getInfo의 p에 전달
	}
}
