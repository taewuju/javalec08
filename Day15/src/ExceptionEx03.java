class Math01 {
	int divide(int x, int y) throws ArithmeticException {  // 콤마로 , Exception 등을 추가가능 함.
		if(y == 0) throw new ArithmeticException("못 나눠. 0으로는");
		return x / y;  // y= 0 이면 Exception 발생 => 예외처리를 떠넘기기 함
	}
}
public class ExceptionEx03 {

	public static void main(String[] args) {
	
		Math01 m = new Math01();
		int b = 0;
		try {
			b = m.divide(10, 0);  // Exception을 처리해줘야 함.
		} catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(b);
	}

}
