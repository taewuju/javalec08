
public class ScopeExample {

	static String name = "하악하악";  // 클래스 전체에 영향을 준다.
	// 블록단위로 메모리 저장위치가 다르므로 메서드 내부에서 같은 변수명을 사용가능함.
	
	public static void printName() {
		String name = "이종석";  // 지역변수 (내가 호출한 지역인 경우엔 가까운 것을 우선하게 된다). 
		System.out.println(name); // 그러므로 하악하악이 아닌 이종석이 출력된다.
	}  // printName 메서드 정의부 끝
	
	public static void main(String args[]) {
		String name = "이종석";  // main 메서드 내에만 영향을 준다.
		
//		{
//			int age = 10;
//		}
//		
//		System.out.println(age);  // 블럭을 벗어났으므로 같은 변수명을 사용할 수 없다.
		
		printName();
	}  // main 메서드 정의부 끝
	
//	 for(int i=0; i<10; i++) {
//		 
//	 }
//	 
//	 System.out.println(i);  // for문을 벗어났으므로 같은 변수명을 사용할 수 없다.
	
	 int = i;
	 for(i=0; i<10; i++) {
	 
	 }

	 System.out.println(i);
	
	
	}  // 클래스 정의부 끝
