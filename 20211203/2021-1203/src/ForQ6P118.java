import java.util.Scanner;

public class ForQ6P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을수 있도록 코드를 작성해주세요.
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는 생각해보세요.
		// 힌트 - 별 개수가 점점 늘어나는데, 점점 숫자가 커지는 변수가 뭐가 있을지 생각해보세요.
		for(int i=0; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}			
			System.out.println();
	  }
	}
}


// 내가 푼 방법 print는 가로를 말하고 println은 세로를 말하는데 별이 점점 늘어나려면
// 가로가 세로보다 하나 더 많아야 되기때문에 세로는 0부터 시작하고 가로는 1부터 시작해서 
// 즉, 가로(j) < 세로(i) + 1  되어야한다. 