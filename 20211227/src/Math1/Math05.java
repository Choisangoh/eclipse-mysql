package Math1;

public class Math05 {

	public static void main(String[] args) {
		// 주사위 게임을 만들어보세요.
		// 주사위게임은 내 값은 myValue변수에
		// 컴퓨터값은 comValue 변수에 값을 난수발생으로 1~6으로 부여해서
		// 값이 같다면 무승부, 아니라면 나 혹은 컴퓨터 중 승자가 누구인지 알려줍니다.
		
		int myValue = (int)(Math.random() * 6) + 1; 
		// Math.random() * 6은 0~5 사이 숫자를 가지므로 +1을 붙여서 1~6 사이 숫자를 가지도록 한다.
		int comValue = (int)(Math.random() * 6) + 1;
		
		if(myValue == comValue) {
			System.out.println("무승부입니다.");
			System.out.println("내 값 " + myValue);
			System.out.println("컴퓨터 값 " + comValue);
		} else if(myValue > comValue) {
			System.out.println("내가 승리했습니다.");
			System.out.println("내 값 " + myValue);
			System.out.println("컴퓨터 값 " + comValue);
	}else {
		System.out.println("컴퓨터가 승리했습니다.");
		System.out.println("내 값 " + myValue);
		System.out.println("컴퓨터 값 " + comValue);
      }
   } 
}