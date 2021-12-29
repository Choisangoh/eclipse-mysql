package StringBuilder1;

public class Builder03P408 {

	public static void main(String[] args) {
		// Delete는 말 그대로 문자열의 일부, 혹은 전체를 삭제한다..
		// Delete(시작인덱스번호, 끝인덱스번호)를 입력하면
		// 시작지점부터 끝지점 사이를 삭제해준다.
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
		a.delete(3, 10); // 3번부터 9번(10번 전까지)지워짐
		// 3,3 은 지워지는게 없음
		System.out.println(a);
	}
}

