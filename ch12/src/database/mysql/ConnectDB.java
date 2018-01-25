package database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	public static void main(String[] args) {
		
		try {
			// JDBC 드라이버의 이름 지정
			// Mysql의 jdbc의 공식적인 위치 : https://dev.mysql.com/doc/connector-j/5.1/en/connector-j-usagenotes-connect-drivermanager.html
			String driverName = "com.mysql.jdbc.Driver";
			
			// JDBC 드라이버 로드
			// 프로그램 구동중에 클래스 정보를 가져오고 싶을때 쓰는 메서드
			// Class.foName(); : 패러미터 안의 클래스 정보를 가져옴.
			Class.forName(driverName);
			
			// 접속할 정보인 URL 지정
			String dbURL = "jdbc:mysql://localhost:3306";
			
			// 데이터베이스에 연결 ( , 계정, 비번);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			System.out.println("MySql 데이터베이스에 성공적으로 접속했습니다");
			con.close();
			
		} catch (Exception e) {
			System.out.println("MySql 데이터베이스 접속에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
