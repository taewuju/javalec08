
public class ScopeExample {

	static String name = "하악하악"; // 클래스 전역변수

	public static void main(String args[]) {
		String name = "이종석"; // 지역변수 
		int x = 10;
		System.out.println(name);
		/*{
		    int age = 10; 	
		}
		System.out.println(age);*/
		printName(); 
		
		int i; 
		for(i = 0; i < 10; i ++) {
			
		}
		
		System.out.println(i); 
		
	} // main 메서드 정의부 끝 
	
	public static void printName() {
		//x = x + 1;
		System.out.println(name);
	} // printName 메서드 정의부 끝 

} // 클래스 정의부 끝 
