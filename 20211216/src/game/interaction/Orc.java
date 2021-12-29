package game.interaction;

public class Orc {
	
	private int hp;
	private int atk;
	private int def;

	public Orc() {
		this.hp = 5;
		this.atk = 3;
		this.def = 0;
	}
	
	// 워리워와의 교전
	// doBattle은 유저의 공격력을 받아서 오크의 체력을 차감한다.
	public void doBattle(int uAtk) {
	    // Orc의 체력을 유저 공격력 만큼 차감시켜주세요.
		this.hp = this.hp + this.def - uAtk;
		if(this.hp <= 0) { // 전사의 공격으로 오크가 죽었다면(오크 체력이 0)
			this.hp = 0; // 필수는 아님, 죽은 오크 체력을 0으로 보정
			System.out.println("오크가 죽었습니다.");		
			// else{ 대신 return; 사용 가능
		}else {	
	}				
		System.out.println("오크의 남은 체력 " + hp);
}
	
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}
