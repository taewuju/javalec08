import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
	
	String name;
	int grade;
	
	Student(String name, int grade) {  // 생성자
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [name:" +name+ ", grade: " +grade+ "]";
	}
	
}


public class ExceptionEx02 {
	
	static Student[] students = new Student[3];

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name;
		int grade = 0;
		int studentIdx = 0;  //-- 배열 인덱스
		
		while(true) {
		System.out.print("이름을 입력하세요 : ");
		name = scanner.nextLine();  // 문자열을 입력
		
		try {
			System.out.print("학년을 입력해주세요 : ");
			grade = Integer.parseInt(scanner.nextLine());
			// InputMismatchException(?) 처리 필요. 정수를 입력 안 하면. 해당 catch문으로 건너 뜀.
			students[studentIdx++] = new Student(name,grade);  
			// ArrayIndexOutOfBoundsException 처리 필요. 해당 catch문으로 건너 뜀.			
		} catch (InputMismatchException ex) {  // InputMismatchException 처리
			System.out.println("학년은 숫자만 입력해주세요.");
			continue;
		} catch(ArrayIndexOutOfBoundsException ex) {  // ArrayIndexOutOfBoundsException 처리
			System.out.println("방이 꽉 찼습니다.");
			break;  // 배열 3개가 다 차면 멈춤.
		} catch(Exception ex) {
			System.out.println("알 수 없는 예외가 발생하였습니다.");
			continue;
		}
		
		System.out.println(studentIdx+ "명의 학생이 저장되었습니다.");		
		
		for(Student std : students) {   // 향상된 for문
			System.out.println(std);  // or System.out.println(std.toString());
		}
		}
	}
}
