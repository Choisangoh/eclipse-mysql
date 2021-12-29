package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		// 차 2대 생성
		Car c1 = new Car();
		c1.model = "K5";
		c1.price = 3000;
		c1.owner = "이준영";

		Car c2 = new Car();
		c2.model = "부가티베이론";
		c2.price = 500000;
		c2.owner = "채종훈";
		// 콘솔에 정보 찍기
		c1.getInfo();
		c2.getInfo();
	}
}
