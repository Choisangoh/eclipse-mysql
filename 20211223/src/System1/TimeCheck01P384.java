package System1;

public class TimeCheck01P384 {

	public static void main(String[] args) {
		// currentTimeMillis의 자료는 long형에 저장해야 한다.
		
		// 시작 시점
		long start = System.currentTimeMillis();
		System.out.println("시작시간 " + start);
		
		long all = 0;
		
		for(int i = 0; i < 2000000001; i++) {
			all += i;
		}
		System.out.println("1부터 20억까지 다 더하면 " + all);
		
		// 끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println("끝난시간 " + end);
		System.out.println("소요시간 " + (end - start));		
	}
}
