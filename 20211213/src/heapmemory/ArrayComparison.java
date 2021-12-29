package heapmemory;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		int[] arr3 = {1, 2, 3, 4, 5};
        arr1[0] = 10;
        
        // 그냥 출력하면 주소값이 나옴
        // 이때 arr1,arr2는 주소값이 같고 ( *arr1이 변하면 arr2도 변함)
        // arr3만 주소값이 다르다
       
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);	
        
        // 주소에 접근했을 때 나오는 자료 조회시
        // Arrays.toString(자료); 로 조회가능
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
	}	
}
      