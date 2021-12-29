package constructor;

// 농구선수를 자바 내에서 구현합니다.
public class BasketballPlayer {
	public int height; // 키(신장) 
	public int jumpHeight; // 점프력 
	// 변수는 첫단어 첫글자는 소문자, 이후 단어 첫글자는 대문자 나머지는 소문자로 작성
	// 위 표기법을 카멜케이스라고 부릅니다.
	
	//생성자 생성
	public BasketballPlayer(int h, int j) {
		height = h;
		jumpHeight = j;
		System.out.println("생성된 선수의 키 : " + height + ", 점프력 : " + jumpHeight);
	}
	
	// 덩크슛하기 라는 행동을 작성합니다.
	public void dunkShoot() {
		// 키 + 점프력이 300이 넘는다면 덩크에 성공했다는 메세지를 보내주기위해 조건문 작성
		if((height + jumpHeight) > 300) {
			System.out.println("덩크슛에 성공했습니다.");
		} else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}
}
