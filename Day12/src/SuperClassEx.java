
public class SuperClassEx {

	String className;
	
	public SuperClassEx() {  // 인자 없는 기본 생성자
		
		System.out.println("SuperClassEx 생성"); 
		this.className = "엄마클래스입니다.";
		
	}
	
	public SuperClassEx(String className) {  // 인자 있는 생성자 -> 자식클래스에서 super로 표시해 호출해 불러옴.
		System.out.println("S클래스 인자 있는 생성자 호출");
		this.className = className;
	}
	
	public void printClassName() {
		
		System.out.println(this.className);
	}
	
	
	
	
	
}
