
// 제어문
// 1. 조건 제어,   2. 반복 제어
public class ControlExample {

	public static void main(String args[]) {
		
		// 1. 조건 제어는
		// 1-1. if
		// 1-2. switch ~ case
		
		int a = -1;
		
		// '조건식 ? 참 : 거짓;'인 삼항연산과 같은 원리이다.
		if(a < 0) {  // if(condition) { 실행문 }
			// condition이 true일 경우에 { } 블럭 안을 실행시킨다.
			System.out.println("a는 음수입니다.");  // 실행문을 하나만 쓰면 조건이 참이면 실행되고, 거짓이면 실행되지 않는다.
			// System.out.println("프로그램 종료");  // 거짓일 때의 실행문을 추가하면 그에 맞게 실행된다.
		} else {  // if ~else문으로 쓰면 연산을 한 번만 하면 된다.
			// if(condition) { 실행문 }
			// condition이 false일 때 실행된다.
			System.out.println("a는 양수입니다.");
		}
					
//		if(a < 0) {
//			System.out.println("a는 양수입니다.");
//		}
	
		
//		int grade = 5;  // 초등학교 학년
//		// 1-3은 저학년 -> if(grade <= 3) {}
//		// 4는 중간학년 -> if(grade >= 5) {}
//		// 5-6은 고학년 -> if(grade == 4) {}
//		
//		if(grade <= 3) {
//			System.out.println("저학년");
//		} else if(grade >= 5) {
//			System.out.println("고학년");
//		} else {  // 조건이 3개일 때는 마지막 조건문에 'else'만 쓰면 연산을 한 번 덜할 수 있어서 좋다.
//			System.out.println("중간학년");
//		}
//		
		
		int grade = 10;  // 초등학교 학년
		// 1-3은 저학년 -> if(grade <= 3) {}
		// 4는 중간학년 -> if(grade >= 5) {}
		// 5-6은 고학년 -> if(grade == 4) {}
		// 앞의 조건들에 모두 false인 경우. 그 외에는 다시 넣어주세요. (사용자가 1-6 범위를 벗어난 값을 입력하는 경우)		
		// 예를들어 grade가 2이면 연산을 한 번, 4이면 세 번, -1이면 세 번하게 된다.
		
		if(grade >= 1 && grade <= 3) {
			System.out.println("저학년");
			System.out.println("하앗하앗");
			
		if(true) {
			System.out.println("하악하악");
		}
		} else if(grade >= 5 && grade <= 6) {
			System.out.println("고학년");
			
		} else if(grade == 4) {
			System.out.println("중간학년");			
		} else {
			System.out.println("입력값은 1-6까지입니다.");
		}
		
		
		
		// Switch ~ case문
		
		int x = 10;
		
		switch(x) {
		
		case 1 :
			System.out.println("x는 1입니다.");
			break;
		
		case 10 :  // if(x == 10)
			System.out.println("x는 10입니다.");
			break;
			
		case 3 :
			System.out.println("x는 3입니다.");
			break;
			
		default :
			System.out.println("여기는 디폴트(else) 입니다.");
		}
		
		
		if( x == 1) {
			System.out.println("x는 1입니다.");		
		} else if( x == 10) {
			System.out.println("x는 10입니다.");
		} else if ( x == 3) {
			System.out.println("x는 3입니다.");
		} else {
			System.out.println("여기는 디폴트(else) 입니다.");
		}
		
		

		// 정수 최댓값 최솟값 구하기
		// int, byte, short의 최댓값과 최솟값을 출력하는 프로그램을 만드세요.
		// 연산은 '비트연산'만 이용함.
		
		// 예시.
		System.out.println("int : " + intMin + " ~ " + intMax);
				
		int max = 1 << 30;  // 최댓값
		System.out.println(max + " = " + Integer.toBinaryString(max));
		
		
		
	}
	
	
	
	
}
