package Casting;

// Animal 클래스 정의
public class Animal {
	// 이름과 나이 두개의 특성을 가짐.
	private String name;
	private int age;	
	// 생성자로 초기화합니다.
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;		
	}
	// sit()을 실행하면 콘솔창에 "앉습니다"라고 찍힙니다.
	public void sit() {
		System.out.println("앉습니다.");
	}
}