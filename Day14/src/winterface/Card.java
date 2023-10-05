package winterface;

public class Card implements Paymethod {  // Paymethod 인터페이스를 구현해주는 결제수단1

	@Override
	public void pay() {  // 인터페이스는 규약이기 때문에 Paymethod의 모든 부분을 재정의해줘야 함
		System.out.println("카드로 결제합니다.");
		System.out.println("수수료 0.5%");
		
	}  

}
