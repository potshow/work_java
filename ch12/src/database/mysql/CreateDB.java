package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
	public static void main(String[] args) {

		try {
			String driverName = "com.mysql.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306";

			// 1. JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			// 2. 질의를 할 Statement 만들기
			// statement : query 문을 실행할 객체. 
			// connection 을 통해 만들어짐.
			Statement stmt = con.createStatement();

			// 3. 데이터베이스 myjavadb 만들기
			// update 문을 쓸 때에는 select를 제외한 명령어 추가, 삭제, 수정되는 등의 변화가 생겼을 때 씀.
			// query 문의 update와는 다름.
			stmt.executeUpdate("Create database myjavadb;");
			System.out.println("데이터베이스 myjavadb가 생성되었습니다.");

			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩에 실패했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("MySQL 데이터베이스에 문제가 있습니다.");
			e.printStackTrace();
		}


	}

}
