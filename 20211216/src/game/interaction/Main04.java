package game.interaction;

public class Main04 {

	public static void main(String[] args) {
		
		Magician m1 = new Magician();
		Archer a1 = new Archer();
		Warrior w1 = new Warrior();

		Spark s1 = new Spark();
		
		m1.huntSpark(s1);				
	    a1.huntSpark(s1);
		w1.huntSpark(s1);
		w1.huntSpark(s1);				
		w1.huntSpark(s1);
		
		

	}

}
