package com.koitt.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStmtTestDrive {

	public static void main(String[] args) {

		String driverName = "com.mysql.jdbc.Driver";
		String dbName = "myjavadb";
		String dbURL = "jdbc:mysql://localhost:3306/" + dbName;


		try {
			// 1. JDBC 드라이버 로딩

			Class.forName(driverName);
			Connection con = DriverManager.getConnection(dbURL, "root", "koitt");
			
			// 2. INSERT 문
			// 여기서 ? 를 선언한 후 밑에서 ?에 해당하는 정보를 삽입.
			// perpatedStatement를 쓰는게 보안에도 좋음
			String sql = "INSERT INTO student VALUES(?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "04");
			pstmt.setString(2, "고");
			pstmt.setInt(3, 20131122);
			pstmt.setString(4, "컴퓨터공학과");
			pstmt.executeUpdate();
			
			pstmt.setString(1, "05");
			pstmt.setString(2, "둘");
			pstmt.setInt(3, 20132277);
			pstmt.setString(4, "컴퓨터공학과");
			pstmt.executeUpdate();
			
			// 3. SELECT 문 사용
			// 미리 쿼리문을 준비해놓음. 쿼리문을 집어넣고 preparedStatement 객체를 만듬.
			// select 문 쓸때는 쿼리를 씀.
			// sql << 매번 새로 만들어줘야함.
			sql = "SELECT * FROM student";
			pstmt = con.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			
			// slelct문 쓰는 예제
			while (result.next()) {
				System.out.print(result.getString(1) + "\t");
				System.out.print(result.getString(2) + "\t");
				System.out.print(result.getInt(3) + "\t");
				System.out.println(result.getString(4));
			}
			

			result.close();
			pstmt.close();
			
			// 4. 종료
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}
}
