import java.util.Arrays;

public class DeepCopyEx {

	public static void main(String[] args) {
		
		//  Deep Copy (깊은 복사)
		// 1. Heap 영역에서 실제 데이터를 복사(복제)해서
		// 2. 새로 복제된 값의 주소값을 (대상 변수에) 넣는다.
		
		int a[] = {1,2};  // 목적지
		int b[] = {3,4,5};  // 복제할 대상
		int temp[] = new int[3];  // 공간 세 개 만들어 놓는다.
		for(int i=0; i<b.length; i++)  {
			temp[i] = b[i];
		}
		
		System.out.println("a = " +Arrays.toString(a));
		System.out.println("b = " +Arrays.toString(b));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		
		a = temp;
		b[1] = -10;		
		
		System.out.println("a = " +Arrays.toString(a));
		System.out.println("b = " +Arrays.toString(b));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		
		// 배열복사에 관련해서는 함수(메서드)를 자바에서 기본 제공한다.
		int aa[] = {1,2};
		int bb[] = {3,4,5};
		bb = aa;  // Swallow copy 메서드: 같은 주소를 참조한다.
		System.out.println("aa(" +System.identityHashCode(aa)+ ")=" +Arrays.toString(aa));
		System.out.println("bb(" +System.identityHashCode(bb)+ ")=" +Arrays.toString(bb));
		
		bb = aa.clone();  // Deep Copy 메서드: 다른 주소를 참조하게 된다.
		// Arrays.copyOfRange(); 범위를 넣어 복사하는 메서드도 있다.
		System.out.println("aa(" +System.identityHashCode(aa)+ ")=" +Arrays.toString(aa));
		System.out.println("bb(" +System.identityHashCode(bb)+ ")=" +Arrays.toString(bb));
		
		// Deep Copy2
		int cc[] = {1,2};
		int dd[] = {1,2,3,4,5,6,7,8,9};
		int ee[] = Arrays.copyOfRange(dd, 2, 5);  // dd배열의 방 2번째 시작인덱스부터 5번째 방까지 복사한다.
		System.out.println(Arrays.toString(ee));
		
		
		
		
	}
}
