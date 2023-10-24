package connect;

import java.sql.*;

// 데이터베이스 커넥션 클래스
public class MysqlDBConnect {

	// 싱글턴패턴으로 DBConnection을 사용할 것입니다.
	// 한 번 연결되면 끊길 때까지 connection이 유지되는 구조
	private static Connection conn = null;

	//-- DB연결 (connection) 객체 리턴
	public static Connection getConnection() throws Exception {
		
		//-- 한 번도 연결한 적이 없을 때 연결작업 수행
		if(conn == null) {
			
			// 1. mysql 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DriverManager를 이용한 connection 객체 얻기
			conn = DriverManager.getConnection(
					"jdbc:mysql://tjdb-mysql.chf2poo4csw2.us-east-1.rds.amazonaws.com:3306/javalec",
					"root",
					"a0123456789"					
//					"urlString jdbc:mysql://엔드포인트:포트/접근데이터베이스명",
//					"id",
//					"password"
					);
		}		
		
		return conn;
	}
	
	//-- 연결된 DB 끊기
	public static void closeConnection() throws Exception {
		
		if(conn != null && !conn.isClosed()) conn.close();
	}
	
}
