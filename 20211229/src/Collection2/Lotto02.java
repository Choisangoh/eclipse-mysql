package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto02 {

	public static void main(String[] args) {
		// List 역시 참조형 변수이기 때문에 비교시 주소값끼리 비교한다.
		// 따라서 단순 == 비교가 아닌 리스트1.equals(리스트2)
		// 를 이용해서 주소값이 아닌 실제 힙에 저장된 데이터 비교를 해줘야 
		// 로또복권 리스트 내부 숫자가 일치하는지 비교를 할 수 있다.
		// equals는 내부 요소의 순서까지 같이 비교한다.
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();		
		System.out.println("주소값 비교 " + (l1 == l2));
		
		// 둘다 빈 리스트여서 내부에 든 자료끼리만 비교할 떄는 true가 나온다.
		System.out.println("" + l1 + l2);
		System.out.println("내부 자료 " + l1.equals(l2));
		
		// l1과 l2에 각각 요소를 입력하되, 순서에 따른 결과 확인하기
		// l1, l2에 같은 자료 넣기 (같은 번호를 같은 리스트에 넣지 않기)
		// 순번을 같게 넣어서 비교하기!!! 
		l1.add(1);
		l1.add(2);
		l2.add(2);
		l2.add(1);
		// Collections.sort(l2); 하면 true 안하면 순서가 달라서 false
		System.out.println("내부 자료 " + l1.equals(l2));
	}
}
