package lecture;

import java.sql.*;

// 자바에선 DB를 사용할 때는 JDBC (Java Database Connectivity)
// java.sql 패키지에 존재합니다.
// !) java.sql은 대부분 추상클래스와 Interface로 구성돼 있고,
// 따라서 내가 접속해야할 DBMS에서 제공하는 Driver라는 놈을 사용해야 합니다.
// ex) mysql driver, Oracle driver ( jdbc connector/j )
// Driver를 구하는 데는 크게 2 군데 있습니다.
// 1. DBMS 회사 사이트 (downlaod -> community -> connector/j -> platform indepedent) 
// https://mysql.com/
// 2. Maven Repository ( 스프링이나 기타 등등 할 때 사용)
// https://mvnrepository.com/


// JDBC 데이터베이스 사용방법
// 1. 벤더의 jdbc driver를 로딩한다.
// 2. DB Connection을 한다.
// 3. 질의문(SQL)을 날린다.
// 4. 3번의 결과를 가공한다.
// 5. 2번에서 한 Connetion을 닫는다.


public class DbControlEx {

	public static void main(String[] args) throws Exception {
		// 1. 벤더(mysql)의 jdbc driver(connector/j)를 로딩한다.
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		// 2. Connection을 맺는다.
		// DB에 접속해서 -> 로그인까지하고 + 사용할 데이터베이스(폴더)까지 결정
		// http://naver.com -> 주소
		// DBConnection을 얻으려면 Host, id, password, port 이 4가지 정보가 필요함.
		// getConnection의 url에는 엔드포인트:mysql의포트번호/대상폴더를 입력함.
		// http://와 https://는 웹 프로토콜임.
		// 참고로 jdbc의 프로토콜은 jdbc:mysql://임.
		Connection conn = DriverManager.getConnection("jdbc:mysql://tjdb-mysql.chf2poo4csw2.us-east-1.rds.amazonaws.com:3306/javalec08", "root", "a1234567890");  
		// JAVA connection String : url, 아이디, 비밀번호 입력
		
		System.out.println("허얼");
		
		//-- [R]ead
//		String sql = "SELECT*FROM test_table";
		String sql = "SELECT * FROM test_table Where user_name = '이종석'";
		
		//-- 자바에서는 DB 에 질의할 때 2가지 타입
		//-- 1. statement
		//-- 2. preparedStatement : 속도와 보안상 더 좋음.
		
		// Statement를 사용
		Statement stmt = conn.createStatement(); 
		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next()) {
			System.out.println(
					String.format("user_no : %d, user_name : %s",
									    rs.getInt("user_no"),
									    rs.getString("user_name") 
					)
			); 
		}
		
		//-- [C]reate -> Insert
//		sql = "insert into test table (user_no, user_name) values ('10', '이종석')";
		
		sql = "insert into test_table (user_no, user_name) values (?,?)";
		// PreparedStatement를 사용
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 10);  // 첫번째 인자엔 1을, 두번째 인자엔 10을 넣겠다.
		pstmt.setString(2, "허얼");		
		pstmt.execute();
		
//		pstmt.close();
		
		// [U]pdate
		sql = "update test_table set user_name = ? where user_name = ?";
//		pstmt = conn.prepareStatement(sql);
		PreparedStatement pstmt2 = conn.prepareStatement(sql);
		pstmt2.setString(1,  "AAA");
		pstmt2.setString(2, "허얼");
		pstmt2.execute();		
		
		// Delete
		// PreparedStatement pstmt3로 user_name = 'AAA'인 것만 삭제하라
		sql = "delete from test_talbe where user_name =?";
		PreparedStatement pstmt3 = conn.prepareStatement(sql);
		pstmt3.setString(1, "AAA");
		pstmt3.execute();
		
		conn.close();  // 5. 커넥션을 닫는다 (자원 반납) 
		
		
		
		
		
		
		
		
	}	
	
}
