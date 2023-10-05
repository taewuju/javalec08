package winterface;

public class PaymentProcess {

	public void paygo(Paymethod p) {
		p.pay();
	}
	
	public static void main(String args[]) {
		PaymentProcess pp = new PaymentProcess();
//		Paymethod p = new Paymethod();  // Paymethod 인터페이스이므로 new 생성자 사용불가함.
		
		// 다형성
		Paymethod cash = new Cash(); 
		Paymethod card = new Card();  // Paymethod를 구현했기 때문에 new 생성자 사용가능해졌음
		Bank bank = new Cash(); 
		
		pp.paygo(card);
		System.out.println("=========");
		pp.paygo(cash);
		System.out.println("=========");
		bank.저축();
		
		// Paymethod cash = new Cash();
		cash.pay();  
//		cash.저축();  // Paymethod 인터페이스에 선언돼 있지 않기 때문에 사용불가		
		//-- 타입캐스팅
		((Bank)cash).저축();  // Cash 클래스는 Paymethod, Bank 인터페이스의 자식이기 때문에 가능함.
		
		// Bank bank = new Cash();
		bank.저축();
//		bank.pay();  // Bank 인터페이스에 선언돼 있지 않기 때문에 사용불가
		//-- 타입캐스팅
		((Paymethod)bank).pay();  // Cash 클래스는 Paymethod, Bank 인터페이스의 자식이기 때문에 가능함.
		
		Cash c = new Cash();  // Cash 클래스에는 저축,pay 메서드 모두 있기 때문에 가능
		c.저축();
		c.pay();		
//		pp.paygo(p);
		
		cash.payback();  // cash는 payback() 지원 - 재정의 했음
		card.payback();  // card는 payback() 미지원 - 재정의 안 함
		
		// 익명구현객체
		Paymethod pp2 = new Paymethod() {  // 새로운 정의 없이 그 순간에만 사용하는 용도임. 버튼클릭 이벤트에 많이 사용.

			@Override
			public void pay() {
				System.out.println("익명구현객체");	
			}			
		};
		
		pp2.pay(); 
		
		if(pp2 instanceof Paymethod) {  // 형변환 가능할지 먼저 확인가능
			System.out.println("pp2는 Paymethod의 자식이거나/본체");
		}
		
	}
	
}
