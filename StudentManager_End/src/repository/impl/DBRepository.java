package repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.MysqlDBConnect;
import entity.Student;
import repository.Repository;

public class DBRepository implements Repository {

	private Connection connection = null; 

	// DBRepository의 객체가 생성될때 DbConnection 객체를 connection에 넣고 싶다.
	// 생성자 
	
	public DBRepository() {
		try {
			this.connection = MysqlDBConnect.getConnection();
		} catch(Exception ex) {
			System.out.println("DB 접속에러 : \n" + ex.getMessage());
			
		}
	}
	
	
	//-- R
	//--  검색어가 없음 (메서드의 인자가 없음) = 학생 전체를 불러온다 
	@Override
	public List<Student> selectStudents() throws SQLException {
		
		String sql = "SELECT * FROM student ORDER BY std_no asc";
		PreparedStatement pstmt = connection.prepareStatement(sql); 
		//-- 쿼리를 DB에 날린다.
		ResultSet result = pstmt.executeQuery(); 
		List<Student> resultList = new ArrayList<Student>(); 
		// https://team.ideatags.io/manager.zip
		while(result.next()) {
			resultList.add(
					new Student(
							result.getInt("std_no"),
							result.getString("name"),
							result.getString("grade"),
							result.getInt("score"),
							result.getString("insert_dt"),
							result.getString("update_dt")
					)
			);
		}
		
		return resultList;
	}

	@Override
	public Student selectStudent(int stdNo) throws SQLException {
		
		String sql = "SELECT * FROM student where std_no = ? ";
		PreparedStatement pstmt = connection.prepareStatement(sql); 
		pstmt.setInt(1, stdNo);
		//-- 쿼리를 DB에 날린다.
		ResultSet result = pstmt.executeQuery(); 
		Student student = null; 
		
		while(result.next()) {
			student = new Student(
					result.getInt("std_no"),
					result.getString("name"),
					result.getString("grade"),
					result.getInt("score"),
					result.getString("insert_dt"),
					result.getString("update_dt")
			);
		}
		
		return student;
	}

	@Override
	public List<Student> selectStudent(String name) throws Exception {
		
		String sql = "SELECT * FROM student where name = ? ";
		PreparedStatement pstmt = connection.prepareStatement(sql); 
		pstmt.setString(1, name);
		//-- 쿼리를 DB에 날린다.
		ResultSet result = pstmt.executeQuery(); 
		List<Student> resultList = new ArrayList<Student>(); 

		while(result.next()) {
			resultList.add(
					new Student(
							result.getInt("std_no"),
							result.getString("name"),
							result.getString("grade"),
							result.getInt("score"),
							result.getString("insert_dt"),
							result.getString("update_dt")
					)
			);
		}
		
		return resultList;
	}

	@Override
	public Student lastInsertedStudent() throws Exception {
		
		// 
		String sql = "select * from student order by std_no desc limit 1"; 
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		ResultSet result = pstmt.executeQuery(); 
		Student student = null; 
		
		while(result.next()) {
			student = new Student(
					result.getInt("std_no"),
					result.getString("name"),
					result.getString("grade"),
					result.getInt("score"),
					result.getString("insert_dt"),
					result.getString("update_dt")
			);
		}
		
		return student;
	}

	//--- C (Insert) 

	@Override
	public boolean registStudent(Student student) throws SQLException {
		
		//String sql = "insert into 테이블명 (컬럼명,....) values (값 .. ); ";
		String sql = "insert into student (name, grade, score) values (?, ?, ?)";
		PreparedStatement pstmt = connection.prepareStatement(sql); 
		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getGrade());
		pstmt.setInt(3, student.getScore());
		int affectedRows = pstmt.executeUpdate();
		pstmt.close();
		
		return affectedRows > 0;
	}

	@Override
	public int updateStudent(int stdNo, Student student) throws SQLException {
		
		//String sql = "update 테이블명 set 컬럼=바꿀값,컬럼2=바꿀값2 where xxxx"; 
		String sql = "update student set name=?, grade=?, score=?"
					   + ",update_dt=current_timestamp() where std_no=?";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getGrade());
		pstmt.setInt(3, student.getScore());
		pstmt.setInt(4, stdNo);
		
		int affectedRows = pstmt.executeUpdate();
		pstmt.close();
		return affectedRows;

	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		// delete 문법 
		//String sql = "delete from 테이블명 where xxx";
		String sql = "delete from student where std_no = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql); 
		pstmt.setInt(1, stdNo);
		int affectedRows = pstmt.executeUpdate(); 
		pstmt.close();
		
		return affectedRows > 0;
	}

	@Override
	public void closeRepository() throws Exception {
		// 데이터베이스 커넥션을 닫는 
		if(connection != null && !connection.isClosed()) connection.close();
	}

}
