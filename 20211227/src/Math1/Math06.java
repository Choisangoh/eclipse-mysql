package Math1;

public class Math06 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보세요.
		// Math.random()을 이용해 1/3확률로 가위,바위,보를 부여받으며
		// 가위 > 보, 바위 > 가위,  보 > 바위 상성을 가집니다.
		// 같은 요소가 나오면 무승부
		// 0 = 가위, 1 =  바위,  2 = 보
		
	   // int myValue = (int)(Math.random() * 3); 
	    // Math.random() * 3 의 범위는 0~2 
	   // int comValue = (int)(Math.random() * 3);	 
/*
	    if(myValue == 0 &                                                   & comValue == 2) { // 나 가위 컴 보
	    	System.out.println("내가 이겼습니다.");
	    	System.out.println("내가 낸 것(가위) " + myValue);
			System.out.println("컴퓨터가 낸 것(보)" + comValue);
	    }else if(myValue == 0 && comValue == 1) { // 나 가위 컴 바위
	    	System.out.println("컴퓨터가 이겼습니다.");
	    	System.out.println("내가 낸 것(가위) " + myValue);
			System.out.println("컴퓨터가 낸 것(바위) " + comValue);
	    }else if(myValue == 1 && comValue == 2) { // 나 바위 컴 보
	    	System.out.println("컴퓨터가 이겼습니다.");
	    	System.out.println("내가 낸 것(바위) " + myValue);
			System.out.println("컴퓨터가 낸 것(가위) " + comValue);
	    }else if(myValue == 1 && comValue == 0) { // 나 바위 컴 가위
	    	System.out.println("내가 이겼습니다.");
	    	System.out.println("내가 낸 것(바위) " + myValue);
			System.out.println("컴퓨터가 낸 것(가위) " + comValue);			
        }else if(myValue == 2 && comValue == 0) { // 나 보 컴 가위
	    	System.out.println("컴퓨터가 이겼습니다.");
	    	System.out.println("내가 낸 것(보) " + myValue);
			System.out.println("컴퓨터가 낸 것(가위) " + comValue);		 
        }else if(myValue == 2 && comValue == 1) { // 나 보 컴 바위
	    	System.out.println("내가 이겼습니다.");
	    	System.out.println("내가 낸 것(보) " + myValue);
			System.out.println("컴퓨터가 낸 것(바위) " + comValue);
         }else {
            System.out.println("무승부 입니다.");
         }    
 */
	    int myValue = (int)(Math.random() * 3); 
	    // Math.random() * 3 의 범위는 0~2 
	    int comValue = (int)(Math.random() * 3);
	    
	    final int SCISSORS = 0;
	    final int ROCK = 1;
	    final int PAPER = 2;
	    
	    if((myValue == SCISSORS && comValue == PAPER) ||
	      (myValue == ROCK && comValue == SCISSORS) ||
	      (myValue == PAPER && comValue == ROCK)) { 
	    	System.out.println("내가 이겼습니다.");
	} else if((myValue == PAPER && comValue == SCISSORS) ||
		     (myValue == SCISSORS && comValue == ROCK) ||
		     (myValue == ROCK && comValue == PAPER)) {
		System.out.println("컴퓨터가 이겼습니다.");
	}else {
		System.out.println("무승부입니다.");
	}
	// 내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 지원해주는 배열
	String[] items = {"가위", "바위", "보"};
	
	// 내가 낸 것과 컴퓨터가 낸 것을 출력해주는 부분
    System.out.println("내가 낸 것 " + items[myValue]);
    System.out.println("컴퓨터가 낸 것 " + items[comValue]);
	}	
 }

