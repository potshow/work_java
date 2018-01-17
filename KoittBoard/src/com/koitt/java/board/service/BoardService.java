package com.koitt.java.board.service;

import com.koitt.java.board.Board;
import com.koitt.java.board.dao.BoardDao;

public class BoardService {

	private BoardDao dao;{
		dao = new BoardDao();
	}
	
	public void add (Board board) {
		this.dao.insert(board);
	}
	
}
