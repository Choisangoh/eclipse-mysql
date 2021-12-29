package constructor;

public class Car {

	// 자동차의 상태(속성)를 나타내는 변수들
	public int gas;// 연료량
	public int speed; // 속도
	public String owner;// 차주
	
	// 자동차 동작 추가하기
	public void getInfo() {
		System.out.println("현재 연료량 : " + gas);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 주인 : " + owner);
		System.out.println("-----------------------");
	}
	
	// 운전 기능 추가하기(가속하기)
	public void accelSpeed() {
		gas -= 2;
		speed += 10;
	}
	
	// 브레이크 기능 추가하기(감속하기)
	public void breakSpeed() {
		speed -= 10;
	}
	
}
