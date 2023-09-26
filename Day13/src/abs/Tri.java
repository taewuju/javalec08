package abs;

public class Tri extends Shape {  // 상속받는 클래스명 위에 마우스오버하면 해당 추상메서드 링크가 뜸. 클릭하면 복사됨.

	//-- 기본 생성자
	public Tri() {  // 생성자 메서드. 리턴값 없음.
		this.type = "삼각형";
	}
	
//	@Override
//	public void 나재정의안돼() {  // final method 재정의 안 됨. 에러
//		
//	}
	
	
	//-- 강제구현메서드(Shape에 추상메서드)
	@Override  // 상속받는 클래스의 추상메서드를 반드시 구현해야 함.
	public void 넓이구하기() {
		this.printMyType();
		this.나재정의안돼();  // 호출가능(final method)
		System.out.println("높이 :" +x);
		System.out.println("밑변 :" +y);
		int result = (int)(x * y * 0.5f);
		System.out.println("넓이 : " +result);
	}

}
