package interaction;

public class Buyer {
	
	// 변수로 int money 와 int kiwi를 맴버변수로 가짐
	private int money; // 소지금
	private int kiwi;  // 키위를 산 갯수
	
	// 생성자에 돈을 받아서 소지금액을 초기화해주고, 키위는 0으로 초기화
	public Buyer(int money) {
        this.money = money;
	    this.kiwi = 0;     
    }
	// buyKiwi(Kiwi kiwi, int kiwi)를 정의하는데 어떤 상인에게 몇개를 살지
	public void buyKiwi(Seller seller, int kiwi) {
		// 구매하려는 키위총액이 내 소지금을 넘으면 "돈이 부족합니다." 라고 알리고 메서드를 중지
		if(kiwi*3000 > this.money) {
			System.out.println("돈이 부족합니다. 소지금 " +this.money);
			return; // 코드가 더이상 진행되지 않도록 강제중지
		}
		// 판매자의 키위가 내가 구매하려는 키위보다 적은경우도 역시 "키위재고가 부족합니다." 라고 알리고 메서드 중지
		if(seller.getKiwi() < kiwi) {
			System.out.println("키위재고가 부족합니다. 키위재고 "+ seller.getKiwi());
			return;
		}  // 위에 두 if문의 모든 경우의 수를 통과한 경우에만 키위 구매 가능.
		
		// 망고개수를 입력받으면 소지금을 개수* 가격 만큼 차감해주고 키위개수는 올라갑니다.
		// 내 금액은 차감되고 키위가 늘어나는 로직
		this.money -= kiwi * 3000;
		this.kiwi += kiwi;
		// 이떄 seller쪽에서도 sellKiwi()가 호출되도록 처리하며
		// seller의 키위를 차감하고 돈을 올려주느 로직
	    seller.sellKiwi(kiwi); 
	  }
	// showBuyer()를 이용해 소지 키위, 소지금을 확인할수있따.
	public void showBuyer() {
		System.out.println("---구매자 정보---");
		System.out.println("소지중인 키위 "+ kiwi + " 잔여금액 "+ money);
		System.out.println("------------------------");
	}
	
   }
