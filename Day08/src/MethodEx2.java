// 인자를 제한 없이 받는 방법
// 1. 인자를 배열로 받기
// 메서드명(데이터타입[] 변수명_
// 2. 인자를 데이터타입 ... 변수명으로 받기
// 메서드명(데이터타입 ... 명수명)

import java.util.Arrays;

public class MethodEx2 {
	
	static int getAddAll(int[] x) {  // 배열 인자는 인자의 수를 제한하지만, 그 값은 배열의 길이엔 제한이 없음.
		int result = 0;
		for(int val : x) {
			result += val;
		}
		return result;	
	}

	
	static void printAddAll(int ... x) {  // 가변 인자는 인자의 수를 제한하지 않음.
		int result = 0;
		for(int val :x) {
			result += val;
	}
		System.out.println(result);
	}
	
	// static void printAddAllDoubleParam(int ...x, String name)
	//- 오류. 가변인자는 무조건 맨 뒤에 선언해야 함.
	static void printAddAllDoubleParam(String name, int ...x) {  // 배열 인자 뒤에는 가변 인자가 올 수 있음 (반대로는 불가능)
		System.out.println("나는 " +name+ "입니다,");
		System.out.println("저한테 넘어온 int ...x 는");
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+ "\t");
		}
	}
	
	public static void main(String[] args) {
		
		printAddAll(1,2,3,4,5,6,7,8,9);  // int ...x => 9개짜리 x의 배열로 값을 받게 된다.
		
		// getAddAll(1,2,3,4,5);  // int[] x =>  인자 하나만 받을 수 있고, 배열로만 값을 받게 되므로, 
		int[] param = {1,2,3,4,5,6,7,8,9};  // 배열변수를 생성하여(배열길이엔 제한 없음. 주소값만 받으면 되므로), 
		int result = getAddAll(param);  // 인자 하나에 넣어서 배열로 값을 넘겨줘야 한다.		
		System.out.println(result);
		
		printAddAllDoubleParam("이종석", 1,2,3,4,5,6,10);  // 인자끼리 섞어서 쓸 수 있음. 순서 주의.
		
		int[] a = {1,2,3,4,5};
		int[] b = sliceArray(a,2);
		System.out.println();
		System.out.println(Arrays.toString(b));
		
		
		// 메서드를 선언
		// 네서드명은 sliceArray
		// 인자는 int[], int from
		// 결과값 return int[]
		// 실행문은 인자로 받은 int[]의 from 인덱스부터 끝까지의
		// 배열값을 복제해서 return 해라.
		// ex) 인자 int[] a = {1,2,3,4,5};
		// 	   int[] b = sliceArray(a,1);
		//	   System.out.println(Arrays.toString(b));  --> {2,3,4,5}
		
		int[] sliceArray(int[] x, int from) {
			
			
		}
		
		
		
		
	}
}
