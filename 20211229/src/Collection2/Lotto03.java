package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터 만들기 
		// 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
		
		
		// 당첨번호 6개를 뽑기
		List<Integer> lotto = new ArrayList<>();
		
		// 당첨번호를 받을 수 있는 변수 생성 후 0으로 초기화
		int getNum = 0;
		
		// 바퀴수를 알면 for문으로, 모르면 while문으로
				
		// while문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되도록
		while(lotto.size() != 6) { // "!=6은 6이 아니다" 이다.
		// 번호 뽑기
		getNum = (int)(Math.random() * 45) + 1; // "* 45"는 0부터 44이므로 +1을 시켜서 범위가 1~45가 되도록
		// 번호가 만약 기존에 뽑은 번호 목록에 포함되어있지 않다면, "!" 를 붙여서 없으면 true가 되도록
		if(!lotto.contains(getNum)) {
		     // 추가하기
			 lotto.add(getNum);
		}
	  }
	     // 다 돌면 정렬하기
		 Collections.sort(lotto);
	    // 당첨번호 보여주기
	    System.out.println("당첨번호 " + lotto);
	    
	    	    
	    // 구매한 번호 6개를 뽑기
        List<Integer> lotto2 = new ArrayList<>();
		
		// 구매한 번호를 받을 수 있는 변수 생성 후 0으로 초기화
		int getNum2 = 0;
		
		// 반복문이 몇 바퀴 돌았는지 카운팅하는 로직 추가
		// 반복문 진입 전에 int count = 0;을 만들어놓고
		int count = 0;		
				
		// 당첨번호와 구매번호가 일치하면 반복 중지
		// 아래 6개 뽑고 비교하는 부분을 반복문으로 처리해야한다.
		// 조건식은 당첨인 경우 탈출
		while(!lotto.equals(lotto2)) { // "!" 는 같지않다면 이라는 뜻	
			lotto2.clear();	// 6개가 이미 뽑혀있는 상황이라면 .clear();를 사용해서 안에 자료가 초기화되도록		
			
			// while문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되도록
			while(lotto2.size() != 6) { // "!= 6은 6이 아니면" 이다. ( "< 7"도 가능)
			// 번호 뽑기
			getNum2 = (int)(Math.random() * 45) + 1; // "* 45"는 0부터 44이므로 +1을 시켜서 범위가 1~45가 되도록
			// 번호가 만약 기존에 뽑은 번호 목록에 포함되어있지 않다면 "!" 를 붙여서 true가 되도록
			if(!lotto2.contains(getNum2)) {
			     // 추가하기
				lotto2.add(getNum2);
		}
	  }
	     // 다 돌면 정렬하기
		 Collections.sort(lotto2);   
	    // lotto1,lotto2 내부가 같은자료(번호)인지 확인
	    System.out.println("" + lotto + lotto2);	
	    // 다른자료면 다시 .clear(); 시키고 다시 돌린다.
	    
	    // 모든 로직이 끝난 시점이 번호를 1세트 뽑은 시점임
	    // 그러므로 모든 로직이 다 끝나고 마지막에 count++; 을 이용해 1씩 증가
	    count++;
    }
	   // 탈출 후에 콘솔에 최종횟수가 찍히도록
	   System.out.println("구매한 로또복권 개수 " + count);
  }
}	
    
  
