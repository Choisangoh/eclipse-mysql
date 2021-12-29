import java.util.Scanner;

public class Scanner02P93 {

	public static void main(String[] args) {
		// Scanner 생성을 직접 해보세요
		Scanner scan = new Scanner(System.in);
		
		// 문자열을 입력받는 경우
		System.out.println("이름을 입력해주세요");  // 이런식으로 물어볼수도 있음
		String name = scan.nextLine();
		
		// 실수를 입력받는 경우
		System.out.println("키를 입력해주세요"); // 이런식으로 물어볼수도 있음
		double height = scan.nextDouble();
		
		
		System.out.println(name); // "이름 : " + 로 앞에 네임에 대한 설명도 가능
		System.out.println(height); // // "키 : " + 로 앞에 네임에 대한 설명도 가능

	}

}
