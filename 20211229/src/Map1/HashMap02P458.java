package Map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판 만들기
		// key는 음식이름, value는 가격(정수)로 저장
		// 메뉴는 5개 이상
		// 메뉴를 3개 조회해서 출력
		Map<String, Integer> map = new HashMap<>();
		// value 자리에 object를 쓰면 모든 자료형이 가능하다.
		// key, value 두곳에 object를 써도 가능하다.
		map.put("돌솥비빔밥", 5500);
		map.put("참치김밥", 3000);
		map.put("제육볶음", 6000);
		map.put("라면", 3500);
		map.put("치즈돈까스", 8000);
		System.out.println(map);
		
		System.out.println("치즈돈까스 가격 " + map.get("치즈돈까스"));
		System.out.println("참치김밥 가격 " + map.get("참치김밥"));
		System.out.println("제육볶음 가격 " + map.get("제육볶음"));		
	}
}
