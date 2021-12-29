package game.inheritance;

public class Archer extends Commoner{
	
	private int rDam;
	
	public Archer(String name) {
		super(name);
	    rDam = 5;
	}

	public void getInfo() {
		System.out.println("이름은 " + name + " 체력은 " + hp + " 마나는 " + mp + " 레벨은 " + lv + " 원거리데미지 " + rDam);
    
	}
}