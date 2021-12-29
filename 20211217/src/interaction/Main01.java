package interaction;

public class Main01 {

	public static void main(String[] args) {
		
		Seller s1 = new Seller(30, 20);
		Buyer b1 = new Buyer(100000);
		
		s1.showSeller();
		b1.showBuyer();
		
		b1.buyApple(s1, 10);
		b1.buyOrange(s1, 6);
		
		s1.showSeller();
		b1.showBuyer();

	}

}
