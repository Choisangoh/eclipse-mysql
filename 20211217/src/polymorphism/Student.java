package polymorphism;

// 부모클래스인 Person을 상속받도록 해주세요.(extends 부모클래스이름)
public class Student extends Person {
	
	// 학생만이 가진 특성 grade를 선언
	private int grade;
	
	// super()를 이용해 Person(부모) 생성까지 커버하는 생성자를 만들어주세요.
	// grade까지 입력받습니다.
	// 부모쪽에서 쓸 자원 String name, int age를 받고
	// Student 자신이 쓸 자원 int grade 까지 3개를 입력요청 합니다.
	public Student(String name, int age, int grade) {
		// 부모쪽 생성자에 name, age를 넘겨주기 위해
		// super(name,age);를 호출하고
		// 자식쪽에서는 this.grade = grade로 받습니다.
		super(name, age);
		this.grade = grade;
	}
  // 상속받은 showPerson을 활용한 메서드를 작성합니다.
	public void showPerson() {
		// super.으로 부모쪽 showPerson 호출
		super.showPerson(); // 이름과 나이를 콘솔에 찍어주는 구문
	    System.out.println("학생 성적 " + grade);
	}
	// 신분을 밝히는 코드를 Student에만(Person에는 정의 X) 작성합니다.
	public void showStudent() {
		System.out.println("저는 학생입니다.");
	}
}
