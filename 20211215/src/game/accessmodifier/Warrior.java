package game.accessmodifier;

public class Warrior extends Commoner{

	public Warrior(String name) {
		super(name);		
	}
	
	public void doubleAttack() {
		System.out.println("전사가 연속공격을 사용했습니다.");
		
		// 기존 체력 값 조정 (기준경험치 값() - 4);
		setHp(getHp()-4);
		// 기존 경험치값 조정 (기준경험치 값() + 25);
	    setExp(getExp()+25);
	}
    public void getInfo() {
    	System.out.println("현재 체력 "+ getHp() + " 현재 마나 "+ getMp() + " 현재 레벨"+ getLv() + 
				" 현재 경험치 "+ getExp() + " 닉네임 "+ getName());
    }
}
