package excercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BigEx5_10 {
	public static void main(String[] args) {

		try {

			String driverName = "com.mysql.jdbc.Driver";
			String dbName = "world_0";
			String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
			

			// 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			Statement stmt = con.createStatement();
			
			String sql = "UPDATE city SET name = '서울특별시' WHERE name = '서울';";
			
			stmt.executeUpdate(sql);
			
			sql = "SELECT * FROM city;";
			ResultSet result2 = stmt.executeQuery(sql);
			
			System.out.println("	--- 테이블 city 조회 ---");			
			
			while (result2.next()) {
				System.out.print(result2.getInt(1) + "\t");
				System.out.print(result2.getString(2) + "\t");
				System.out.print(result2.getString(3) + "\t");
				System.out.println(result2.getInt(4) + "\t");
			}
			
			result2.close();
			con.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
