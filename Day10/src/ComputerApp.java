//import javalec.computer.videocard.Geforce;  // 2-1. 파일 최상단에 import(폴더 열기)로 패키지를 미리 꺼내놓는 방법
//import javalec.computer.videocard.Radeon;  // 하나하나 꺼내려면 해당 패키지명을 입력하면 된다.

import javalec.computer.videocard.*;  // *(별) 모양은 '모두'라는 의미이다. 패키지명을 일일이 입력할 필요가 없다.
									  // videocard 폴더 하위의 모든 클래스를 꺼내겠다는 의미이다.

public class ComputerApp {

	public static void main(String[] args) {
		// 다른 폴더에 있는 GeForce와 Radeon 객체를 생성하고 싶다.
		// 어떻게?
	
//		javalec.computer.videocard.Geforce video1 =
//				new javalec.computer.videocard.Geforce();  // 1. 패키지의 경로를 모두 작성 사용하는 방법
		
		Geforce video1 = new Geforce();  // 2-2. 상단에서 미리 꺼내놓았으므로 경로를 안 써도 된다.		
		video1.turnOnMonitor();
//		video1.defaultPrintName();  // 다른 폴더 내이므로 default를 호출 불가함.
//		video1.protectedPrintName();
		
		Radeon video2 = new Radeon();
		video2.turnOnMonitor();
		
		// video1.defaultPrintName();  // Geforce 패키지가 같은 폴더 내에 없으므로 호출 불가
		video1.publicPrintName();  // 접근제한범위 없으므로 호출 가능함.
	}
	
	
	
}
