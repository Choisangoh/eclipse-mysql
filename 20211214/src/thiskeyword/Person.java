package thiskeyword;

public class Person {
	// 사람의 정보를 여기에 기입
	private String name;
	private int age;
	private int money;
	private String major;
	
	public Person(String name, int age, int money, String major) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;		
		// this. 은 가장 상위에 있는 것을 말함
		// 하위지역은 상위지역 자원을 쓸 수 있고, 상위지역은 하위지역 자원을 쓸 수 없다.		
	}
	
	// 이름, 나이, 소지금액, 전공을 콘솔에 찍어주는 getInfo()를 작성해주세요.
	
	public void getInfo() {
		System.out.println("이름은 " + this.name); 
		System.out.println("나이는 " + age); 
		System.out.println("소지금액은 " + this.money); 
		System.out.println("전공은 "  + major); 
		
	}
	
}
