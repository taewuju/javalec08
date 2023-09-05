// 비트 연산
public class CalExample01 {

	public static void main(String args[]) {
		
		// < 비트 연산 - 2진수 연산 >
		// true:1, false:0
		// & , | , ^ , ~
		
		int x = 10;
		int y = 7;
		System.out.println("10 = " + Integer.toBinaryString(x));  // Integer는 참조타입 클래스이다.
		System.out.println("7 = " + Integer.toBinaryString(y));
	
		// 1. x & y
		System.out.println("x & y = " + (x & y));  // &&나 || 연산자는 여기서 사용할 수 없다.
		
		// 2. x | y
		System.out.println(" x | y = " + (x | y));
		
		// 3. x ^ y
		System.out.println("x ^ y = " + (x ^ y));
		
		// 4. not (~)
		System.out.println("~ (x & y) = " + ~(x ^ y));
		
		
		
		// < 비트쉬프트 연산 >
		// int x1 = 2 * 2 * 2 * 2 * 2;  // 2의 5승
		int x1 = -1;
		System.out.println(Integer.toBinaryString(x1));
		
		// << Left Shift
		int r1 = x1 << 2;
		System.out.println(Integer.toBinaryString(r1));
		
		
		System.out.println("Right Shift");
		// >> Right Shift
		// byte에서 2진수로 가장 작은 값은
		// 1000 0000 = 0-128
		// 가장 큰 값은?
		// 0111 1111
		byte r2 = -128;
		System.out.println(Integer.toBinaryString(r2)); 
		System.out.println(Integer.toBinaryString(r2 >> 2)); // Right Shift에선 부호자리는 그대로 두고 나머지만 이동한다.
		
		r2 = 127;
		System.out.println(Integer.toBinaryString(r2)); 
		System.out.println(Integer.toBinaryString(r2 >> 2));
		
		
		System.out.println("Right Shift >>>");
		// >>> 이 친구는 우측 이동시 좌측에 있는 부호비트 + 나머지를 모두
		// 0으로 채워준다. (부호비트를 안 따른다.)
		r2 = -10;
		System.out.println(r2 + " = " + Integer.toBinaryString(r2)); 
		System.out.println((r2 >>> 2) + " = " + Integer.toBinaryString(r2 >>> 2));
		
//		x = 2;
//		x = x * 2 * 2;  // 2의 3승
//		
//		y = 2;
//		y = y << 3;  // 2의 2승. 속도상 윗줄의 2의 3승 한 방법보다 몇 배나 빠르다.
		// 낮은 성능의 컴퓨터에서 더 효율적이어서 임베디드에서 많이 쓰인다.
		
		
		int z1 = 10;
		
		System.out.println("z1 = " + Integer.toBinaryString(z1));
		System.out.println("5 = " + Integer.toBinaryString(5));
		
		z1 &= 5;  // z1 = z1 & 5
		System.out.println("z1 & 5 = " + Integer.toBinaryString(z1));
		System.out.println("z1 & 5 = " + z1);
		
		boolean b1 = true;
		b1 &= (z1 > 1 || z1 << 2 > 10);  // z1이 1보다 크거나, z1이 좌로 2자리 이동한 수가 10보다 큰가?
		// b1 = b1 & (z1 > 1 || z1 << 2 > 10);
		System.out.println(b1);
		
		
		
		// <삼항 연산자>
		int grade = 10;  // 5학년
		int age = 0;
		
		age = grade == 5? 12 : -1;  // grade가 5와 같으면 12를 넣고, 아니면 -1을 넣어라.
		// 3항 연산. if ~else문의 축향형이라고 보면 된다.
		// 조건식 ? true일 때 : false일 때;
		
		System.out.println("학년 : " + grade + " 나이 : " + age);
		
		
		
		// <연산 순위>
		// age = age ++ *10;  // ++증감부터 한 후 10을 곱한다.
		// -1 * 10 = -10
		age = ++age *10;  // 0
		System.out.println(age);
		
		
		
		
		
		
		
		
		
	}
	
}
