package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTable {
	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "myjavadb";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
		String sql = "SELECT * FROM student;";
		

		try {
			// 1. JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 2. 질의를 할 statement 만들기
			Statement stmt = con.createStatement();
			
			// 데이터베이스 myjavadb의 테이블 student의 레코드 조회
			ResultSet result = stmt.executeQuery(sql);
			System.out.println("	--- 테이블 student 조회 ---");
			while (result.next()) {
				System.out.print(result.getString(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getInt(3) + "\t");
				System.out.println(result.getString(4));
			}
			
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
