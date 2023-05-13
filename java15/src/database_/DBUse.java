package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUse {
	public static void main(String[] args) {
		MyQuery mq = new MyQuery();
		
		mq.Connect();
		mq.insert();
	}
}

class MyQuery {
	// 데이터베이스는 기본적으로 읽기, 쓰기, 수정, 삭제 CRUD
	// 프로그래밍 언어에서 DataBase를 사용하기 위해선 두가지 방법이 있음
	// Statement : 쉬움 EZ, 보안취약점
	// PreparedStatement : 어려움 (에봐야~), 보안강화, 이걸 쓰는걸로 하자(최신버전이 더 쉬웠으면 하는건 날로먹겠다는 썩은 마인드야)
	private Connection conn;
	private static final String DBID = "root";
	private static final String DBPW = "root";
	private static final String DBURL = "jdbc:mariadb://localhost:3307/company";		
	// jdbc:mysql://아이피주소:포트번호/스키마이름
	
	// 생성자 (라이브러리 로드)
	public MyQuery() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");		//"com.mysql.cj.jdbc.Driver"
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 라이브러리 로드 실패");
		}
	}
	
	// DB연결
	public void Connect() {
		try {
			conn = DriverManager.getConnection(DBURL,DBID,DBPW);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		}
	}
	
	// DB입력 : INSERT INTO 테이블명 VALUSE 값;
	public void insert() {
		PreparedStatement pstmt = null;		// try-catch 땜시 선언부터
		String sql_query = "INSERT INTO company.employee VALUES ( ?, ? , ? )";
		
		try {
			// pstmt에다가 sql_query를 넣기
			try {
				pstmt = conn.prepareStatement(sql_query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// ? 채우기
			pstmt.setInt(1, 5);		// 첫번째 ?에는 숫자 4를 넣는다
			pstmt.setString(2, "전인호");
			pstmt.setString(3, "남자");	// 세번째 ?에는 문자열 '남자'를 넣는다
			
			// sql쿼리를 db서버에 전송한다
			int result = pstmt.executeUpdate();
			
			// 성공여부를 판별한다
			if (result > 0 ) {
				System.out.println("DB입력 성공!");
			} else {
				System.out.println("DB입력 실패!");
			} 
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("DB입력 실패(바깥)");
		} finally {
			// pstmt 해제, DB연결 해제
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
