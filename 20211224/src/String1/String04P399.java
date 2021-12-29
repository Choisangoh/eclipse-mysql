package String1;

public class String04P399 {

	public static void main(String[] args) {
		// length()는 문자열의 길이를 알 수 있다.
		// 정수로 몇 글자인지 알려준다.
		String name ="김수한무 거북이와 두루미 삼천갑자 동박삭 치차카포 사리사리센타";
		System.out.println(name.length());
		
		
		
		// replace는 찾아바꾸기이다.
		// .replace("찾을단어", "바꿔줄 단어") 순으로 입력한다.
		String report = "안녕하세요, 리포트 보고자는 김영수, 김영수 입니다.";
		
		// report 자체가 변경되지 않으므로, 아래처럼 저장까지 해줘야한다.
		report = report.replace("김영수", "최상오");
		
		// 아래는 report의 변경사항을 저장하지 않은 경우
		// report.replace("김영수", "최상오");
		
		System.out.println(report);
	}
}
