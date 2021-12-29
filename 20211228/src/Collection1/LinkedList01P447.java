package Collection1;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01P447 {

	public static void main(String[] args) {
		// LinkedList는 자료의 변경이 빈번할 경우 사용하면 성능 향상이 있다.
		// 일반적인 상황에서는 ArraysList를 더 많이 쓰고
		// 결과적으로는 양 자료형간 사용법 차이는 없고 로직만 다르다.
		List<String> list1 = new LinkedList<>();
		
		list1.add("자바");
		list1.add("jsp");
		list1.add("스프링");
		list1.add("스프링부트");
		System.out.println(list1);
		
		// .remove()는 두 유형이 있다.
		// .remove(번호)를 넣으면 해당 인덱스의 자료가 삭제되고,
		// .remove(자료)를 넣으면 번호와 상관없이 자료를 삭제한다.
		list1.remove(0); // 0번 인덱스의 "자바" 삭제
		System.out.println(list1);
		
		list1.remove("스프링"); // 1번 인덱스의 "스프링" 삭제
		System.out.println(list1);
		
		// 리스트를 전체적으로 비우고 싶을때는 .clear()를 사용합니다.
		list1.clear();
		System.out.println(list1);
				
		// 4개 자료 아무거나 추가하기
		list1.add("망고");
		list1.add("복숭아");
		list1.add("수박");
		list1.add("자두");
		
		// 자료 정렬은 Collections.sort(정렬대상) 이다.
		Collections.sort(list1);
		System.out.println(list1);
	}
}
