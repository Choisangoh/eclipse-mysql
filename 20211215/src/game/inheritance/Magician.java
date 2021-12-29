package game.inheritance;

public class Magician extends Commoner{
	
	private int mDam;
	
	public Magician(String name) {
		super(name);
		mDam = 4;
	}
	
	public void getInfo() {
		System.out.println("이름은 " + name + " 체력은 " + hp + " 마나는 " + mp + " 레벨은 " + lv + " 마법데미지 " + mDam);
	   }
	}
	


