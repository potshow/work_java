package com.koitt.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Board> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_NAME);
		conn = DriverManager.getConnection(URL, ID, PASSWORD);
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
		return list;
	}
}
