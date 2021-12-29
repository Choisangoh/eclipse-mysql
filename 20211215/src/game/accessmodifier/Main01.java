package game.accessmodifier;

public class Main01 {

	public static void main(String[] args) {
		
	 // Magician 생성
		Magician m1 = new Magician("오늘의마법사");
     // 교전 전에 getInfo();로 정보 조회 실시.
		m1.getInfo();
     // hunt 실행
		m1.hunt();
	 // 사냥이 끝난 후 다시 정보를 조회해주세요.
		m1.getInfo();
	
        m1.fireball();
        m1.getInfo();
        
        m1.heal();
        m1.getInfo();
        
        
		
	}

}
