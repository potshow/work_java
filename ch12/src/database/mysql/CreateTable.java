package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {


		try {
			String driverName = "org.gjt.mm.mysql.Driver";
			String dbName = "myjavadb";
			String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
			String sqlCT = "CREATE TABLE student (" +
					"id VARCHAR(20) NOT NULL, " +
					"name VARCHAR(20) NOT NULL," +
					"snum int NOT NULL, " +
					"dept VARCHAR(20) NOT NULL, " +
					"PRIMARY KEY ( id ) " +
					");";

			// 1. JDBC 드라이버 로드
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");

			// 2. 질의 할 Statement 만들기
			Statement stmt = con.createStatement();

			// 3. 데이터베이스 myjavadb에 테이블 student 만들기
			stmt.executeUpdate(sqlCT);
			System.out.println("테이블 student가 생성되었습니다.");

			// 데이터베이스 myjavadb의 테이블 student에 레코드 삽입
			stmt.executeUpdate("insert into student values('01', '홍', 20125678, '전산과학과');");
			stmt.executeUpdate("insert into student values('02', '김', 20121234, '미생물학과');");
			stmt.executeUpdate("insert into student values('03', '김', 20137892, '고고학과');");
			System.out.println("테이블 student에 3개의 레코드가 삽입되었습니다.");

			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}



	}

}
