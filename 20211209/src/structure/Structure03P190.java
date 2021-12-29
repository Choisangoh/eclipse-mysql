package structure;

public class Structure03P190 {//Cat의 실행부
	public static void getCatInfo(Cat c) {
		System.out.println(c.name + "의 정보입니다.");
		System.out.println("이름 : " + c.name + ", 나이 : " + c.age + ", 털색깔 : " + c.color);
	}

	public static void main(String[] args) {

		Cat c1 = new Cat();
		
		c1.name = "어묵이";
		c1.age = 3;
		c1.color = "치즈";
		
		Cat c2 = new Cat();
		
		c2.name = "룰루";
		c2.age = 3;
		c2.color = "회색(검흰)";
		
		getCatInfo(c1);
		getCatInfo(c2);

	}

}
