package game.inheritance;

public class Commoner {	
	// 이름과,레벨,체력,마나 4개의 속성
	protected String name;
	protected int lv;
	protected int hp;
	protected int mp;
	
	// 생성자에서 이름만 바꿀수 있도록
	public Commoner(String name) {
	 
	// 생성자 내부에서 맴버변수를 초기화 할때는 this. 을 붙이는 경우가 많다.
		this.lv = 1;
		this.hp = 20;
		this.mp = 10;
		this.name = name;
	}
		public void getInfo() {
			System.out.println("이름은 " + name + " 체력은 " + hp + " 마나는 " + mp + " 레벨은 " + lv);	
		}
}
