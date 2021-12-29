package Arrays1;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// 이진 탐색(binary Search)는 탐색 알고리즘 중에서
		// 상위권의 성능을 보여주는 알고리즘이다.
		// 다만, 실행에 앞선 전제조건으로
		// 1. 배열 내부에 중복되는 값이 없을 것
		// 2. 배열이 오름차순(작은 숫자일수록 0번인덱스에 가깝게)일 것
		
		// 정렬이 안 된 상태의 배열 내부를 탐색할 때는 찾지 못함
		int[] arr1 = {5, 7, 6, 1, 3, 9, 0, 12};
		
		// 이진탐색 수행 명령어 : Arrays.binarySearch(배열명, 찾는값);
		int a = Arrays.binarySearch(arr1, 0);
		System.out.println(a);
		
		// 정렬이 된 상태의 배열을 탐색하는 경우
		int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		int b = Arrays.binarySearch(arr2, 14);
		System.out.println(b);
	}
}
