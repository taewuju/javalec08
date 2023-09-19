
// Math  클래스를 정의
// Method Overloading (같은 이름의 행위 중첩)
class Math {
	
	int add(int x, int y) {  // 
		return x + y;
			}
	
// 리턴 타입만 다른 경우는 메서드 오버로딩 불가하다.	
//	float add(int x, int y) {
//		return x+ y;
//			}
	
	
	int add(int x) {  // 인자 수가 다른 경우 중첩 가능
	return x + x;
			}
	
	float add(float x, float y) {  // 자료형이 다른 경우 중첩 가능
	return x + y;
			}
	}


public class MethodOverloadEX {
	public static void main(String[] args) {
		Math math = new Math();
		System.out.println(math.add(10));
		System.out.println(math.add(10, 20));
		System.out.println(math.add(10.0f, 20.0f));
		
	}


}
