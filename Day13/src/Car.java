// 상속 없으면 정의를 다시 안 해도 됨.

public class Car extends Vehicle {
	
	public void 뽐내기() {
		System.out.println("나 벤츠야");
	}

	
	@Override  // 재정의가 필수는 아님.
	public void moveForward() {
		
		System.out.println("자동차로 앞으로 이동");
		System.out.println("시속 100km");		
	}
	

	@Override
	public void moveBackward() {
		
		System.out.println("자동차로 뒤로 이동");
		System.out.println("시속 50km");		
	}

	
	
	
	
}
