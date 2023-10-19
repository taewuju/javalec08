package repository.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import connect.CollectionDBConnect;
import entity.Student;
import repository.Repository;

public class CollectionRepository implements Repository {

	private static List<Student> students; 
	private int stdNo = 1;

	//-- Collection 에선 mysql의 current_timestamp() 함수가 없어서 자바에서 처리하도록 정리
	private static final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 2023-06-23 12:00:10


	public CollectionRepository() {
		this.students = CollectionDBConnect.getConnection();
	}

	@Override
	public List<Student> selectStudents() throws Exception {
		return null;
	}

	@Override
	public Student selectStudent(int stdNo) throws Exception {
		
//		Student student = null;
//		for(Student v : this.students) {
//			if( v.getStdNo() == stdNo ) {
//				student = v; 
//				break;
//			} 
//		}
		
		List<Student> stdList = students.stream()
				.filter( v -> v.getStdNo() == stdNo).toList(); //.collect(Collectors.toList()); 
		
		return stdList.size() > 0 ? stdList.get(0) : null;
	}

	@Override
	public List<Student> selectStudent(String name) throws Exception {
		return null;
	}

	@Override
	public Student lastInsertedStudent() throws Exception {
		return null; 
	}

	@Override
	public boolean registStudent(Student student) throws Exception {

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return true; 
	}

	@Override
	public int updateStudent(int stdNo, Student student) throws Exception {
		return 0;
	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		return false; 
	}

	@Override
	public void closeRepository() throws Exception {

	}
}
