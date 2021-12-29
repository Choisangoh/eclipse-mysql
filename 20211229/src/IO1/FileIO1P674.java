package IO1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO1P674 {

	public static void main(String[] args) throws IOException {
		// 외부 텍스트파일을 만들기 위해 FileOutputStream 사용한다.
		// 변수를 만들고 거기에 파일 경로를 적는다.
		// main메서드에 반드시 throws IOException을 작성해야 한다.
		// FileOutputStream output =
		//		 new FileOutputStream("c:/io/test.txt");
		
		// 간편한 사용을 위해 FileOutputStream 자료형 대신
		// FileWriter 자료형을 쓸 수 있다.
		FileWriter output = new FileWriter("c:/io/test.txt");	
		
		// .writer("내용")을 이용해 메모장 내부에 필기 가능
		// 단, 줄바꿈이 자동으로 안 되기 떄문에 줄바꿈이 필요한 부분에
		// \n을 추가로 붙여줘야 한다.
		output.write("777");
		
		// .close();를 사용해서 저장까지 해줘야 내용이 적힌 파일이 남는다.
		output.close();
	}
}
