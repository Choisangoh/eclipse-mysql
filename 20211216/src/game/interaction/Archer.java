package game.interaction;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	public Archer() {
		this.hp = 15;
		this.mp = 5;
		this.atk = 6;
		this.def = 0;
		this.exp = 0;
	}

	public void huntOrc(Orc orc) {
	    orc.doBattle(this.atk);	    
	    if(orc.getHp() > 0) {
	           this.hp = this.hp + this.def - orc.getAtk();
	  } else {
		  System.out.println("오크가 이미 죽었습니다.");		  
	  }
	    this.hp = this.hp + this.def - orc.getAtk();
	    System.out.println("교전 결과 원딜의 체력 " + this.hp);
	}	
	public void huntTroll(Troll troll) {
		troll.doBattle(this.atk);
		 if(troll.getHp() > 0) {
	          this.hp = this.hp + this.def - troll.getAtk();
	  } else {
		  System.out.println("트롤이 이미 죽었습니다.");		  
	  }
		this.hp = this.hp + this.def - troll.getAtk();
		System.out.println("교전 결과 원딜의 체력 " + this.hp);
	}
	public void huntSpark(Spark spark) {
	   spark.doBattle(this.atk);
         if(spark.getHp() > 0) {
           this.hp = this.hp + this.def - spark.getAtk();
  } else {
	  System.out.println("스파크가 이미 죽었습니다.");		  
  }
    this.hp = this.hp + this.def - spark.getAtk();
    System.out.println("교전 결과 원딜의 체력 " + this.hp);
}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
}
	
