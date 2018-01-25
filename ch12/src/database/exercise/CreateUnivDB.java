package database.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateUnivDB {
	public static void main(String[] args) {
		
		String driverName = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306";
		
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("CREATE database univ;");
			System.out.println("DB생성완료");
			
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
