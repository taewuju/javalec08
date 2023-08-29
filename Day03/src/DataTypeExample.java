
public class DataTypeExample {
	
	public static void main(String args[]) {
		
		// 자바의 변수 데이터타입은 크게는 2 가지가 있고,
		// a) 기본 타입  b) 참조 타입
		
		// 작게는 4 가지가 있다.
		// 기본 타입 - a) 정수  b) 실수  c) 논리  
		// 그 외 타입 - d) 참조
		
		// 자료형 변수명;
		// = 평수 이름;
		// 1바이트의 정수형 age를 선언해 봅시다.
		byte age;  // -> 메모리에 1byte 공간이 생기고, 이름은 age로 지었다.
		age = 10;  // -> 할당(값을 부여)
		// age = age + age;  // -> 사용. 정상 작동함.
		// age = age + 10;  // -> 사용. but 왜 에러가 나나? 기본적으로 숫자(정수)를 사용하게 되면, 
		// 그 정수는 int(4 바이트)로 인식하며, 연산의 결과 역시 int로 인식하므로, 형 전환이 필요하게 된다.
		// (age는 1 바이트인데 age + 10의 결과는 4 바이트가 된다.)		
		System.out.println(age);  // -> 사용
		
		long b = 100;
		b = age + 100;  // 좌변 long(8 바이트)이 우변(4 바이트)보다 크므로 에러가 안 난다.
		// 상자의 크기가 내용물보다 크면 문제가 없는 것과 같다.
		
		char charValue = 65;  // 'A'처럼 문자를 홀따옴표로 정수값 대신 입력할 수도 있음. 
		System.out.println("65 = " + charValue);
		
		float a = 1.1f;  // 실수형의 기본자료타입은 double이므로 float를 쓰려면 우변 숫자 끝에 f를 붙여줘야 함. 
		
		//long b = 100;  // --에러. 실수형 타입에 정수형 값을 넣으면 에러가 날 확률이 있다.
		//a = b;
		
		double a2 = 100.0;  // 소숫점(실수)는 기분적으로 double 이기 때문에
		// f 없이도 사용할 수 있다.
		
		
		boolean isName = true;  // 혹은 false
		// 일반적으로 언어에서는 0을 거짓(false)라고 표현하고,
		// 0 외의 모든 수는 true로 본다.
		
		int address1 = 100;  
		address1 = 200;  // 에러 안 남.
		
		int address3;
		// 블라블라
		address3 = 100;  // 변수는 선언과 값 할당을 따로 할 때가 많지만,,,
				
		final int address2 = 300;  // 상수는 일반적으로 선언과 동시에 값을 할당하고,
		// 상수명은 일반적으로 모두 대문자를 사용한다.
		// hello world 라는 변수명을 선언할 때 -> int helloWorld;
		//                 상수를 선언할 때 -> final int hELLOWORLD;
		final int HELLO_WORLD = 100;
		// address2 = 100-100;  // --에러. 한번 값이 할당되면 변경할 수 없다.
		// address2 = 310;  //  --에러. 자료형 앞에 final을 붙이면 값을 변경할 수 없다.		

		
		// 게임 등에서 상수로 키패드 설정(불변) 가능함.
		final int ARROW_UP = 100;
		final int ARROW_DOWN = 200;
		
		int x = 10;  // 'x'는 변수이고, '10'은 상수이다.
		x = 10 + 100;  // 'x'는 변수이고, '10 + 100'은 상수이다.
		
		
	}

}
