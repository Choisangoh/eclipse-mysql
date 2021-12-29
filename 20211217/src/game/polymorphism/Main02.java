package game.polymorphism;

public class Main02 {

	public static void main(String[] args) {
		
		Commoner c1 = new Commoner("초보자");
	    Monster s1 = new Sandman();
	    Monster h1 = new Hulk();
	    Monster d1 = new Devil();

	    c1.hunt(s1);
	    c1.hunt(h1);
	    c1.hunt(d1);
	    
	}
}
