package accessmodifier2;

import accessmodifier.Warrior;

public class Main02P197 {

	public static void main(String[] args) {
		// 전사 하나  만들고 사냥을 3번 하세요.
		Warrior w1 = new Warrior("해피데이");
		
	    // w1.hp = 1000000;
	    // Package가 다르면 hp 변경 불가	
		
	   w1.hunt();
	   w1.hunt();
	   w1.hunt();
			
	}
}
