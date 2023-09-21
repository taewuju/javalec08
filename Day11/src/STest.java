
public class STest {  // SinglePattern과 같은 패키지에 있으므로 import 안 해도 된다.
	
	public static void main(String[] args) {
		
		// 1. 그냥 객체를 생성했을 때  => 객체가 각각 생성되어 메모리에 3개가 올라와 있게 된다.
		SinglePattern s1 = new SinglePattern();
		SinglePattern s2 = new SinglePattern();
		SinglePattern s3 = new SinglePattern();
		Object obj = new SinglePattern();  // 상속 관련
		
		s1.printSharedData();
		s2.printSharedData();
		s3.printSharedData();
		System.out.println("s1 = " +System.identityHashCode(s1));
		System.out.println("s2 = " +System.identityHashCode(s2));
		System.out.println("s3 = " +System.identityHashCode(s3));  // 메모리 주소가 모두 다르다.
		
		// 2. 싱글턴 메서드 getInstance();  => 처음에만 첫 줄만 생성하고, 나머지는 참조한 값만 넘겨주게 된다. 
		SinglePattern s11 = SinglePattern.getInstance();
		SinglePattern s12 = SinglePattern.getInstance();
		SinglePattern s13 = SinglePattern.getInstance();
		s11.printSharedData();
		s12.printSharedData();
		s13.printSharedData();
		System.out.println("s11 = " +System.identityHashCode(s11));
		System.out.println("s12 = " +System.identityHashCode(s12));
		System.out.println("s13 = " +System.identityHashCode(s13));  // 메모리 주소가 모두 같다.
	}
}
