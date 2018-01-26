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
		DBManager.getInstance().delete(board);
		throw new BoardException("E02: 삭제할 게시글이 존재하지 않습니다.");
	}


	public void update(Board board) throws BoardException {
		DBManager.getInstance().
		throw new BoardException("E03: 수정할 게시글이 존재하지 않습니다.");
	}

	
}