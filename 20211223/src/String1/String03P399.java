package String1;

import java.util.Scanner;

public class String03P399 {

	public static void main(String[] args) {
		// Scanner를 통해서 전체 문장을 입력받고,
		// 다음으로 문장내에서 찾고싶은 단어를 추가로 입력받으세요.
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇개가 검출됬는지
		// 출력해주는 코드를 작성해보세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력하세요");
		String sentence = scan.nextLine();
		
		System.out.println("문장 내에서 카운팅할 단어를 입력하세요");
		String searchVoca = scan.nextLine();	
		
		// 갯수 카운팅
		int count = 0;
		
		// 반복문 추가 실행 여부
		boolean bool = true;
		
		// 마지막으로 발견된 지점 fidx(최종 찾은 지점) 사용, 인덱스는 0번부터 시작하므로 0보다 작아야함.
		int fidx = -1; 
		// 몇바퀴 돌지 모르니까 while문 사용
		while(bool) {
			int get = sentence.indexOf(searchVoca, fidx + 1); 
			// 현재 fidx = -1 이므로 +1을 붙여서 인덱스 처음 시작인 0번부터 찾도록			
			// indexOf를 실행했는데 -1이 나오면
			// 더이상 찾을 필요가 없다는 의미다.
			if(get == -1) {
			// get에 -1이 저장된다면 조회할 필요가 없으므로 bool을 false로 바꿔서
		    // while문을 탈출하게 한다.
			// break문으로도 탈출 가능
				bool = false;
			}else {
				// 마지막 발견지점 갱신
				fidx = get;
				count++; // 글씨 카운트 증가
				System.out.println(get + "번 인덱스에서 " + count + "번째 " +
				searchVoca + "이(가) 검출되었습니다.");
			}			
		}
		System.out.println(searchVoca + "의 총 출현 횟수는 " + count + "회 입니다.");
	}
}

