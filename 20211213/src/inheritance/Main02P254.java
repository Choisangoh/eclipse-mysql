package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들기
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주시고,
		// 학생은 그냥 알아서 작성v해주세요.
		
		Salaryman s1 = new Salaryman();
		s1.name = "최상오";
		s1.age = 23;
		s1.salary = 500000000;
		
		s1.getInfo();
		s1.getSalaryInfo();
	
		
		
		Student s2 = new Student();
		s2.name = "최상오";
		s2.age = 23;
		s2.stuNum = 01;
		
		s2.getInfo();
    	s2.getStudentInfo();
		

			
		}

	}

