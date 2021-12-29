 package Interface1;

// 인터페이스는 interface 선언을 사용합니다.
// 내부에는 상수인 값과 추상메서드만 선언 가능!!!
// 애초에 구현(implements)를 전제로 설계되어 있어서
// 일반 변수, 메서드를 내부에 선언할 수 없다.
// 다형성에서는 부모클래스의 역할을 한다.
public interface Vehicle {
    // 최대 연료량
	// 바로 상수로 잡힌다.
	int MAX_GAS = 100;
	
	// 최저속도(0) 공용!
	int MIN_SPD = 0;
	
	// (CAR)최대속도, 연료 증가량, 연료 감소량, 속도 증가량, 속도 감소량
	int CAR_MAX_SPD = 200;
	int CAR_INCREASE_GAS = 30;
	int CAR_DECREASE_GAS = 1;
	int CAR_INCREASE_SPD = 10;
	int CAR_DECREASE_SPD = 10;
	
	// (TRAIN)최대속도, 연료 증가량, 연료 감소량, 속도 증가량, 속도 감소량
	int TRAIN_MAX_SPD = 400;
	int TRAIN_INCREASE_GAS = 70;
	int TRAIN_DECREASE_GAS = 6;
	int TRAIN_INCREASE_SPD = 50;
	int TRAIN_DECREASE_SPD = 50;
	
	int AIRPLANE_MAX_GAS = 1000;
	int AIRPLANE_MAX_SPD = 900;
	int AIRPLANE_INCREASE_GAS = 500;
	int AIRPLANE_DECREASE_GAS = 150;
	int AIRPLANE_INCREASE_SPD = 400;
	int AIRPLANE_DECREASE_SPD = 300;
	// 탈 것이라면 가지고 있을 공동적 기능을 전부 추상메서드로 작성
	// {
	//    실행문...
	// }
	// 와 같은 실행문 부분(메서드의 body) 없이 선언만 해주세요.

	public void accel(); // 가속
	public void breakSpeed(); // 감속
	public void reFuel(); // 주유
	public void showStatus(); // 계기판 조회		
}
