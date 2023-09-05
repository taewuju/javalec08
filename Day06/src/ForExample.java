
public class ForExample {

	// for
	// for(초기화문;조건문;증감식) {
	//   실행문
	// }
	// ex) 문제가 1-10까지의 숫자 중 짝수만 출력하세요.
	
	public static void main(String args[]) {
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) System.out.println(i);
		}
		
		int a;
		for(a = 1; a<= 10; a++) {
			if(a % 2 == 0) System.out.println(a);
		}
		
		int b = 1;
		for(; b <= 10; b++) {  // 윗 줄에서 이미 초기화했으므로 초기화식 부분은 비워놓을 수 있다.
			if(a % 2 == 0) System.out.println(a);
		}
		
		for(;;) {  // 조건식 부분이 무조건 true여서 무한루프에 빠진다.
			
		}
	}
}
