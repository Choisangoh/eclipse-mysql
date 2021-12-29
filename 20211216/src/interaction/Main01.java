package interaction;

public class Main01 {

	public static void main(String[] args) {
		// 판매자 생성
		Seller s1 = new Seller(15);
		Seller s2 = new Seller(6);
		// 구매자 생성
		Buyer b1 = new Buyer(100000);
				
		s1.showSeller(); // 판매자1 정보
		s2.showSeller(); // 판매자2 정보
		b1.showBuyer(); // 구매자1 정보
		
		System.out.println("=======s2에게 구매===========");		
		b1.buyKiwi(s2, 6);		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
		System.out.println("=======s1에게 구매===========");		
		b1.buyKiwi(s1, 10);
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();					
	}
}

