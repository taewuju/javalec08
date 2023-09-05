
public class CastingExample {

	public static void main(String args[]) {
		
		// 1.묵시적(자동) 형변환
		byte a1 = 10;  // 1byte
		int b1 = a1;  // 4byte. int가 더 크므로 작은 byte를 자동으로 넣을 수 있다.
		
		
		// 2.명시적(강제) 형변환
		a1 = (byte)b1;  // byte에 더 큰 int를 넣으려면 앞에 (데이터타입)을 써줘야 한다.
		// a1 = (byte)b1 + 20;  // --에러. 우변 상수는 기본적으로 int이다. 정수 연산의 결과는 int이므로.
		a1 = (byte)(b1 + 20);  // 정수인 20까지도 하나의 데이터 타입으로 묶어주면 된다.
		
		// 3. 아이 궁금해
		int test1 = 128; 
		byte bTest2 = (byte)test1;
		
		System.out.println("int test1 = " + test1);
		System.out.println("byte bTest2 =" + bTest2);  // --에러는 아니지만 '-128'이 출력된다. 예상과 다른 결과가 나올 수 있으므로 유의해야 한다.
		
		
	}
	
	
}
