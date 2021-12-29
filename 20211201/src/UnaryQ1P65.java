
public class UnaryQ1P65 {

	public static void main(String[] args) {
		// int a에 15를 담은 다음 전위에서 후위 순으로 --를 사용해서
		// 1씩 차감하고, 콘솔에 찍기
		// 단, 실행 로직은 하단에 주석으로 하단에 풀어서 작성까지 해야됨
		
		int a=15;
		System.out.println(--a); // int a=15에서 전위수식 -- 붙었기 때문에 14 출력
		System.out.println(a); // 14 그대로 출력
		System.out.println(a--); // 14에서 후위수식 -- 붙었기 때문에 일단 14 출력
		System.out.println(a); // 위에서 14에서 후위수식 -- 붙었기 때문에 1 감소하여 13 출력								
	}

}
