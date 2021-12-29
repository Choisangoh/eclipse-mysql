package game.interaction;

public class Troll {
	
	private int hp;
	private int atk;
	private int def;
	
	public Troll() {
		this.hp = 10;
		this.atk = 5;
		this.def = 2;
	}
	
	public void doBattle(int uAtk) {
		this.hp = this.hp + this.def - uAtk;        
		if(this.hp <= 0) { // 전사의 공격으로 트롤이 죽었다면(트롤 체력이 0)
			this.hp = 0; // 필수는 아님, 죽은 트롤 체력을 0으로 보정
			System.out.println("트롤이 죽었습니다.");		
			// else{ 대신 return; 사용 가능
		}else {	
			
		}
		System.out.println("트롤의 남은 체력 " + this.hp); // 트롤이 안 죽어야 실행됨
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
