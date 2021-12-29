package overriding;

public class Animal {
	
	// 동물이라면 공통적으로 가지는 속성 정의
		 public String name;
		 public int age;
		 public String food;
		 
		 
		//getInfo() 이름은 name입니다. 나이는 age입니다. 라고 찍게 만들어주세요.
		 public void howl() {
			 System.out.println("동물이 웁니다."); 
		 }
			
	     public void getInfo() {
			 System.out.println("이름은 : " + name + ", 나이는 : " + age + ", 사료는 : " + food);
		 }
     }
