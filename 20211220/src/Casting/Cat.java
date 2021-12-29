package Casting;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
	}	
	public void push() {
		System.out.println("꾹꾹 하고있습니다.");
	}
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}
}
