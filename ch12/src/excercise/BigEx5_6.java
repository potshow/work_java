package excercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BigEx5_6 {
	public static void main(String[] args) {

		try {

			String driverName = "com.mysql.jdbc.Driver";
			String dbName = "world_0";
			String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
			

			// 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			Statement stmt = con.createStatement();
			
			String sql = "SELECT * FROM city WHERE pop >= 3000000;";
			
			ResultSet result = stmt.executeQuery(sql);
			
			System.out.println("	--- 테이블 city 조회 ---");			
			
			while (result.next()) {
				System.out.print(result.getInt(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getString(3) + "\t");
				System.out.println(result.getInt(4) + "\t");
			}
			
			result.close();
			con.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
