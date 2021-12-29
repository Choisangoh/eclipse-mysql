package overriding;

public class Cat extends Animal{
	
	public int weight;
	
	public void howl() {
		System.out.println("냐옹");
	}
	
	 public void getInfo() {
		 System.out.println("이름은 : " + name + ",  나이는 : " + age + ", 사료는 : " + food + ", 무게는 : " + weight);
		
	}
	

}
