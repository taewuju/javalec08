package javalec.computer.videocard;

public class ModiEx {

	public static void main(String[] args) {
		
		Geforce video1 = new Geforce();
		video1.defaultPrintName();  // 같은 폴더 내이므로 default를 호출 가능함.
		video1.protectedPrintName();
//		video1.privatePrintName();  // private는 자기자신만 호출 가능하고 (상속에서도 제외됨)
//		// ModiEx와 Geforce는 다른 객체이므로 호출할 수 없다.
		
		Geforce video2 = new Geforce();  // 인자 없는 생성자(기본값)
		// 자바는 기본적으로 object 클래스에서 기본 생성자를 정의해 있어서 생성자 정의 없이도 사용가능하다(?) 
		Geforce video3 = new Geforce("냥냥냥");  // 인자 있는 생성자
		
		System.out.println(video2.modelName);
		System.out.println(video3.modelName);
	}
	
	
	
	
	
	
	
	
}
