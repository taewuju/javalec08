package repository;

import java.util.List;

import entity.Student;

public interface Repository {
	
	// CRUD 
	// 1. Read 
	List<Student> selectStudents() throws Exception;
	
	Student selectStudent(int stdNo) throws Exception;

	List<Student> selectStudent(String name) throws Exception;

	//-- 최종 추가된 학생
	Student lastInsertedStudent() throws Exception; 


	// 2. Create(Insert) 
	boolean registStudent(Student student) throws Exception;
	
	// 3.Update
	int updateStudent(int stdNo, Student student) throws Exception; 
	
	// 4.Delete 
	boolean deleteStudent(int stdNo) throws Exception;


	// 5. 자원반납
	void closeRepository() throws Exception;

	
}
