package constructor;

public class Main02P204 {

	public static void main(String[] args) {
		// 실패사례
		BasketballPlayer bp1 = 
				new BasketballPlayer(175, 120); // 키, 점프력 순으로 전달
		bp1.dunkShoot();
		// 성공사례
		BasketballPlayer bp2 = 
				new BasketballPlayer(185, 120); // 키, 점프력 순으로 전달
		bp2.dunkShoot();
	}

}
