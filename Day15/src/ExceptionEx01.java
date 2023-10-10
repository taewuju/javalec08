
public class ExceptionEx01 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		int result = 0;
		
		try {
			result = x/y;  // 예외가 발생할 수 있는 구문 (여기선 분모가 0이라 에러)
		} catch(ArithmeticException ex) {  // ArithmeticException이 박생하면, ex 변수로 자동 할당
			System.out.println("예외가 발생하였습니다.");
			System.out.println(ex.getMessage());
		} catch(Exception ex) {  // Exception이 최상위 클래스이므로 윗줄에서 정의해놓지 않은 예외까지 잡아줄 수 있음.
			// Exception문은 필수이고, Exception 문장만 사용해도 됨.
			// Exception ex = new ArithmeticException(); <= 상속 받아 자체적으로 정의 됨.
			System.out.println("알 수 없는 예외가 발생하였습니다.");
			System.out.println(ex.getMessage());
		} finally {  // 맨 마지막에 딱 한 번만 실행됨
			System.out.println("자원반납");
			result = -1;			
		}
		
//		catch(Exception ex) {  
//			// Exception문은 필수이고, Exception 문장만 사용해도 됨.
//			// Exception ex = new ArithmeticException(); <= 상속 받아 자체적으로 정의 됨.
//			System.out.println("알 수 없는 예외가 발생하였습니다.");
//			System.out.println(ex.getMessage());
//		}
		

		System.out.println("result : " + result);
		
		
	}
}
