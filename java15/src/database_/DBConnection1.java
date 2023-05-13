package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection1 {
	public static void main(String[] args) {
        SQLConnector c = new SQLConnector();
        
        // 자료구조 알고리즘 멀티쓰레드 DB 네크워크(소켓)
    }
}


// 연결테스트
class SQLConnector{
	private Connection conn;
	private static final String DBID = "root";
	private static final String DBPW = "root";
	private static final String DBURL = "jdbc:mariadb://localhost:3307/company";
	
	// 생성자
	public SQLConnector() {
		try {
			System.out.println("생성자 사용");
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(DBURL,DBID,DBPW);
			System.out.println("마리아DB 드라이버 로딩성공");
		} catch (Exception e) {
			System.out.println("마리아DB 로딩 실패");
			e.printStackTrace();
		} finally {
			// 성공하든 실패하든 상관없이
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
}
}