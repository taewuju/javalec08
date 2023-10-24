package lecture;

import repository.Repository;
import repository.impl.DBRepository;
import java.util.*;
import entity.Student;


public class Sample {

	public static void main(String[] args) throws Exception {
		
		// Repository 동작 확인
		Repository repo = new DBRepository();
		
		List<Student> list = repo.selectStudents();
		
		list.stream().forEach(v -> System.out.println(v));
		// list.stream().forEach(System.out::println);	
		
		repo.closeRepository();  // DB 연결 해제 (throws Exception)

	}

}
