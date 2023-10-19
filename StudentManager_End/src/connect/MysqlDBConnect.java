package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDBConnect {

    private static Connection conn = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        if(conn == null) {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            conn =  DriverManager.getConnection(
            		"jdbc:mysql://lodossw-mysql.cepsqcj7hjbg.ap-northeast-2.rds.amazonaws.com:3306/javalec",
	        		"root", //id,
	        		"a1234567890"  //pwd 
            	
            );
        }
        return conn;
    }


    public static void closeConnection() throws SQLException {
        if(!conn.isClosed()) conn.close();
    }
}
