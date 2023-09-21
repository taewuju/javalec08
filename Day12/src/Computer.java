import Computer.persp.*;

public class Computer {
	
	public void 비디오카드달기(Radeon rd) {
		
		rd.showMonitor("화면이 나와요.");		
	}
	
	public void 범용비디오카드달기(VideoCard vd) {
		
		vd.showMonitor("화면이 나와요.");
	}
	

	public static void main(String[] args) {
		
		Radeon rd = new Radeon();
		rd.showMonitor("화면을 출력해주세요");  // '오버라이딩'된 자식 메서드를 호출.
		rd.showMonitor();  // '오버로딩'된 자식메서드를 호출하는데, 
							//그 내용이 this.showMonitor(String), super.showMonitor(String)
		
		// 기본자료형에선 좌변(자료형,그릇)이 우변(값)보다 같거나 더 커야 하지만,
		// 참조자료형에선 양변의 관계가 상속관계이므로 제한이 없다.
		VideoCard video = new Radeon();  // 확장된 Radeon이 VideoCard에 들어가게 된다.
		VideoCard video2 = new GeForce();
		
		video.showMonitor("이건 부모를 호출할까? 자식을 호출할까?");
		
		// 1. 객체 생성  => 다형성 관련 예시
		Computer com = new Computer();
		
		com.비디오카드달기(new Radeon());  // 괜찮지만,
//		com.비디오카드달기(new GeForce());  // 에러남.
		
		com.범용비디오카드달기(new Radeon());  // 괜찮고,
		com.범용비디오카드달기(new GeForce());  // 괜찮음.
		
		
		// class 대한민국비디오카드 extends VideoCard
		// showMonitor() 메서드를 오버라이딩
		// com.비디오카드달기(new 대한민국비디오카드());
	}
}
