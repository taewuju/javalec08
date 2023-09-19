package school;

// 학급
public class ClassRoom {

	static int 학교누적인원 = 0;  // static을 사용하면 전체 객체에서 공유할 수 있게 된다.
	int 가용인원;  // static이 없으면 각 객체에 존재하는 속성, 즉 클래스의 특징만 나타남. 
	int 현재인원;  // 그러므로 100개면 100개의 현재인원이 있게 된다.
	
	public ClassRoom() {
		가용인원 = 30;
		현재인원 = 0;
	}
	
	public void 입학() {
		학교누적인원 ++;
		현재인원 ++;
		가용인원 --;
	}
	
	public void 퇴학() {
		학교누적인원 --;
		가용인원 ++;
		현재인원 --;
	}
	
	public void printMe() {
		System.out.println("=====================");
		System.out.println("가용인원 : " +가용인원);  // 학급
		System.out.println("현재인원 : " +현재인원);  // 학급
		System.out.println("학교누적인원 : " +학교누적인원);  // 전체 누적
	}
	
	public static void printMe2() {
		System.out.println("=====static=====");		
		
	}
	
}
