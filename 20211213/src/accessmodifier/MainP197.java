package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		
		// 전사 하나  만들고 사냥을 3번 하세요.
		Warrior w1 = new Warrior("상오상오");
		// private 요소인 hp는 main 지역에서 직접 값을 바꿀수 없다.
		w1.hunt();
		w1.hunt();
		w1.hunt();
	
		

	}

}
