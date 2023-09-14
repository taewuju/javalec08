		// 메서드를 선언
		// 메서드명은 sliceArray
		// 인자는 int[], int from
		// 결과값 return int[]
		// 실행문은 인자로 받은 int[]의 from 인덱스부터 끝까지의
		// 배열값을 복제해서 return 해라.
		// ex) 인자 int[] a = {1,2,3,4,5};
		// 	   int[] b = sliceArray(a,1);
		//	   System.out.println(Arrays.toString(b));  --> {2,3,4,5}
		// 힌트 for문
		
		//int[] sliceArray(int[] x, int from) {
					
		//}

import java.util.Arrays;

public class Assignment {
	
	// 메서드명은 sliceArray
	// 인자는 int[], int from
	// 결과값 return int[]	
	
	static int[] sliceArray(int[] x, int from) {
		
		// 1. 복제할 temp 배열을 만들어 주자.
		
		int[] result = new int[x.length - from ];
		
		// 2. 복제 대상 배열변수에 인자로 넘어온 x 배열변수 값을 복제
		// i = result의 인덱스, from은 x 배열의 인덱스
		// for(a;b;c) => a,b,c,는 따로/같이 놓을 수 있다. (반드시 같이 놓을 필요는 없음)
		
		for(int i = 0; from<x.length; from++) {
			result[i++] = x[from];
			// 			result[i] = x[from];
			//			i += 1;
		}
		
		
		return result;
		// ex) 인자 int[] a = {1,2,3,4,5}; => 5-1, 5-2 ... (빼기)
		// 	   int[] b = sliceArray(a,1);
		//	   System.out.println(Arrays.toString(b));  --> {2,3,4,5}

		
	}
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5,6,7,8,9,10};  // {4,5,6,7,8,9,10}의 방 7개짜리 배열을 만들고 싶다.
		// sliceArray(x, 3);


		int[] r = sliceArray(x, 3);
		int[] a = sliceArray(r, 4);
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(a));
		
		
	}

}
