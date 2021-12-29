package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 개와 고양이를 생성
		
		Dog d1 = new Dog();
		d1.name = "뿡이";
		d1.age = 1;
		d1.food = "개껌";
		d1.color = "흰색";
		
		d1.howl();
		d1.getInfo();
		
		
		Cat c1 = new Cat();
		c1.name = "수달이";
		c1.age = 1;
		c1.food = "생선";
		c1.weight = 4;
		
		c1.howl();
		c1.getInfo();
		
		
		

	}

}
