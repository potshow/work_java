package excercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BigEx5_5 {
	public static void main(String[] args) {

		try {

			String driverName = "com.mysql.jdbc.Driver";
			String dbName = "world_0";
			String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
			

			// 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			String sql = "INSERT INTO city (name, major, pop) VALUES(?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "서울");
			pstmt.setString(2, "이명길");
			pstmt.setInt(3, 20000000);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "인천");
			pstmt.setString(2, "김동훈");
			pstmt.setInt(3, 3500000);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "대구");
			pstmt.setString(2, "강수복");
			pstmt.setInt(3, 3000000);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "부산");
			pstmt.setString(2, "남기문");
			pstmt.setInt(3, 5000000);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "목포");
			pstmt.setString(2, "신용현");
			pstmt.setInt(3, 2000000);
			pstmt.executeUpdate();
			
			// 테이블 생성

			sql = "SELECT * FROM city;";
			pstmt = con.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery(sql);
			
			System.out.println("	--- 테이블 city 조회 ---");			
			
			while (result.next()) {
				System.out.print(result.getInt(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getString(3) + "\t");
				System.out.println(result.getInt(4) + "\t");
			}
			
			result.close();
			pstmt.close();
			con.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
