import java.util.Arrays;

public class ArrayExample {

	public static void main(String args[]) {
		
		// 1. 배열을 선언하는 법  <- 배열공간(값이 들어갈 곳)을 만들지 않음. 참조자료형이므로 자동으로 생성되지 않음.
		int a[];
		int[] b;
		int d;  // 기본자료형은 공간이 만들어진다는 점이 다름.
		
		// 2. 선언과 동시에 초기화  <- 주소값을 만드는 동시에 다른 곳에 공간을 만들었음.
		int c[] = {1,2,3};  // 방 3개 짜리 배열 변수
		
		// 3. 선언 + 빈공간 할당을 동시에.(new 사용)
		int[] e = new int[10];
		
		System.out.println("c변수에 2번 방에 있는 값 - c[1]" +c[1]);  // c의 1호 방에는 2가 들어있음.
		c[0] = -10;
		System.out.println("c[0] = " +c[0]);  // c의 0호 방에 -10을 할당함.
		
		
		// ex
		int x[] = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(x));  // 배열의 모습을 보고 싶을 때 문자열 형태로 보여 줌.
		/*
		System.out.println("x[0] =" +x[0]);
		System.out.println("x[1] =" +x[1]);
		System.out.println("x[2] =" +x[2]);
		System.out.println("x[3] =" +x[3]);
		System.out.println("x[4] =" +x[4]);
		System.out.println("x[5] =" +x[5]);
		System.out.println("x[6] =" +x[6]);
		System.out.println("x[7] =" +x[7]);
		*/
		
		// 없는 방을 요청하면 실행할 때 오류가 난다. (Array Index Out of Bound Exception 에러)
		// 컴파일러 단계에선 오류 모름 (문법상은 맞고, 메모리 할당은 실행단계에서 되므로)
		// System.out.println("x[8] =" +x[8]);
		
		
		// 윗 문단과 같은 겨로가를 반복문으로 만들어 보기
		// 힌트 - 배열의 인덱스는 배열 길이 -1
		// 배열의 길이는 배열변수는 length
		// for(초기값? 배열의 시작인덱스; 초기변수가 배열길이보다 작을 때까지; 초기변수++)
		for(int idx = 0; idx < x.length; idx++) {
			System.out.println("x[" +idx+ "] = " +x[idx]);
		}
		
		int idx2 = 0;
		while(idx2 <= x.length - 1) {
			System.out.println("x[ " +idx2+ " ] = " +x[idx2++]);
			// idx2++;  // 증감식을 따로 덧붙이는 형태도 가능하다.
			
		}
		
		
		// 향상된 for문
		for(int val : x) {
			System.out.println(val);
			
		}
		
		
		
		
		
		
		
		}
	}

