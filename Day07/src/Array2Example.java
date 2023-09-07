
public class Array2Example {

	
	// 다차원 배열 사용
	public static void main(String args[]) {
		
		// 1. 2차원 배열 선언
		int[][] matrix;  // int matrix[][];
		
		// 2. 2차원 배열 선언과 동시에 데이터 공간만 만들기(값x)
		// int a[] = new int[5];
		int[][] matrix2 = new int[2][4];  // 왼쪽은 동의 수, 우변은 한 동마다 갖는 방의 수
		// 2개의 동으로 이뤄져 있는 아파트 단지
		// 한 동은 방 4개로 구성돼 있다. 
		// -> matrix 아파트 단지는 총 8가구 이다.
		// ? 내 친구의 집은 1동 3호에 삽니다. 내 친구 좀 불러주세요.
		// -> 컴퓨터는 0동 2호에 접근 -> matrix2[0][2];
				
		// 3. 배열 선언과 동시에 초기화
		int m[] = {1,2,3};
		int matrix3[][] = { 
				{1,2,3,4}, 
				{5,6,7,8} 
		};  // 2개 동 x 4개 방

		for(int idx1 = 0; idx1 < matrix3.length; idx1++) {
			
			for(int idx2 = 0; idx2 < matrix3[idx1].length; idx2++) {
				
				System.out.println("matrix3[" +idx1 + "][" +idx2+ "] = " +matrix3[idx1][idx2]);
				
			}
		}
		
		// 퀴즈 "matrix3[" +idx1 + "][" +idx2+ "] <- 이 출력을 제외하고
		// matrix3[0][0] = 1 식으로 출력하지 않고
		// 그냥 담겨져 있는 값만 출력하는 조건으로
		// 향상된 for문으로 출력하시오.
		
		
		int x1[] = {1,2,3,4};
		for(int val : x1) {
			System.out.println(val);
		}
		
		for(int[] val1 : matrix3) {
			for(int val2: val1) {
				System.out.println(val2);		
				
			}
		}
		
		
		
		
		
		
	}	
}
