
public class CalEx {

	static int add(int x, int y) {  // 덧셈을 하는 메서드 만들어 놓기
		return x + y;
	}
	
	static int multi(int x, int y) {  // 곱셈을 하는 메서드 만들어 놓기
		return x * y;
	}	
	
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int r = 10 + 20;
		int z = 10 * 20;
		
		// 10 + 20 + 30
		int result = add(add(10,20),30);  // 만들어놓은 메서드를 재활용 하기 = 예전엔 모듈이라고 칭함. 확장된 개념이 클래스(분류)임.
		
		
	}
}
