import java.util.Arrays;

public class EnhancedFor01P162 {

	public static void main(String[] args) {
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 넣는다.
		// 이 경우 반복실행 횟수는 내부요소 갯수만큼이다.
		
		// 7개의 요소를 묶어서 arr1에 저장
		int[] arr1 = {100, 211, 339, 475, 591, 600, 700};
		// arr1[순번]을 입력해서 내부 요소를 하나만 꺼낼 수 있음 
		// (순번은 0부터 시작)  ex)위에 arr1에서 100은 0번 211은 1번 339는 2번 순으로 
		System.out.println(arr1[5]); // ()안에 Arrays.toString 쓰면 arr1 모두 나옴
		
		// for(하나씩받을변수 : 배열) {
		//       실행문들...;
	    //    }
		
		// 배열 길이는 배열명.length로 확인 가능
		System.out.println(arr1.length);
		
		for(int item: arr1) {
		System.out.println(item);    
		  } // 꼭 item이 아니고 그냥 같기만 하면 됨.
	
		
		///////////향상된 for 문 이전////////
		// 배열명.length는 내부 요소를 대신 쓸수있음.
		 for(int i =0; i < 7; i++) {
    	 System.out.println(arr1[i]);
		   }
		
		
       }	
}