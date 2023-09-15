package javalec.computer.videocard;

// 접근제한자
// public > protected > (default) > private
// 접근을 제한하고자 하는 곳은 어디인가?
// 클래스, 클래스 멤버는 모두 접근제한자를 둘 수 있다.
// 1. 클래스
// 2. 속성(멤버 변수)
// 3. 메서드(멤버 메서드)
// 4. 생성자(메서드) <-- 붙을 수 있지만, 주로 public
// 메서드 내에는 접근제한자를 줄 수 없음.(멤버가 아니므로)

public class Geforce {
	
	//-- 멤버 변수
	public String modelName;
	private final int price = -100;
	
	// 생성자(메서드)
	// 1. 리턴타입 없음
	// 2. 클래스명과 생성자(메서드)명 동일
	public Geforce() {  // 클래스명과 동일한 이름을 사용함.  // 기본은 인자 없는 생성자임.
		super();  // 기본생성자가 자동 생성되게 해줌. 
		modelName = "하악하악";  
		// price = 1000;// 상수화되었기 때문에 초기화 불가
	}
	
	public Geforce(String model) {  // 인자 있는 생성자도 생성가능함.		
		modelName = model;
		// price = 10;  // 상수화되었기 때문에 초기화 불가
		final int a;
		a = 10; //  값 변경 불가
	}
	//--  생성자메서드
	
	public void showModel() {
		// private int a;  // 메서드 내이므로 접근제한자를 쓸 수 없다.
		System.out.println("Geforce");
		
	}
	
	public void turnOnMonitor() {
	
		System.out.println("모니터 켜욧!");
	
	}
	
	// default 메서드
	void defaultPrintName() {
		System.out.println("디폴트 메서드야");
	}
	
	// protected
	protected void protectedPrintName() {
		System.out.println("난 프로텍티드야");
	}
	
	// public
	public void publicPrintName() {
		System.out.println("public");
	}

	// private
	private void privatePrintName() {
		System.out.println("난 private");
	}
	

}
