package abs;

public class Square extends Shape {
	
	//-- 기본 생성자
	public Square() {  // 생성자 메서드. 리턴값 없음.
		this.type = "사각형";
	}

	//-- 강제구현메서드(Shape에 추상메서드)
	@Override
	public void 넓이구하기() {
		this.printMyType();
		System.out.println("높이 : " +x);
		System.out.println("밑변 : " +y);
		int result = x * y;
		System.out.println("넓이 : " +result);
		
	}
	
	
	

}
