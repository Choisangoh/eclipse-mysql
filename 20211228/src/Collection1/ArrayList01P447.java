package Collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01P447 {

	public static void main(String[] args) {
		// List는 생성자료형으로 ArrayList, LinkedList를 받을 수 있고,
		// 기본적으로는 ArrayList를 쓴다.
		// java.util의 List나 ArrayListf를 사용할 수 있다.
		
		// List는 생성시 List<자료형> 을 적어넣어 해당 자료형을
		// 가변 길이 배열형태로 받아줄 수 있다.
		// <>사이에는 기본형자료(int, double, boolean 등)은 쓸 수 없다.
		
		// 정수 자료를 받을 수 있는 리스트 생성 (길이는 가변적)
		List<Integer> list1 = new ArrayList<>();
		
		// 가변자료형이므로 추가하고싶은만큼 자료 추가 가능
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(1, 100); // 인덱스 1번에 100을 넣어서 기존번호들이 뒤로 한칸씩 밀려남.
		System.out.println(list1);
		list1.set(1, 99);
		System.out.println(list1);
	}
}
