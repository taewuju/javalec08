package Computer.persp;

public class Radeon extends VideoCard {
	
	@Override  // 오버라이드 됐음을 표시해 줄 수 있다.
	public void showMonitor(String text) {  // 1. 접근제한자를 제외한 나머지가 부모와 동일해야 한다. (여기선 void showMonitor(String text))
											// 2. 접근제한자가 부모의 범위보다 좁을 수 없다. (여기선 public 미만이 될 수 없음)
		게임3D가속();
		System.out.println("졸라멋진" +text);
	}
	
	// 오버로딩
	public void showMonitor() {  // 오버로드. 자식에게만 있는 메서드
		this.showMonitor("자식 객체의 showMonitor");  // '졸라 멋진'이 호출됨.
		super.showMonitor("부모 객체의 showMonitor");  // '부모 객체의 showMonitor'이 호출됨.
		System.out.println("showMonitor");
	}

	public void 게임3D가속() {
		
		System.out.println("Radeon 3D 가속");
				
	}
}
