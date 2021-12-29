package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		
		Commoner c1 = new Commoner("초보");
		Monster o1 = new Orc(); // Monster 에 Orc를 써도 상관없음
		
		c1.hunt(o1);	
		c1.hunt(o1);
	}

}
