package StringBuilder1;

public class Builder05_1P408 {

	public static void main(String[] args) {
			StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
			
			int b = 0;
			while(b < a.length()) {
				a.deleteCharAt(b);
				System.out.println(a);
				b += 3;	
		}
	}
}
