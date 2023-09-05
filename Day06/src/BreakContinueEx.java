import java.util.Scanner;

public class BreakContinueEx {

	public static void main(String args[]) {

		int command = 0;
		for(;;) {  // 무한 루프
			System.out.print("숫자를 입력하세요(프로그램 종료는 음수 입력) : ");
			Scanner in = new Scanner(System.in);  // 스캐너로 입력 받겠다. 값을 입력할 때까지 멈춰있는다.
			command = in.nextInt();  // 숫자를 읽어들인다.
			
			if(command < 0) {  // 0보다 작은 수(음수)가 입력되면
				break;  //  반복문을 끝내겠다.
			}
			
			System.out.println("입력값은 " +command+ "입니다.");  // 양수면 출력 후 다시 반복된다.
		}  // for loop문 끝
		// <--
		System.out.println("프로그램 종료");  // 음수면 break 실행돼 출력과 함께 반복이 끝난다.
		
		/* 코드상 break를 ㅆ는 쪽이, break가 없는 아랫쪽 문단보다
		 * 예시상으로 보면 연산을 50% 적게 하게 된다.
		for(int i = 0; i<10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);  // 0~4			
		}  // 5번 반복한 후 탈출하게 된다. break문을 이용하는 쪽이  더 효율적이다.
		
		for(int i = 0; i<10; i++) {
			if(i < 5) {
				System.out.println(i);  // 0~4	
			}  // 0~9까지 10번 반복하므로 최대 31번 연산하게 된다.
			
			*/
		
		
		
		
		
		
		
		
		
	
}
}