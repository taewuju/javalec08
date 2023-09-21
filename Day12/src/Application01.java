// JVM --> Application01.main(); 으로 static인 main 메서드를 바로 찾음.

public class Application01 {
	
	String className;  // Application01 멤버(변수)
					   // 객체참조 멤버
	static String className2;  // Application01 멤버(변수)
							   // static 영역 변수
	
	public void nonStaticMethod() {  // 객체참조 메서드
		className = "하악 non Static";
		className2 = "헐헐";
	}

	public static void main(String[] args) {
		
		className2 = "내 이름은 className2";
//		className = "내 이름은 className";  // 객체참조 변수이기 때문에 new 키워드를 통해 heap영역에 띄워져야 접근가능함.
		Application01 a01 = new Application01();
		a01.className = "하악";
		
//		Application01.className2 = "하학";  // static 속성 접근법
//		a01.className2 = "하악";  // 에러는 안 나지만 워딩이 떨어지므로 지양함.
		
		// 1. SuperClassEx
		SuperClassEx ex1 = new SuperClassEx();
		ex1.printClassName();
//		ex1.printMysmartPhone();  // 자식한테 있는 메서드
		
		System.out.println("======================");		
		// 2.SubClassEx (extends SuperClassEx)
		SubClassEx ex2 = new SubClassEx();  // 부모클래스 먼저 생성 후 자식클래스를 생성한다.
//		ex2.className = "하악하악";  // 상속 받은 속성을 변경할 수 있다.
		ex2.printClassName();  // 부모한테 상속받은 메서드. 별도의 정의 없이 상속된다.
		ex2.printMysmartPhone();  // 자식한테만 있는 메서드
		ex2.printMyClassName();  // 자식의 className 출력
		
		

		}	
	
	}	
	
