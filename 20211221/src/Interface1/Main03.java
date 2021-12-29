package Interface1;

public class Main03 {

	public static void main(String[] args) {
		Vehicle a1 = new Airplane("비행기행기");
		
		a1.accel();
		a1.accel();
		a1.accel();	
		a1.showStatus();
		
		a1.breakSpeed();
		a1.showStatus();
		
		a1.reFuel();
		a1.reFuel();
		a1.reFuel();
		a1.showStatus();		
	}
}
