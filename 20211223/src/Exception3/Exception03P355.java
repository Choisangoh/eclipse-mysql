package Exception3;

public class Exception03P355 {

	public static void main(String[] args) {
		// 다중 catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을 때
		// 각각 예외유형을 다르게 처리할 때 사용한다.
		// 이떄 catch구문을 여러번 사용할 수 있다.
		
		int[] number = {1,2,3,4,5,0};
		
		// 예외가 발생할지도 모르느 코드부터 try블럭에 넣습니다.
		try {
			for(int i = 0; i < 6; i++) { // ArraryIndexOutOfBoundsException
				System.out.println(number[i]);
			}
		    System.out.println("0으로 나누기를 시도하겠습니다.");
			System.out.println(number[4] / number[5]); // ArithmeticException
			
			// catch는 try에서 예외가 발생하면 사용!
			
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");
		} catch(ArithmeticException ae) {
	    	System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) { 			
			System.out.println("예외가 발생했습니다.");
			// Exception e는 만능처리구문으로 어떤 예외라도 다 일괄적으로 처리해준다.
			// Exception e는 모든 예외처리구문의 최상위 부모 계층!!!
			// try~catch 또는 다중 catch에서 Exception e는 무조건 마지막에 입력해야한다!!
		}		   
    }
}