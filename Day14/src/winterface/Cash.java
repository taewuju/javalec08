package winterface;

public class Cash implements Paymethod, Bank {  // Paymethod 인터페이스를 구현해주는 결제수단2
												// Bank 인터페이스를 추가. 인터페이스는 다중상속 가능.

	@Override
	public void pay() {  // 인터페이스는 규약이기 때문에 Paymethod의 모든 부분을 재정의해줘야 함
		System.out.println("현금으로 결제합니다.");
		System.out.println("수수료 0%");
		
	}
	
	@Override
	public void payback() {
		System.out.println("현금 환불");
	}

	@Override
	public void 저축() {
		System.out.println("저축하다");
	}
	
}
