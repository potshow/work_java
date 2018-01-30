package com.koitt.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.koitt.java.board.model.Board;

public class DBManager {
	public static final String URL = "jdbc:mysql://localhost:3306";
	public static final String DB_NAME  = "koitt";
	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String ID = "root";
	public static final String PASSWORD = "koitt";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 싱글턴 패턴 (Singleton Pattern)
	// : 프로그램(Board) 내부에서 객체 하나만 생성하도록 하는 패턴.

	// 여기서의 instance가 만들어질 단 하나의 객체를 담는 변수.
	private static DBManager instance;

	// private : 클래스 내부에서만 객체를 생성하도록 하기위해 씀	
	private DBManager(){
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 실패");
		}
	}

	// 
	public static DBManager getInstance() {
		if (instance == null) { // instance가 null인 경우 한번도 객체를 생성하지 않았다는 뜻.
			instance = new DBManager(); // 객체를 생성
		}
		return instance;	// 방금 생성한 객체를 리턴하거나 기존에 생성했었던 객체를 리턴.
	}

	////////////////////////////////// -> 여까지를 싱글턴패턴이라고 부름.

	public List<Board> selectAll() throws SQLException {

		conn = DriverManager.getConnection(URL + "/" + DB_NAME , ID, PASSWORD);
		String sql = "SELECT * FROM board";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();

		List<Board> list = new ArrayList<Board>();

		// while문을 돌면서 객체를 하나씩 만들 것이다.
		// resultset을 이용할 것이다.

		while(rs.next()) {
			Board item = new Board(
					rs.getInt("no"),
					rs.getString("title"),
					rs.getString("content"),
					rs.getString("writer"),
					rs.getDate("regdate"),
					rs.getDate("modidate"));
			list.add(item);
		}
		this.close();

		return list;
	}

	public void insert(Board board) throws SQLException {

		// 1. 데이터베이스와 연결
		conn = DriverManager.getConnection(URL + "/" + DB_NAME , ID, PASSWORD);

		// 2. SQL문 작성
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO board (title, content, writer, regdate, modidate)");
		sql.append("VALUES (?, ?, ?, CURDATE(), NULL)");

		// CURDATE() : MySql에서 제공하는 함수.
		// 3. SQL문 실행을 위한 객체 생성
		pstmt = conn.prepareStatement(sql.toString());

		// 4. SQL문의 물음표 채우기
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		pstmt.setString(3, board.getWriter());

		// 5. SQL문 실행
		pstmt.executeUpdate();

		// 6. 객체 연결 해제하는 메소드 호출
		this.close();

	}

	public void delete(Board board) throws SQLException {
		conn = DriverManager.getConnection(URL + "/" + DB_NAME , ID, PASSWORD);

		String sql = "DELETE FROM board where no = ?";

		pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, board.getId());

		pstmt.executeUpdate();

		this.close();
	}

	public void update(Board board) throws SQLException {
		conn = DriverManager.getConnection(URL + "/" + DB_NAME , ID, PASSWORD);

		StringBuilder sql = new StringBuilder();
				sql.append("UPDATE board ");
				sql.append("SET title = ?, content = ?, modidate = CURDATE() ");
				sql.append("WHERE no = ?");

		pstmt = conn.prepareStatement(sql.toString());

		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		pstmt.setInt(3, board.getId());

		pstmt.executeUpdate();

		this.close();
	}

	// 객체연결해제
	private void close() throws SQLException {
		if (rs != null) { rs.close(); }
		if (pstmt != null) { pstmt.close(); }
		if (conn != null) { conn.close(); }
	}
}
