
public class SwitchCase02P101 {

	public static void main(String[] args) {
		// 범위인것처럼 switch~case문을 쓰고 싶다면
		// 하나의 break에 여러 case문을 연달아 작성합니다.
		
		int score = 5;
		
		switch(score) {
		case 10: // case별로 매칭할 때 break가 없으면 아래로 계속 흘러내려가는
		case 9: // 점을 이용해서 break를 전체에 다 걸지 않고 구간별로 걸어서 처리합니다.
			System.out.println("수");
			break;
		case 8:
		case 7:
			System.out.println("우");
			break;
		case 6:
		case 5:
			System.out.println("미");
			break;
		case 4:
		case 3:
			System.out.println("양");
		case 2:
		case 1:
			System.out.println("가");
		default :
			System.out.println(".");
		}

	}

}
