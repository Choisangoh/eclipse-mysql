package String1;

import java.util.Scanner;

public class String10P399 {

	public static void main(String[] args) {
        // 로그인 로직 만들기
		
		
		// 먼저 String id에 여러분이 설정한 임의 아이디를
		// String pw에 임의 비밀번호를 설정하세요.
		String id = "asd0000";
		String pw = "1234";
						
		
		// 다음 사용자에게 Scanner를 이용해
		Scanner scan = new Scanner(System.in);
		
		// uId 변수에는 아이디를(사용자가 입력)
		System.out.println("사용자 아이디를 입력해주세요.");
		String uId = scan.nextLine();
				
		// id가 일치하지 않으면 "그런 아이디는 없습니다."
		if(uId.equals(id)) {
			System.out.println("비밀번호를 입력해주세요.");
		} else {
			System.out.println("그런 아이디는 없습니다.");
		}
		// uPw 변수에는 비밀번호를(사용자가 입력)받아서
		String uPw = scan.nextLine();
	    if(uPw.equals(pw)) { // 조건문을 이용해서 id,pw가 입력받은 자료와 모두 일치하면
		                     // "XX님이 로그인 했습니다."
			System.out.println(id +"님 환영합니다.");
		
		}else { // id는 일치하나 비밀번호가 틀렸으면 "비밀번호가 틀렸습니다."		
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
}
