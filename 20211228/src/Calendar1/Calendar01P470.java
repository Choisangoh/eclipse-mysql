package Calendar1;

import java.util.Calendar;

public class Calendar01P470 {

	public static void main(String[] args) {
		// Calendar는 현재 시간을 일반 시간이 아닌 요일, 오전/오후 등으로
		// 달력기준으로 표기해주는 방식이다.
		// Calendar.getInstance(); 를 이용해 사용한다.
		// 추상클래스이므로 new키워드를 쓸 수 없다.
		Calendar now = Calendar.getInstance();
		
		// now.get(Calendar.얻고싶은정보); 를 이용해 정보를 얻어온다.
		System.out.println("년도 " + now.get(Calendar.YEAR));
		// 월은 0부터 시작한다.(0이 1월, 11이 12월이다.)
		System.out.println("월 " + now.get(Calendar.MONTH));
		// 일
		System.out.println("일 " + now.get(Calendar.DAY_OF_MONTH));
		// 요일도 얻을 수 있다. (1이 월요일, 7이 일요일, 0은 없음)
		System.out.println("요일 " + now.get(Calendar.DAY_OF_WEEK));
		// 오전은 0, 오후는 1
		System.out.println("오전 오후 여부 " + now.get(Calendar.AM_PM));
		// 몇시, 몇분, 몇초
		System.out.println("시 " + now.get(Calendar.HOUR));
		System.out.println("분 " + now.get(Calendar.MINUTE));
		System.out.println("초 " + now.get(Calendar.SECOND));		
	}
}
