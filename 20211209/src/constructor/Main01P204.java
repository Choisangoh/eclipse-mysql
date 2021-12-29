package constructor;

public class Main01P204 {
	
	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어주세요.
		Car asdf = new Car();
		asdf.gas = 100;
		asdf.speed = 0;
		asdf.owner = "채종훈";
		
		// 차를 뽑자마자 먼저 상태 확인
		asdf.getInfo();
		// 엑셀을 두 번 밟아주세요
		asdf.accelSpeed();
		asdf.accelSpeed();
		// 상태 다시 확인
		asdf.getInfo();		
		// 브레이크를 밟아주세요
		asdf.breakSpeed();
		// 상태 다시 확인
		asdf.getInfo();
		
	}

}
