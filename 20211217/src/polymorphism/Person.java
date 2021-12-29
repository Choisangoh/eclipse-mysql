package polymorphism;

public class Person {
	// 사람을 나타내는 클래스
	// 상속을 목적으로 하는 클래스
	// Person을 상속받은 자식들은 전부
	// Person을 요구하는 자리에 대입 될 수 있다.
	private String name;
	private int age;
	
	// 이름과 나이를 입력바다 초기화하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	// Person 클래스의 전체 데이터를 콘솔에 찍어주는 showPerson()
	// Person타입으로 호출했을 때 유일하게 호출 가능한 메서드
	// 이 메서드를 자식쪽에 오버라이딩 하면 부모타입으로도
	// 자식쪽 showPerson()을 호출할 수 있다.
	public void showPerson() {
		System.out.println("이름은 " + name + " 나이는 " + age);
	}
	// setter 와 getter 생성해주세요.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
