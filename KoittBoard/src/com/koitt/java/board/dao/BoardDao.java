package com.koitt.java.board.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.exception.BoardException;
import com.koitt.java.board.model.Board;
import com.koitt.java.util.DBManager;

public class BoardDao {

	public BoardDao() {}


	public void insert(Board board) throws BoardException, SQLException {
		DBManager.getInstance().insert(board);
	}


	public List<Board> selectAll() throws SQLException {
		return DBManager.getInstance().selectAll();
	}


	public void delete(Board board) throws BoardException, SQLException {
		// 1. 글 존재하는지 여부 체크
		boolean exist = isExist(board);

		// 2. 존재한다면 삭제
		if (exist) {
			DBManager.getInstance().delete(board);
		} else {
		// 3. 존재하지 않는다면 예외발생
			throw new BoardException("E02: 삭제할 게시글이 존재하지 않습니다.");
		}
	}


	public void update(Board board) throws BoardException, SQLException {
		// 1. 글 존재하는지 여부 체크
		boolean exist = isExist(board);

		// 2. 존재한다면 수정
		if (exist) {
			DBManager.getInstance().update(board);
		} else {
		// 3. 존재하지 않는다면 예외 발생
		throw new BoardException("E03: 수정할 게시글이 존재하지 않습니다.");
		}
	}


	// 해당 글이 존재하는지 여부 확인 메서드
	public boolean isExist(Board board) throws SQLException {		
		List<Board> list = DBManager.getInstance().selectAll();
		for (Board item : list) {
			if (item.equals(board)) {
				return true;
			}
		}	
		return false;
	}

}