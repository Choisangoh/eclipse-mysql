package Interface1;

// 인터페이스 구현(상속이 아님!!!)
// extends 대신 implements를 사용
// 인터페이스 내부의 추상메서드는 무조건 전부 구현해야 한다.
public class Car implements Vehicle{  
    // 자동차라면 가져야 하는 변수 설정
	// 현재속도, 현재연료량, 차주
	private int speed;
	private int gas;
	private String name;
	
	// 생성자를 만들어주세요. 차주만 입력받고,
	// 나머지 요소는 현재 속도 0, 연료량 100을 자동의 대입해주세요.
	public Car(String name) {
		this.name = name;
		this.speed = 0;
		this.gas = MAX_GAS;
	}
	
	@Override
	public void accel() {
		// 한번 가속시 속도가 10씩 늘어나도록 해주세요.
		// 연료는 한번 가속에 1씩 소비합니다.
		// 단, 속도는 200을 초과할 수 없습니다.
		
		// 가속 이전에 가속했을 경우 200을 초과하는지 확인 후 처리
		if(speed + CAR_INCREASE_SPD > CAR_MAX_SPD) {
			speed = CAR_MAX_SPD;
		} else {
			speed += CAR_INCREASE_SPD;
	}
		// 가속 로직을 전부 확인한 다음 
		gas -= CAR_DECREASE_GAS;
}
	@Override
	public void breakSpeed() {
		// 한번 감속 할 때 마다 속도가 10씩 감속
		// 단, 속도가 0 미만이 될수 없다
		if(speed - CAR_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= CAR_DECREASE_SPD;
	}		
}
	@Override
	public void reFuel() {
		// 연료는 다시 채울떄마다 30씩 채워줍니다.
		// 단, 연료 최대값은 상수 MAS_GAS를 이용해서 측정해주세요.
		if(gas + CAR_INCREASE_GAS > MAX_GAS) {
			gas = MAX_GAS;
		} else {
		    gas += CAR_INCREASE_GAS;
	}
}
	@Override
	public void showStatus() {
		// 자동차의 정보를 조회할 수 있도록 작성해주시면 됩니다.
		System.out.println("현재 속도 " + speed);
		System.out.println("현재 연료 " + gas);
		System.out.println("현재 차주 " + name);
		System.out.println("----------------------");		
	}
}
