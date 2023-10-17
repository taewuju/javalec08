import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface  // 표시를 하면 작성 중 두 개 이상 추상메서드 선언 못하도록 점검해줌.
interface Add {  // 람다식 사용할 때는 인터페이스를 만들어 쓰는게 좋음.
	abstract int add(int x, int y);
//	abstract int minus(int x, int y);  // 람다식은 명칭이 없기 때문에 람다식을 사용하는 
									   // 함수 인터페이스는 하나의 메소드에 하나만 존재 가능함.(필수로 하나 있어야 함)
	default int minus(int x, int y) {  // 바디가 있는 경우에는 에러가 나지 않음.
		return x - y;					// 람다가 가르키는 것은 맨 윗 줄 뿐이기 때문임.
	}
}


public class LambdaEx {

	public static void main(String[] args) {
	
		Add a = (x, y) -> x + y;  // 축약형. 실행문이 한 줄인 경우로 리턴문을 안 써도 자동으로 리턴됨.
		
		Add b = (x, y) -> {  // 두 줄 이상인 경우.
			System.out.println("Add b 변수");
			System.out.println("x = " +x);
			System.out.println("y = " +y);
			return x + y;
		};
		
		int result1 = a.add(1, 2);  //-- 출력 안하고 결과값만 리턴
		int result2 = b.add(2, 3);  //--  출력 후 결과값 리턴
		
		System.out.println(String.format("result1 = %d", result1));
		System.out.println(String.format("result2 = %d", result2));
		
		a.minus(10, 20);
		
		Consumer c;
		Function f;
		
	}

}
