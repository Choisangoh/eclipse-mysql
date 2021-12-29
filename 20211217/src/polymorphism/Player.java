package polymorphism;

public class Player extends Person{
    
	private String team;
	public Player(String name, int age, String team) {
		super(name, age);
		this.team = team;
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("소속팀은 " + team);
	}
}
