package interaction;

public class Buyer {
	
	private int money;
	private int apple;
	private int orange;
	
	public Buyer(int money) {
		this.money = money;
		this.apple = 0;
		this.orange = 0;
	}
	public void buyApple(Seller seller, int apple) {
		if(apple*1500 > this.money) {
			System.out.println("돈이 부족합니다. 현재 소지금 " + this.money );
			return;
		}
		this.money -= apple*1500;
		this.apple += apple;
		seller.Sellapple(apple);
	}
	public void buyOrange(Seller seller, int orange) {
		if(orange*2500 > this.money) {
			System.out.println("돈이 부족합니다. 현재 소지금 " + this.money);
			return;
		}
		this.money -= orange*2500;
		this.orange += orange;
		seller.Sellorange(orange);
	}
	public void showBuyer() {
		System.out.println("---구매자 정보---");
		System.out.println("구매한 사과 " + apple + " 구매한 오렌지 " + orange + " 잔여금액 " + money);	
		System.out.println("------------------------");
    }
}