package superclass;

public class Main01 {

	public static void main(String[] args) {
		// 비행기를 생성해서 초기속도는 300으로 세팅하고,
		Airplane a1 = new Airplane(300);
		
		
		// 가속 2번으로 속도를 900으로 만들고,
		a1.fly();
		a1.fly();
		
		// 0까지 내려주세요.
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.breakSpeed();


	}

}
