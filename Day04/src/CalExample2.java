
public class CalExample2 {

	public static void main(String args[]) {
		
		// < 논리 연산자 >
		
		// 1. And 연산자는 양쪽 모두 true여야 true이고, 그 외에는 모두 false이다.
		// A && B , A & B
		System.out.println("true && true = " + (true && true));
		
		int a = 10;
		int b = 20;
		boolean result = a > 5 && b < 21 && ( a + 10 < 0);  
		// --> result는 false이다. ( true && true) && false 이므로.
		
		
		// 2. OR 연산자는 양쪽 피연산자 중 하나만 true면 true이다.
		// A || B , A | B
		result = a > 5 || b < 21 || (a +10 < 0);
		// --> result = true / ( true || true ) && false
		
		// 3. XOR 연산자는 양쪽 중 하나만 true일 때 true이다.
		// A ^ B
		result = a > 5 ^ b < 21 ^ (a + 10 < 0);
		// --> result = (true ^ true) ^ false
		System.out.println(result);
		
		result = !result;
		// --> not false -> true
			
		
		// !) &&, &/ ||, | 의 차이
		int x = 100;
		int y = 110;
		boolean z = x > y && ++x == 101; 
		// x가 y보다 크고, ++x가 101과 같은가?
		// &&연산일 때 앞부분(x > y)부터 false면 뒷부분은 계산할 필요 없으므로 계산을 하지 않음.
		// &&자리에 &연산자로 교체하면 앞의 결과와 관계없이 뒷부분도 계산함.
		System.out.println("z = " + z);  // false
		System.out.println("x = " + x);  // 100. 앞이 거짓이라 뒷부분이 계산되지 않아 100 그대로 나옴.  
										// &연산자로 바꾸면 계산되여 101이 됨.
		
		 z = x < y || ++x == 101;
		 // x가 y보다 작거나 ++x가 101과 같은가?
		 // ||도 선 피연산자가 true일 경우, 후 피연산자는 계산할 필요없이
		 // true이기 때문에 연산을 수행하지 않는다.
		 System.out.println("z = " + z);  // true
		 System.out.println("x = " + x);  // 100. && 또는 & 연산자의 경우와 같음. 앞이 이미 참이므로 뒷부분은 계산하지 않음.
		 
		
	}
}
