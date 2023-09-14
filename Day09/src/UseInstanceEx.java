
public class UseInstanceEx {

	public static void main(String[] args) {
		
		// 원주율을 구하고 싶다.
		// 반지름은 5이다.
		
		CalClassEx cal = new CalClassEx();  // 미리 만들어놓은 CalClassEx 클래스를 호출해서 객체화(인스턴트화) 한다.
		CalClassEx cal2 = new CalClassEx();
		
		
		cal.printMyName();  // 클래스에서 온점 연산자를 이용하면 객체로 필요한 기능을 호출해 와서 실행 한다.
		float result = cal.원주율(4);  // 리턴값이 있다.
		System.out.println(result);
		
		cal2.printMyName(); 
		result = cal.원주율(10);  // 리턴값이 없다.
		System.out.println(result);
		
		System.out.println(cal == cal2);  // cal과 cal2는 같은 행위를 하지만 new 연산자를 사용해 생성한 것이므로 서로 다른 객체이다.
		
		
		int a = 10;  // int 등의 기본자료형은 온점 연산자를 사용할 수 없다.
		System.out.println("이종석");
		int[] b = {1,2,3};
	}
}
