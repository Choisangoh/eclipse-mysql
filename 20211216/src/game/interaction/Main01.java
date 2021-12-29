package game.interaction;

public class Main01 {

	public static void main(String[] args) {
		
		// 전사 생성
		Warrior w1 = new Warrior();
		// 오크 생성
		Orc o1 = new Orc();
		// 교전 생성
		w1.huntOrc(o1);
	}
}
