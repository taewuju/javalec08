
public class WhileExample {

	// while, do~while
	// ex) 문제가 1-10까지의 숫자 중 짝수만 출력하세요.
	// 반복문(loop문)은 돌린다.
	public static void main(String args[]) {
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) System.out.println(i);
		}
		
		/*
		// 방법1
		int x = 1;
		while(x <= 10) {
			if(x % 2 == 0) System.out.println(x);
			x = x+1;
		}  // x = x + 1;
		*/
		
		// 방법2
		int x = 1;
		while(x <= 10) {  // while 조건식에도 넣을 수 있지만,
			if(x++ % 2 == 0) System.out.println(x);  // if 조건식에 넣는 편이 더 안정적일 수 있다.
		}
		
		x = 1;
		do {
			if(x % 2 == 0) System.out.println(x);
		} while(x++ <= 10);  // while 조건식 뒤에 세미콜론을 사용한다.
		
		
		
		
		
	}
}
