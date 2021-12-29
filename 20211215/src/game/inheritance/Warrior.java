package game.inheritance;

// Commoner 상속 실시
public class Warrior extends Commoner{
		
	private int pDam;   // 자식클래스인 워리어의 특성인 물리데미지 생성
	
	public Warrior(String name) {
		super(name);   // 생성자 내부에서 다른 코드들 전에 가장 먼저 1순위로 적어야함.
		this.pDam = 3; // 자식클래스인 워리어의 특성인 물리데미지 수치 생성
	}
	
	public void getInfo() {
		System.out.println("이름은 " + name + " 체력은 " + hp + " 마나는 " + mp + " 레벨은 " + lv + " 물리데미지 " + pDam);
		                         // Commoner의 변수들이 private면 안되고, protected로 되있어야 가능
		
	}
				
}


