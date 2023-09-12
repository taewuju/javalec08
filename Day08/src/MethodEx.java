/*
 * 메서드는 크게 두 가지 타입이 있다.
 * 1. 인자
 * 	- 인자가 없는 메서드
 * 	- 인자가 있는 메서드
 * 2. 값 돌려주기(return)
 * 	- 값을 돌려주는 메서드
 *  - 값을 돌려주지 않는 메서드
 */

public class MethodEx {
	
	//-- 1. 리턴 값이 없고, 인자도 없는 메서드
	static void printName() {  // void는 리턴타입이 없음을, printName()은 출력할 인자가 없음을 나타냄.
		System.out.println("나의 이름은?");
	}
		
	//-- 2. 리턴 값이 없고, 인자는 있는 메서드
	static void printUrName(String urName, int urAge) {
		System.out.println("너의 이름은 " +urName+ "(" +urAge+ ")");
	}
	
	//-- 3. 리턴 값이 있고, 인자는 없는 메서드
	static String returnName() {
		return "이종석";
	}
	
	//-- 4. 리턴 값이 있고, 인자는 있는 메서드
	//-- 메서드명은 add, 인자는 x, y (int타입), 
	//-- 그리고 결과는 x + y의 결과값을 돌려주세요.
	static int add(int x, int y) {
		return x + y;
	}	
	
	
	public static void main(String[] args) {
	// 메서드 이름은 main
	// 인자(매개변수)는 String args[] 배열
	// 돌려주는 값(return)의 데이터 타입은 void
	// void의 뜻은 "아무 것도 돌려주지 않는다."
		
		
	//-- 1. 리턴 값이 없고, 인자도 없는 메서드 호출
	printName();  // 변수를 사용할 때처럼 메서드명을 쓰면 되지만, 인자를 넣을 공간()이 있어야 함. 뒤에 괄호가 있으면 메서드라고 생각하면 됨.
		
	//-- 2. 리턴 값이 없고, 인자는 있는 메서드 호출
	printUrName("이종석", 20);
	printUrName("박은진", 21);
		
	//-- 3. 리턴 값이 있고, 인자는 없는 메서드 호출
	String name = returnName();  // 리턴 값을 받아줄 공간을 만들어줘야 함
	System.out.println(name);	
	String name2 = returnName();  // 다른 공간 만들어서 불러도 돌아옴
	System.out.println(name2);	
		
	//-- 4. 리턴 값이 있고, 인자는 있는 메서드 호출
	int result = add(1, 100);
	System.out.println(result);  // 변수에 넣고선 출력
	System.out.println(add(100,-100));  // 변수에 안 넣고 바로 출력
	
	
	
	}
	
	
	
	}