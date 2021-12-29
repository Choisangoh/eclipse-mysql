package Interface1;

public class Train implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.name = name;
		this.speed = 0;
		this.gas = MAX_GAS;
	}
	
	@Override
	public void accel() {
		if(speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPD) {
				speed = TRAIN_MAX_SPD;
		}else {		
				speed += TRAIN_INCREASE_SPD;
		}
	}
	@Override
	public void breakSpeed() {
		if(speed - TRAIN_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
	    }else {
	    	speed -= TRAIN_DECREASE_SPD;
	    }		
    }
	@Override
	public void reFuel() {
		if(gas + TRAIN_INCREASE_GAS > MAX_GAS) {
			gas = MAX_GAS;
		} else {
		    gas += TRAIN_INCREASE_GAS;		
	   }	
	}
	@Override
	public void showStatus() {
		System.out.println("현재 속도 " + speed);
		System.out.println("현재 연료 " + gas);
		System.out.println("현재 주인 " + name);
		System.out.println("---------------------");
	}
}
