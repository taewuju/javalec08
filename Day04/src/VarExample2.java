
public class VarExample2 {
	
	public static void main(String args[]) {
		
		// 변수 선언/할당(초기화)/사용
		// 1. 변수선언
		// 데이터타입 변수명;
		// 2. 할당
		// 변수명 = 값;
		// 3. 사용
		// ex) System.out.println(변수명); .... 등등

		String name = "이종석";  // 참조데이터타입(문자열-String). 첫문자가 대문자이다.
		int age = 46;  // 기본데이터타입(정수-int). 첫문자가 소문자이다.
		
		final float PI = 3.14f;
		final String dontChange = "바꾸지마";
		
		
		age = age - 10;  // age = 46- 10 사용
		System.out.println("이름 : " + name + "   나이 : " + age);
	
		System.out.println("제 이름은 이종석 \n\n\n\n\n\n 입니다.");
		System.out.println("나이는 	 XX입니다.");
		System.out.println("나이는 \t XX입니다.");
		
		// 제 이름은 "이종석" 입니다.
		String message = "제 이름은 \"이종석\" 입니다.";  // 쌍따옴표를 앞에 역슬래쉬(\)를 넣어줘야 "이종석"을 문자열의 또다른 끝과 시작으로 인식하지 않는다.
		System.out.println(message);
		
		String message2 = "리터럴은 \\로 시작합니다.(보통은)";  // 문자열에 역슬래쉬(\) 모양을 표기하고 싶으면 두번 사용하면 된다.
		System.out.println(message2);
		
		
	}

}
