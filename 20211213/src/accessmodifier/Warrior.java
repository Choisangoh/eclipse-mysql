package accessmodifier;

public class Warrior { // 지금은 정의부, 실제 실행은 main에서 할 예정
	// hp. mp. lv, atl, def, exp, name;
	// 선언 
	// 변수값은 현실에서도 특정한 물체나 사람의 상태가 휙휙 바뀌지 않으므로
	// 외부에서 값을 함부로 고칠 수 없도록 private으로 처리한다. 
	// 기본은 public으로 처리

	
	// ***변수는 private / 메서드는 public ***
	
	
	private String name;  // 기본 public String name;
	private int hp; // 기본 public int hp;
	private int mp;
	private int lv;
	private int atk;
	private int def;
	private int exp;
	
	// 생성자를 만들되, name만 사용자에게 입력받고,
	// 체력20, 마나10, 레벨1, 공격력3, 방어력0, 경험치0 이 대입되도록 처리하세요.
	// 생성자 규칙 : 클래스명과 동일한 이름의 메서드를 만들되, 리턴자료형이 없음
	public Warrior(String n) {
		name = n;
		hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;		
		System.out.println("전사 생성 완료");
		System.out.println("아이디 : " + name + "입니다.");
	}	
	
	// hunt 메서드를 만들어보겠습니다.
	// 이 메서드는 실행시 사냥을 하는데 체력이 2깎이고 경험치가 10 올라갑니다.
	// 사냥 결과 체력이 X이 되었고, 누적 경험치는 Y입니다 라고 출력합니다.
	// 생성자를 비롯한 메서드는 행동을 나타내고 
	// 이런 행동의 성공/실패 여부는 오로지 정보(변수) 의해 결정되며
	// 시도 자체는 제한을 두지 않는다.
	
	public void hunt() {
		hp -= 2;
		exp += 10;
		System.out.println("현재 체력이"+ hp + "가 되었고, 누적 경험치는 " + exp +"입니다.");
	}
	
}
	
	
