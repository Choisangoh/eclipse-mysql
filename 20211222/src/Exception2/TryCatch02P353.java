package Exception2;

public class TryCatch02P353 {

	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch블록을 활요합니다.
		
		String[]name = {"김", "최", "정"};
	try {	 // for(int i = 0; i < 3; i++) {
	    	 // System.out.println(name[i]);
		     // }
	    	 for(String n : name) { // 향상된 for문은 절대 인덱스를 오버할 수 없음
	    		 System.out.println(n);
	    	 }	     
             System.out.println("이상 모든 학생 목록 ");
         } catch (Exception e) {
        	 System.out.println("더 이상 학생이 없는데 초과 인덱스를 조회했습니다.");
         } finally {
        	 System.out.println("집계가 끝났습니다.");
        }
	}
}