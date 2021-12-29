package game.inheritance;

public class Main02 {

	public static void main(String[] args) {
		
	   // Warrior를 하나 생성해주세요.
		Warrior w1 = new Warrior("기부전사");
		
	   // 정보 조회를 해보고, 호출순번도 고려해보세요.
		w1.getInfo();  // 부모쪽이 아니라 자식쪽 getInfo()이다.
		

	}

}
