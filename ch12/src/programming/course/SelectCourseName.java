package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectCourseName {
	public static void main(String[] args) {

			
			try {
				String driverName = "com.mysql.jdbc.Driver";
				String dbURL = "jdbc:mysql://localhost:3306";
				String dbName = "univ";
				
				// 1.드라이버 로드
				Class.forName(driverName);
				
				// 2. 데이터베이스 연결
				Connection con = DriverManager.getConnection(dbURL + "/" + dbName, "root", "koitt");
				
				// 3. SQL문 작성
				String sql = "SELECT * FROM course WHERE name LIKE ?";
				
				// 3-1. 표준입력 받기
				System.out.println("강좌 이름을 입력하세요 >>");
				Scanner input = new Scanner(System.in);
				String name = input.nextLine();
				name = "%" + name + "%";
				input.close();
				
				// 4. SQL문 실행을 위한 객체생성
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);		// 첫번째 물음표에 name 값을 입력
				
				// 5. 질의결과처리
				// 결과 출력을 위한 ResultSet이 필요.
				ResultSet rs = pstmt.executeQuery();
				System.out.printf("%s\t%s\t%s\t%s\n", "id", "name", "professor", "maxnum");			
				while (rs.next()) {
					System.out.printf("%s\t%s\t%s\t%s\n",
					rs.getInt("id"), rs.getString("name"), rs.getString("professor"), rs.getInt("maxnum"));
				}
				
				// 6. 객체 연결 해제
				// 닫는 순서는 역순으로 닫으면 됨.
				rs.close();
				pstmt.close();
				con.close();

				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			

	}
}
