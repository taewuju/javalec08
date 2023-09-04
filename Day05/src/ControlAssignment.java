
public class ControlAssignment {

	public static void main(String args[]) {
		
//		// 정수 최댓값 최솟값 구하기
//		// int, byte, short의 최댓값과 최솟값을 출력하는 프로그램을 만드세요.
//		// 연산은 '비트연산'만 이용함.
//		
//		// 예시.
//		System.out.println("int : " + intMin + " ~ " + intMax);
//				
//		int max = 1 << 30;  // 최댓값
//		System.out.println(max + " = " + Integer.toBinaryString(max));
//		
		
		
		// int 최솟값, 최댓값 구하기
		System.out.println("int : "+Integer.MIN_VALUE+ " ~ "+Integer.MAX_VALUE);
		// byte 최솟값, 최댓값 구하기
		System.out.println("Byte : "+Byte.MIN_VALUE+ " ~ "+Byte.MAX_VALUE);
		// short 최솟값, 최댓값 구하기
		System.out.println("Short : "+Short.MIN_VALUE+ " ~ "+Short.MAX_VALUE);

	
		//
		int min = -2147483648 >> 30;
		System.out.println("이진법 정수 최솟값 : "+Integer.toBinaryString(min));
		int max = 1 << 30;
		System.out.println("이진법 정수 최댓값 : "+Integer.toBinaryString(max));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
