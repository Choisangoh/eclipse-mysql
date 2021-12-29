package game.accessmodifier;

public class Magician extends Commoner{
	
	public Magician(String name) {
		super(name);
	}
	
	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		// hp -= 2; 를 직접 실행할 수 없으므로
		// public인 setter(setup)를 이용합니다.
		// ex) setHp(5); 인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청이다.
		setHp(getHp()-3);
		
		// 경험치도 마찬가지로 setExp();
		// exp += 10; 를 직접 할 수 없으므로
		// setExp(); 을 활용합니다.
		setExp(getExp()+20);   // Exp가 20씩 늘어나게 해주고 싶으면 getExp()+20을 넣으면 가능
	}		
	
	// fireball 메서드를 생성해주세요.
	// 마나가 3 줄고, 경험치는 20 증가
	public void fireball() {
		System.out.println("마법사가 화염구 스킬을 사용합니다.");
		setMp(getMp()-3);
		setExp(getExp()+20);
	}
	// heal 메서드 생성
	// 마나가 2 줄고, 체력이 10 회복
	public void heal() {
		System.out.println("마법사가 회복을 사용합니다.");
		setMp(getMp()-2);
		setHp(getHp()+10);
	}
	
	public void getInfo( ) {
		// 심지어 private 요소는 수정이 아닌 조회도 불가능하다.
		System.out.println("현재 체력 "+ getHp() + " 현재 마나 "+ getMp() + " 현재 레벨"+ getLv() + 
				" 현재 경험치 "+ getExp() + " 닉네임 "+ getName());
		
	}
}
