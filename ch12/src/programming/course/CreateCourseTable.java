package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCourseTable {

	public static void main(String[] args) {


		String dbName = "univ";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;

		String sqlCT = "CREATE TABLE course (" +
				"id INT, " +
				"name VARCHAR(30), " +
				"professor VARCHAR(30), " +
				"maxnum INT, " +
				"PRIMARY KEY ( id ) " +
				");";
		
		try {
			// 드라이버 로드
			String driverName = "org.gjt.mm.mysql.Driver";
			Class.forName(driverName);
			// 데이터베이스 연결
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
		//  Connection con = DriverManager.getConnection(url + "/" + dbname, "root", "koitt");
		//  이렇게 해도됨
			
			// sql문을 넣을 객체 생성
			Statement stmt = con.createStatement();
			
			// sql문 작성
			stmt.executeUpdate(sqlCT);
			System.out.println("테이블 course 생성 완료");
			
			// 객체연결해제
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
