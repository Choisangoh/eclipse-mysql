package structure;

public class PersonClass {
	// 사람 정보를 Person에서 만들었던 것처럼 만들어주시되
	// 여러분들이 추가하고 싶은 특성을 하나 더 추가해서 만들어주세요.
	public String name;// 이름
	public int age;// 나이
	public String pNum; // 연락처
	public int uNum; // 회원번호
	public boolean glasses;// 안경 착용 여부 / 착용 true, 미착용 false

	// 추가로 아까의 조회 메서드를 내부에 생성해주세요.
	// 클래스 내부에 생성할때는 static을 적지 않습니다.
	// 클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능합니다.
	public void getInfo() {
		System.out.println(name + "의 정보를 조회합니다.");
		System.out.println("이름 : " + name + 
							", 나이 : " + age + 
							", 폰번호 : " + pNum + 
							", 회원번호 : " + uNum + 
							", 안경착용 : " + glasses);
		System.out.println("===============================");
	}
}
