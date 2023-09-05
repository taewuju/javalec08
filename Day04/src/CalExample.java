
public class CalExample {

	public static void main(String args[]) {
		
		// 1.대입 연산
		int x = 10;
		int y = 2;
		
		// 2.산술 연산
		// +, -, *, /, %
		int result = 0;
		
		result = x + y;  // 더하기
		System.out.println("x + y = " + result);
		
		result = x - y;  // 빼기
		System.out.println("x - y = " + result);
		
		result = x * y;  // 곱하기
		System.out.println("x * y = " + result);
		
		result = x / y;  // 나누기
		System.out.println("x / y = " + result);
		
		result = x % y;  // 나머지 연산
		System.out.println("x % y = " + result);
		
		
		// 대입연산자가 산술연산자랑 같이 쓰이는 경우
		int z = 10;
		// z = z + 20;
		z += 20;  // 윗 줄을 줄여 쓴 것이다.
		
		z -= 20;  // z = z - 20;
		z *= 20;  // z = z * 20;
		z /= 20;  // z = z / 20;
		z %= 20;  // z = z % 20;
		
		
		// 증강연산자 (라인을 기준으로 연산함)
		// ++, --. 단항연산자
		int x1 = 10;
		++ x1;  // x1 = x1 +1;
		-- x1;  // x1 = x1 -1;
		
		int z1 = 10;
		// System.out.println(++z1);  // 11이 출력됨. 전위연산:문장이 완료되기 전에 연산이 끝나 있음. 
		// System.out.println(z1++);  // 10이 출력됨. 후위연산:문장이 완료된 후에 연산 시작함.

		
			
	}	
	
}
