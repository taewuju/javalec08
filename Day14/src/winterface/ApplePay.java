package winterface;

public class ApplePay implements Paymethod {  // Paymethod 인터페이스의 결제수단3

	@Override
	public void pay() {
		System.out.println("애플페이");
		
	}

}

class 쌀 implements Paymethod {  // 아예 다른 기능들도 인터페이스를 통해서 기능 추가하는게 가능해짐.(클래스와의 차이점)

	@Override
	public void pay() {
		
		
	}
	
	
}