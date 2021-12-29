package Date1;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// Date는 날짜를 표현하는 클래스로 DB등과 통신할 때 
		// Date를 이용해서 날짜자료를 받거나 넘겨주는것이 권장된다.
		// 사용시 import java.util.Date 를 해야한다.
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);
		
		// 표현되는 양식을 바꿀 떄 SimoleDateFormat을 활용한다.
		// import를 추가로 해야한다. ctr + space를 활용하세요.
		// 괄호 사이에 양식을 넣어야한다. yyyy는 연도, MM는 월, dd는 일, HH는 시, mm는 분, ss는 초)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM"); 
	    String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		// now 변수에 들어있는 출력양식을 2021년 12월 27일 aa시 bb분 cc초로 변경해서 콘솔에 찍으세요.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년-MM월-dd일-HH시-mm분-ss초 / 기준시 : z");
		String strNow3 = sdf2.format(now);
		System.out.println(strNow3);				
	}
}
