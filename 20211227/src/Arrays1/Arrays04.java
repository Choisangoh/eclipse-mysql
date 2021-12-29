package Arrays1;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// Arrays.sort(배열);은 배열 내부 순서를
		// 작은 숫자일수로 0번 인덱스에 가깝게
		// 큰 숫자일수록 마지막 인덱스에 가깝게 배치한다.
		int[] arr = {216, 6570, 462, 53, 1, 5, 36, 10009};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));		
	}
}
