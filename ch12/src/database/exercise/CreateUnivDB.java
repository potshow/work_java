package database.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateUnivDB {
	public static void main(String[] args) {
		
		String driverName = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306";	 // < DB만들기 전이라 안씀.
		
		try {
			// 1.드라이버 로드
			Class.forName(driverName);
			// 2. 데이터베이스 연결
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			// 3. SQL을 위한 stmt 객체 생성 + pstmt이라 sql문 설정까지
			PreparedStatement pstmt = con.prepareStatement("CREATE DATABASE univ");
			// 4.  SQL문 실행
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
			// 5. ResultSet을 이용해 질의결과 처리 (생략)
			
			/*Statement stmt = con.createStatement();
			
			stmt.executeUpdate("CREATE database univ;");
			System.out.println("DB생성완료");
			
			stmt.close();
			*/
			
			// 6. 객체연결해제
			pstmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
