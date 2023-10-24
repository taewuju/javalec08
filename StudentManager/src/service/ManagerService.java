package service;

import java.util.List;
import entity.Student;

public interface ManagerService {  // 상위 레이어일수록 단순해지는 게 좋으므로 자세한 건 ManagerServiceImpl에서 다룸.

    //-- 학생등록
    Student registerStudent(Student student) throws Exception;

    //-- 학생수정
    Student modifyStudent(Student student) throws Exception;

    //-- 학생조회 => 다른 항목들과 달리 3개의 메서드가 달림(전체조회, 이름으로 조회, 학번으로 조회)
    List<Student> searchStudents(Student student) throws Exception;

    //-- 학생삭제
    boolean deleteStudent(int stdNo) throws Exception;

    //-- 자원반납
    void closeService() throws Exception;

}
