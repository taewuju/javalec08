package winterface;


// 접근 제한자 interface 인터페이스명;

public interface Paymethod {  // 결제수단 만들기 인터페이스


	abstract void pay();  // 추상메서드
//	void payback();  // 추상메서드 -> 중간에 추가된 경우
					 // 하위 구현 클래스는 요류(payback() 구현 제약 있음)
	
	default void payback() {  // default 메서드를 생성. 하위 호환성을 보장함(기능을 추가해도 기존 타 메서드에 오류가 안 남)
							  // 나중에 추가해도 되므로 시간을 벌 수 있음.
		System.out.println("환불");
	}
	
//	void pay();  // abstract를 생략해도 됨
//	void pay2() {
//		// 구현부
//	}
}
