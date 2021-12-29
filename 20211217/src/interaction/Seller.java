package interaction;

public class Seller {
	
	private int money;
	private int apple;
	private int orange;
	
	public Seller(int apple, int orange) {
		this.money = 0;
		this.apple = apple;
		this.orange = orange;
	}
	public void Sellapple(int apple) {
		if(this.apple < apple) {
			System.out.println("사과가 없습니다. 현재 사과재고 " + this.apple);
			return;
		}
		this.apple -= apple;
		this.money += apple*1500;
	}
	public int getApple() {
		return this.apple;
	}
	public void Sellorange(int orange) {
		if(this.orange < orange) {
			System.out.println("오렌지가 없습니다. 현재 오렌지재고 " + this.orange);
			return;
		}
		this.orange -= orange;
		this.money += orange*2500;
	}
	public int getOrange() {
		return this.orange;
	}
	public void showSeller() {
		System.out.println("---상인정보---");
		System.out.println("현재 소지금 " + this.money + " 현재 사과재고 " + this.apple + " 현재 오렌지재고 " + this.orange);
	}	
}

