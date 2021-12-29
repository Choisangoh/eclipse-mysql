package Arrays1;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// sort는 숫자뿐 아니라 순번을 정할 수 있는 다른 자료형에도 작동한다.
		// 예를들어 문자(A = 65, a = 97)도 자기 숫자를 가지고 있기 떄문에
		// 문자도 정렬이 가능하다.
		// ASCII코드 규칙에 따라 정렬된다.
		// 문자열은 맨 앞글자!!! 의 ASCII코드 번호의 대소관계를 이용해 정렬된다.
		String[] arr = {"air", "Apple", "banana", "giraffe", "Zet","시리야","오늘"
				+ "","가자"};	
		Arrays.sort(arr);		
		System.out.println(Arrays.toString(arr));
	}
}
