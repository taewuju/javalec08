
//-- 기본적으로 자바라는 언어는
//-- 모두 클래스로 이루어져 있다.
//---> 최소 파일 1개당 하나 이상의 클래스가 정의되어야 한다.

//class ClassEx2 {
//	
//}
// 하나의 파일에 2개 이상의 클래스 생성 가능하나, 
// 컴파일하면 클래스 파일이 각각 생기므로 잘 사용하지 않는 방법이다.

//-- 클래스 정의 문법
//-- 접근제한자 class 클래스명 { 멤버 ... }

//-- 멤버의 구성요소
//-- 1. 필드/멤버변수/속성 -> 클래스 전역 변수/상수
//-- 2. 메서드 -> 클래스의 기능/행위를 정의
//-- 3. 생성자(메서드) -> 클래스의 객체를 생성하는 행위/기능을 정의
//-- !) 위의 세 개의 멤버가 꼭 정의되어야 하는 것은 아니다.

class Nvidia {
	String modelName;  //-- 속성. 속성은 변수이자 데이터이다.
	String modelNo;  //-- 속성
	void echoModel() {  //-- 메서드. (모델명을 말하고자 한다.)
		System.out.println("modelName : " +modelName);
		System.out.println("modelNo : " +modelNo);	
	}
	
	void showMonitor() {  //-- 메서드. (모니터에 그래픽을 표시하고자 한다.)
		System.out.println("모니터야 나와랏!");
	}
}

public class ClassEx {
	public static void main(String args[]) {  // main 메서드
											  // App 스타팅 포인트
		// 1. Nvidia 객체를 생성하자.
		Nvidia video = new Nvidia();  // Nvidia(); <-- 생성자 메서드
		// 2. 객체의 메서드나, 속성에 접근하고자 할 때 사용하는 연산자
		// .(온점) 연산자이다.
		
		// 속성에 직접 접근한다.		
		video.modelName = "Geforce";
		video.modelNo = "3770";
		
		System.out.println(video.modelName);
		
		//-- 메서드 직접 호출한다.
		video.echoModel();
		video.showMonitor();
		
		String a = "이종석";
		java.lang.String b = "이종석";
		// java/lang/String.class 와 같은 의미이다.
		// java.lang.System => System 클래스도 마찬가지로 기본제공되어 앞 부분을 따로 쓸 필요 없다.
	}
}


