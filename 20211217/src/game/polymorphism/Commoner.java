package game.polymorphism;

public class Commoner {
	// 속성(필드, 변수)값으로 name,hp,mp,atk
    private String name;
	private int hp;
	private int mp;
	private int atk;

	// 생성자로 위 필드를 초기화 하도록 설정해주세요.
	public Commoner(String name) {	
       this.name = name;	
       this.hp = 20;
       this.mp = 10;
       this.atk = 4;
    }
	// 다형성을 적용해서 어떤 몬스터가 오더라도 이 메서드 하나로 처리함
	// 몬스터타입이 없으면 에러가 나므로 같은 패키지에 몬스터클래스가 있어야 함.
	public void hunt(Monster monster) {
		// 몬스터의 doBattle(사용자공격력)을 호출해서 몬스터의 체력을 깎아주세요.
	   monster.doBattle(this.atk);
	   
	   // 오크가 죽었는데도 공격하지 않도록 if문으로 검사
	   if(monster.getHp() > 0) {	   
	   // 몬스터의 공격력을 받아와서 사용자의 체력을 깎아주세요.	   
		  this.hp = this.hp - monster.getAtk();	   
		  System.out.println("교전 결과 " + name + "의 체력 " + this.hp);		 
	 } 
	   if(this.hp <= 0) {
			   System.out.println(this.name + " 이/가 죽었습니다. ");
			   return;
	 }
   }
 }
