package Collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02P447 {

	public static void main(String[] args) {
		// 직접 String 자료를 가변적으로 받을 수 있는 
		// ArrayList를 만들고 안쪽에 자료로
		// "사과" "딸기" "망고" "블루베리" "파인애플" 을 넣으세요.
		// 자료가 적재된 ArrayList를 콘솔에 찍으세요.
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("사과");
		list1.add("딸기");
		list1.add("망고");
		list1.add("블루베리");
		list1.add("파인애플");
		System.out.println(list1);
		
		list1.add(3, "오렌지");
		System.out.println(list1);
		
		list1.set(0, "애플");
		System.out.println(list1);
		
		// .contains("자료")는 리스트 내에 찾는 자료가 있으면 true
		// 없으면 false 출력
		System.out.println(list1.contains("망고"));
		System.out.println(list1.contains("복숭아"));
		
		// .get(번호)는 주어진 인덱스에 저장된 자료를 조회해준다.
		System.out.println(list1.get(1));
		// 없는 인덱스번호를 입력하면 에러가 발생해서 전체 코드가 종료된다.
		// System.out.println(list1.get(8));
		
		// .size()로 내부 요소 개수를 확인할 수 있다.
		System.out.println(list1.size());
		
		// .isEmpty()는 비어있는지 여부를 체크한다.
		System.out.println(list1.isEmpty());
		
		// 빈 리스트2를 만들어서 .isEmpty()와 .size()를 조회해보세요.
		List<String> list2 = new ArrayList<>();		
		System.out.println(list2.isEmpty());
		System.out.println(list2.size());
	}
}
