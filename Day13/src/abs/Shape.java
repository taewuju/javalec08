package abs;

public abstract class Shape {  // 추상메서드가 하나라도 있으면 추상클래스로 선언해줘야 함.

	int x;
	int y;
	String type = "도형타입";
	
	public void printMyType() {
		
		System.out.println(type);
	}
	
	// final 메서드를 서브클래스에서 상속은 받을 수 있지만, 재정의는 불가능함.
	public final void 나재정의안돼() {  
		System.out.println("하악하악");
	}
	
	
	// 넓이구하기() 메서드는 반드시 Override 하도록 강제됨.
	public abstract void 넓이구하기();  // 구현부가 없음. 추상메서드
	
	
}
