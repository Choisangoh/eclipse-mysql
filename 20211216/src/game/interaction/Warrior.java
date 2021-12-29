package game.interaction;

public class Warrior {		
		private int hp;
		private int mp;
		private int atk;
		private int def;
		private int exp;		
	 
  public Warrior() {
	this.hp = 20;
	this.mp = 10;
	this.atk = 4;
	this.def = 1;
	this.exp = 0;	
     }

  // 교전을 할 경우 상호간에 수치값이 교환 되어야 한다.
  // Warrior 쪽에서 Orc 쪽의 수치를 깎아주고,
  // Orc 쪽에서 Warrior 쪽의 수치를 깎아야 한다.
  public void huntOrc(Orc orc) {
	  // 전사가 오크를 떄리기 위해서 먼저 Orc의 doBattle을 호출합니다.
	  orc.doBattle(this.atk);
	  
	  // 전사도 오크에게 공격을 받습니다.
	  this.hp = this.hp + this.def - orc.getAtk();
	  System.out.println("교전 결과 전사의 체력 " + this.hp);	
  }
  
  public void huntTroll(Troll troll) { 
	  troll.doBattle(this.atk);
	  if(troll.getHp() > 0) {
	           this.hp = this.hp + this.def - troll.getAtk();
	  } else {
		  System.out.println("트롤이 이미 죽었습니다.");		  
	  }
	  this.hp = this.hp + this.def - troll.getAtk();
	  System.out.println("교전 결과 전사의 체력 " + this.hp);	    
}
  public void huntSpark(Spark spark) {
	   spark.doBattle(this.atk);
        if(spark.getHp() > 0) {
          this.hp = this.hp + this.def - spark.getAtk();
 } else {
	  System.out.println("스파크가 이미 죽었습니다.");		  
 }
   this.hp = this.hp + this.def - spark.getAtk();
   System.out.println("교전 결과 전사의 체력 " + this.hp);
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
