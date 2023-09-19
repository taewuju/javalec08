/* 
 * 생성자(메서드) 오버로딩
 * 메서드 오버로딩과 똑같음 (인자의 수, 인자의 데이터 타입)
 */

class Student {
	
	String name;  // 학생 이름
	int grade;  // 학년
	
	//-- 기본 생성자 정의
//	public Student() {
//		name = "홍길동";
//		grade = 1;
//}
	public Student() {
		this("홍길동", 1);  // 아랫 줄에서 생성자를 불러옴
	}
	
	//-- 인자 하나(String)을 받는 생성자 오버로딩
	public Student(String stdName) {
		this(stdName, 1);  // this를 그냥 사용함.
//		name = stdName;
//		grade = 1;
	}
	
	//-- 인자 두 개(String, int)를 받는 생성자 오버로딩
//	public Student(String stdName, int stdGrade) {  // 인자의 갯수가 다르면 중첩 가능
//		name = stdName;
//		grade = stdGrade;
//	}
	public Student(String name, int grade) {
		this.name = name;  // this로 좌측은 내 객체, 우측은 매개변수의 name임을 구분해줌.
		this.grade = grade;  // this를 안 쓰면 에러는 나지 않지만 컴퓨터는 어느 name이고 grade인지 모름.
	}

	//-- 매개변수의 데이터 타입이 달라도 오버로딩은 가능
//	public Student(int stdGrade, String stdName) {  //  인자의 자료형 순서가 다르면 중첩 가능
//		name = stdName;
//		grade = stdGrade;	
//	}
	public Student(int grade, String name) {
		this.name = name; 
		this.grade = grade;
	}
	
	public void printMe() {
		System.out.println("내 이름은 " +name+ " " +grade+ "학년입니다.");
	}
	
}


public class ConstructorOverloadEx {

	public static void main(String[] args) {
		
		Student std1 = new Student();  // 기본 생성자
		Student std2 = new Student("하악이");  // 인자 하나
		Student std3 = new Student("하악하악", 6);  // 인자 2개
		Student std4 = new Student(7, "하악하악2");  // 인자 2개
		
		std1.printMe();
		std2.printMe();
		std3.printMe();
		std4.printMe();
		
	}
	
	
	
	
	
	
	
	
	
}
