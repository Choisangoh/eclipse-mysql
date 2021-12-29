package Final1;

public class FinalMain02P278 {

	public static void main(String[] args) {
		// 일반 숫자를 이용한 출력요소
		// System.out.println("전사 체력 " + 50);
		System.out.println(50);
		// System.out.println("몬스터 경험치 " + 20);
		System.out.println(20);
		
		// 자주 사용하게될 고정값은 아래와 같이 상수 처리해서
		// 코드에 대입을 해준다.
		// 이러면 변수명만으로도 어떤 의미를 가진 수치인지
		// 바로 유추가 가능하기 떄문에 코드 가독서이 높아진다.
		// 상수는 대문자로만 적으며 단어사이는 _로 연결한다. 
		final int WARRIOR_HP = 50; // " final int WARRIOR_HP = " 값만 바꾸면 된다.
		final int MONSTER_EXP = 20; // " final int MONSTER_EXP = " 값만 바꾸면 된다.
		
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		// 상수를 굳이 쓰는 2번째 이유는 값을 일괄적으로 바꾸기 편하기 때문에
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);			
	}
}
 