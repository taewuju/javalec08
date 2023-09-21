package Computer.persp;

public class GeForce extends VideoCard {

	
	
	
	@Override
	public void showMonitor(String text) {
		this.directX지원();
		super.showMonitor("나는 GeForce" +text);
	}

	public void directX지원() {
		
		System.out.println("나는 directX를 지원해");
	}
	
}
