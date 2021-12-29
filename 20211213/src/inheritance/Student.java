package inheritance;
	
	// 상속 문법
	// 클래스 명칭 오른쪽에 <extends 부모클래스이름> 을 적습니다.
	// 이렇게 상속한 클래스는 부모, 자식클래스가 하나의 객체 내부에
	// 공존하는 형태로 메모리에 생성된다.
	
	public class Student extends Person{
		// name, age 공통속성 (이름,나이)이 아닌 학생만의 개인 특성 ex)학번
		public int stuNum;
		
		// getInfo()는 자동으로 작성된다.
        public void getStudentInfo() {
        	System.out.println("이름 : " + name + " , 나이 : " + age + " , 학번 : " + stuNum );
        }
}
