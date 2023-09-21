/*
 * SubClassEx라는 클래스는 SuperClassEx를 상속받는 자식클래스입니다.
 * A가 B를 상속 받는다.
 * => A(자식) extends B(부모)
 */
public class SubClassEx extends SuperClassEx {
// SubClassEx의 부모클래스는 SuperClassEx
	
	
	// 부모한테 없는 특성을 자식에게 넣고 싶다.
	String className = "자식클래스의 className";  // 부모클래스에 이미 있고 상속까지 받은 클래스명을 생성한 경우 서로 다른 객체이다.
	String smartPhone = "갤럭시";
	
	public SubClassEx() {
		super("하악하악2"); // 부모 클래스의 생성자를 호출(두번째의 인자 있는 생성자가 호출됨)
		//  super 라인으로 표시 안 하면 첫번째의 인자 없는 기본 생성자가 호출됨)
		System.out.println("SubClassEx 생성");
	}
	
	public void printMysmartPhone() {
		System.out.println(smartPhone);	
	}
	
	public void printMyClassName() {
		System.out.println("내꺼 : " +this.className);  // 자기자신의 className
		System.out.println("엄마꺼 : " +super.className);  // 부모객체의 className
		
		// 외부 객체에서 Application01에 있는 className static속성을 접근할 때
		// 대상클래스명.멤버변수 = 값
		// 대상클래스명.method();
		// <--> 자기 자신에서 호출할 때는 대상클래스명을 안 쓰고 호출한다.
		Application01.className2 = "하악하악";  // 다른객체의 className2
	
	
	
	
	}	
}
