package repository;

import java.util.List;
import entity.Student;


public interface Repository {  // 인터페이스로 규약 만들기
	
	// CRUD
	// 1. Read
	// 학생목록 전체 들고 오기
	List<Student> selectStudents() throws Exception;  // 리스트 스튜던트가 row 하나에 해당
	
	// 학생정보 하나 불러오기 (key인 학번기준으로 Where 해 와라)
	Student selectStudent(int stdNo) throws Exception;
	
	// 학생이름으로 학생정보 불러오기
	// 동명이인이 존재할 수 있으니 List<Student>로 	
	List<Student> selectStudents(String name) throws Exception;  // 오버로딩함.
	
	// 최종 추가(insert)된 학생 하나 불러오기
	abstract Student lastInsertedStudent() throws Exception;  // 여기서 abstract는 생략가능.
	
	
	// 2. Create(Insert)
	// 학생 입력하기
	boolean registStudent(Student student) throws Exception;
	
	// 3. Update(Update)
	// 학생 한명 수정하기
	int updateStudent(int stdNo, Student student) throws Exception;  // where 조건엔 int stdNo 이, set 조건엔 Student student 가 들어가게 됨.
	
	// 4. Delete(Delete)
	// 학생 한명 삭제하기
	boolean deleteStudent(int stdNo) throws Exception;
	
	// 5. 자원 반납(DB Close)
	void closeRepository() throws Exception;
	
	
	
	
	
}
