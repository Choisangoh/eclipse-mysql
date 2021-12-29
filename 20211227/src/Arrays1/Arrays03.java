package Arrays1;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Arrays.copyOfRange()는 copyOf()와 유사하지만
		// 시작이 0번 인덱스로 고정되는 copyOf 와 달리
		// copyOfRange(시작번호, 끝번호 +1); 와 같이
		// 시작지점과 끝지점을 둘 다 정할 수 있다.
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] arrCopy = Arrays.copyOfRange(arr, 3, 7); // 인덱스 번호 3~6 (3, 4, 5, 6), 7은 포함 안됨
		System.out.println(Arrays.toString(arrCopy));
		
		// 끝인덱스 범위를 벗어나면 0으로 채워진다.
		int[] arrCopy2 = Arrays.copyOfRange(arr, 8, 13);
		System.out.println(Arrays.toString(arrCopy2));
	}
}
