package Arrays1;

import java.util.Arrays;

public class Arrays06 {

	public static void main(String[] args) {
		// 유니코드를 활용하는 모든 문자
        String[] arr = {"최상오", "崔", "zxcv", "＠", "10000000000", "QWER", "こんにち"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
      }
   }
