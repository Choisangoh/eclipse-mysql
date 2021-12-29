package interaction;

public class Seller {
	
	// 변수로 int money 와 int kiwi를 맴버변수로 가짐
	private int money; // 매출액
	private int kiwi;  // 재고(개수)
	
	// 생성자에서 money는 초기값이 0이고, kiwi는 입력받도록 해주세요.
    public Seller(int kiwi) {
	   this.money = 0;	   
	   this.kiwi = kiwi;
   }
    // sellKiwi(int kiwi)를 이용해 키위개수를 입력받으면(doBattle과 유사),   
   public void sellKiwi(int kiwi) {
	   //망고가 모자르면 "키위가 없습니다"라고 하고 메서드를 종료합니다.
	   if(this.kiwi < kiwi) {
		   System.out.println("키위가 없습니다. 현재 키위재고 "+ this.kiwi);
		  return;
	   }	   
	// 자신의 this.kiwi는 갯수만큼 차감하고, this.money는 망고개수*가격만큼 증가
	 this.kiwi -= kiwi;
	 this.money += kiwi * 3000;	   
   }
   // showSeller()를 이용해 현재 소지금과 키위재고를 볼 수 있습니다.
   public void showSeller() {
	   System.out.println("---상인정보---");
	   System.out.println("현재 소지금 " + this.money + " 현재 키위재고 " + this.kiwi);
   } 
   // Buyer에서 키위개수를 확인할 수 있도록 getKiwi() 게터 하나를 만드세요.
   public int getKiwi() {
	   return this.kiwi;
   }
}
