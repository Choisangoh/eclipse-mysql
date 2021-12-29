package overriding;

public class Dog extends Animal {
	
	public String color;
	
	// 오버라이딩 요건
	// 이름과 리턴자료형 등이 같은 부모쪽 메서드를
	// 중복해서 작성함
	
	public void howl() {
		System.out.println("왈왈");
	}
		
    public void getInfo() {
			 System.out.println("이름은 : " + name + ",  나이는 : " + age + ", 사료는 : " + food + ", 색깔은 : " + color);
		
	   }

    }