package programming.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCourseTable {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306";
			String dbName = "univ";
			
			// 1. 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. 데이터베이스 연결
			Connection con = DriverManager.getConnection(url + "/" + dbName, "root", "koitt");
			
			// 3. SQL문 작성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO course VALUES (?, ?, ?, ?)");
			
			// 4. SQL 실행을 위한 객체 생성
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			// 5. 데이터 입력
			pstmt.setInt(1, 1);
			pstmt.setString(2, "영어회화");
			pstmt.setString(3, "권해동");
			pstmt.setInt(4, 200);
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
			pstmt.setInt(1, 2);
			pstmt.setString(2, "국어의 이해");
			pstmt.setString(3, "신용현");
			pstmt.setInt(4, 120);
			result = pstmt.executeUpdate();
			
			pstmt.setInt(1, 3);
			pstmt.setString(2, "한국 근대사");
			pstmt.setString(3, "전성욱");
			pstmt.setInt(4, 80);
			result = pstmt.executeUpdate();
			
			pstmt.setInt(1, 4);
			pstmt.setString(2, "대화의 기법");
			pstmt.setString(3, "김희천");
			pstmt.setInt(4, 60);
			result = pstmt.executeUpdate();
			
			pstmt.setInt(1, 5);
			pstmt.setString(2, "컴퓨터 개론");
			pstmt.setString(3, "권순락");
			pstmt.setInt(4, 40);
			result = pstmt.executeUpdate();
			
			// 커넥션 닫히기 전에 state
			pstmt.close();
			con.close();
			
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	};
		
	}

}
