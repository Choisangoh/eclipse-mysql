package game.interaction;

public class Spark {
	
	private int hp;
	private int atk;
	private int def;
	
	public Spark() {
		this.hp = 9;
		this.atk = 5;
		this.def = 2;
	}
	
	public void doBattle(int uAtk) {
		this.hp = this.hp + this.def - uAtk;
		if(this.hp <= 0) {
			this.hp = 0;
			System.out.println("스파크가 죽었습니다.");
		} else {
	}    System.out.println("스파크의 남은 체력 " + this.hp);
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
