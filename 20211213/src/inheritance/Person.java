package inheritance;

public class Person {
	
	// 사람이라면 공통적으로 가지는 속성 정의
	 public String name;
	 public int age;

	
	 
	//getInfo() 이름은 name입니다. 나이는 age입니다. 라고 찍게 만들어주세요.
	 public void getInfo() {
		 System.out.println("이름은 : " + name + " ,  나이는 : " + age);
	 }

}