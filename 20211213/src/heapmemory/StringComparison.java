package heapmemory;

public class StringComparison {

	public static void main(String[] args) {
		
		// 문자열은 같은 문자로 저장 시 같은 주소로 공유한다.
		String str1 = "Hello";  // hello 이므로 str 1과 2는 주소가 같다
		String str2 = "Hello";
		String str3 = "Hallo";  // hallo 이므로 주소가 다르다
	
		// 일반 변수의 배정 값 조회 시 .hashCode() 사용
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		// 문자열은 일부분만 변경이 불가능
		// ex) str1[0] == "0"; 안됨!
		
		// str1 == str2 과 같이 비교하는 것은
		// 문자열 비교가 아니라 주소 비교
		// new 키워드 생성 시 내용이 같은 문자열이라도
		// 별도의 공간을 새로 배정하여 만든다.
	    System.out.println(new String("Hello")); // new로 인해 공간 새로 생성
		System.out.println(str1 == new String("Hello")); // new로 인해 공간 새로 생성
	    System.out.println(str1 == str2);
	    
	    // 문자열 간 비교는 (주소말고 내욤물 간 비교) 
	    // .equals()로 진행
	    System.out.println(str1.equals(new String("Hello"))); // new로 인해 공간 새로 생성

	}

}
