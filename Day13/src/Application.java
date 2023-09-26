
public class Application {

	//-- '이동하다'라는 행위가 있고, 수단은 인자로 (탈것)을 갖음.
	public void 이동하다(Vehicle vh) {
		
		vh.moveForward();
		vh.moveBackward();
//		vh.뽐내다();  // 자식클래스인 Car의 뽐내다 메서드 호출 불가 => 탈것 클래스의 표준에 없기 때문.
		((Car)vh).뽐내기();// 형변환을 통하면 표준 아닌 (자식클래스의) 메서드 호출 가능
	}
	
	public void 이동하다(CarWoExtend vh) {  // 상속 없으면 공통된 부분도 모두 재정의 해줘야 함.
		
		vh.moveForward();
		vh.moveBackward();		
	}
	
	public static void main(String[] args) {
	
		Application ap = new Application();  // static이 아닌 객체참조 타입이므로 new로 새로 생성
//		Vehicle vh = new Vehicle();
//		Vehicle vh = new Car();  // 다형성 => 표준을 정의
		Vehicle vh = new Bus();  // 다형성
		CarWoExtend cw = new CarWoExtend();  // 상속X
		ap.이동하다(vh);
//		ap.이동하다(cw);  // 상속X
	}
}
