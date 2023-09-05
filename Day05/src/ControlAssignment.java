
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
	
	
		
		// 쌤 예시본 //
		byte b = (byte)128;  
		System.out.println(b);
		System.out.println(~b);
		
		byte c = 1;  
		System.out.println(c << 7); // 최댓값 1000 0000 이 되어 음수여야 하지만 int로 연산되므로 양수로 나옴.
		System.out.println((byte)(c << 7));  // 형변환을 해줘야 한다.
		System.out.println(~(c << 7));  // 최솟값 0000 0001
	
		byte d = -1;  // 1111 1111
		System.out.println(d >>> 1);  // 최댓값 0111 1111을 만드려면 부호비트를 0으로 채우도록 한다. 하지만 int로 연되어 2147483647이 나온다.
		System.out.println((byte)(d >>> 1));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
