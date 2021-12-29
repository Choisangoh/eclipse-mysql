package polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Person p1 = new Person("사람", 23);
		Person g1 = new Gamer("게이머", 18, 50000000);
		Person y1 = new Player("선수", 25, "롯데자이언츠");
		
		p1.showPerson();
		g1.showPerson();
		y1.showPerson();
		

	}

}
