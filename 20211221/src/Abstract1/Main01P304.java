package Abstract1;

public class Main01P304 {

	public static void main(String[] args) {
		// new 키워드로는 추상클래스를 생성 할 수 없다.
		// Parent p1 = new Parent(); 생성불가!

		// 단, Parent를 상속받아 getAge메서드로 구체화시킨
	    // Child 타입으로는 객체 생성 및 사용이 가능합니다.
		Parent c = new Child();
		c.getAge();
		// 따로 오버라이딩 하지 않아도 일반 메서드는 상속받았다면 사용 가능
		c.getInfo();
	}
}
