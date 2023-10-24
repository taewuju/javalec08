package service.impl;

import java.util.List;
import entity.Student;
import service.ManagerService;
import repository.Repository;
import repository.impl.*;

public class ManageServiceImpl implements ManagerService {
	
	//-- Repository 객체 생성
	//-- 불변 객체
	private final Repository repository = new DBRepository();
	
	// 학생 등록
	@Override
	public Student registerStudent(Student student) throws Exception {
		
		if(repository.registStudent(student)) {
			return student;
		}		
		return null;
	}

	@Override
	public Student modifyStudent(Student student) throws Exception {
		
		int affectedRows = repository.updateStudent(student.getStdNo(), student);
		if(affectedRows > 0) {
			return student;
		}
		return null;
	}

	@Override
	public List<Student> searchStudents(Student student) throws Exception {
		// Repository에 3개의 메서드가 있습니다.
		// List<Student> selectStudent(), 
		// List<Student> selectStudent(String name), 
		// Student selectStudent(int stdNo) -> 앞의 두 개와 달리 리스트로 한번 변경해줘야 함.
		
		List<Student> list = null;
		// 1. student 인자가 null일 경우
		// 2. student 인자의 String name 속성이 있는 경우 (getName());
		// 3. student 인자의 int stdNo 속성 값이 있는 경우 (getStdNo());
		
		if(student == null) {
			list = repository.selectStudents();  // 모든 학생의 목록을 가져와라
		} else if(student.getName() !=null) {
			list = repository.selectStudents(student.getName());  // 학생 이름으로 검색
		} else {  // 학번으로 조회
			Student std = repository.selectStudent(student.getStdNo());
			if(std == null) {
				list = List.of();  // 조건에 부합하는 학생이 없을 때는 빈 List를 전달
			} else {
				list = List.of(std);
			}
		}		
		return list;
	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {  // 리턴 타입이 서로 같아서 따로 가공 안해줘도 됨.
		
		return repository.deleteStudent(stdNo);
	}

	@Override
	public void closeService() throws Exception {
		
		repository.closeRepository();
		
	}	
	
	
}
