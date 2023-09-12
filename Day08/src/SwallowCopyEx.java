import java.util.Arrays;

public class SwallowCopyEx {

	public static void main(String[] args) {
		
		// 얕은 복사(Swallow Copy)는 주소값만 복사한다 (변수 공간 - stack)
		int a[] = {1,2};
		int b[] = {3,4,5};	
		
		System.out.println("a = " +Arrays.toString(a));
		System.out.println("b = " +Arrays.toString(b));
		System.out.println(System.identityHashCode(a));  // 참조 주소값을 출력한다.
		System.out.println(System.identityHashCode(b));
		
		a = b;  // 얕은 복사		
		b[1] = -10;
		
		System.out.println("a = " +Arrays.toString(a));
		System.out.println("b = " +Arrays.toString(b));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		
		
		
		
		
		
		
		
	}

}
