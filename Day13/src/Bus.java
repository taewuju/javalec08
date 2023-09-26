
public class Bus extends Car {

	@Override
	public void moveForward() {
		System.out.println("요금은 1200원");
		super.moveForward();  // Car의 moveForward 메서드 호출
		
	// 클래스는 반드시 구현해야 하는 건 아니다.
	// 그래서 여기선 moveBackward 메서드는 재정의 안 했음.	
		
		
		
	}
	
	
	
	
	
	
	
}
