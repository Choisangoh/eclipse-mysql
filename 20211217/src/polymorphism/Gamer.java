package polymorphism;

public class Gamer extends Person{
	
	private int money;
	public Gamer(String name, int age, int money) {
		super(name, age);
		this.money = money;
	}
public void showPerson() {
	super.showPerson();
   System.out.println("연봉은 " + money); 
   }
}
