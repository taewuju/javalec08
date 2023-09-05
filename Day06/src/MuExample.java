
// 중첩된 for문
public class MuExample {

	public static void main(String args[]) {
		// 구구단
		// x * y = (x * y)
	
		/*
		for(int x = 2; x < 10; x++) {
			System.out.println("## "+x+"단 ##");  // 새로운 단 시작 전에 몇 단인지 출력한다.
			for(int y = 1; y < 10; y++) {
				System.out.println(x+ "x" +y+ " = " +(x*y));
			}
		
		}
	*/
	
		/*
		System.out.println("## 구구단 ##");
		for(int x = 2; x <= 9; x++) {
			for(int y = 1; y < 10; y++) {
			 //System.out.println(x+ "x" +y + " = " + (x*y));
			System.out.print(x+ "x" +y+ " = " +(x*y)+ "\t");
			// println();  -> new line (출력하고 엔터까지)
			// print();  -> 엔터없음.
			}
		}
			
			System.out.print("\n");  //
			// System.out.print(""); 와 같다.
		*/
		
		System.out.println("## 구구단 ##");
		for(int x = 1; x <= 9; x++) {
			for(int y = 2; y < 10; y++) {
			 //System.out.println(x+ "x" +y + " = " + (x*y));
			System.out.print(y+ "x" +x+ " = " +(x*y)+ "\t");

			}
		}
			
			System.out.print("\n");  //
			// System.out.print(""); 와 같다.

	}
	}

