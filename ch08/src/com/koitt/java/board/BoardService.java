package com.koitt.java.board;

import java.util.List;

public class BoardService {
	
	// 서비스는 데이터를 가공하는 역할을 맡음!!!!!
	
	private BoardDao dao;
	private int count = 0;
	
	public BoardService() {
		this.dao = new BoardDao();
	}
	
	public void add(Board b) {
		b.setId(++count);
		dao.insert(b);
	}

	public List<Board> read(){
		return dao.selectAll();
	}
	
	public void remove(Board b) throws BoardException {
		dao.delete(b);
	}
	
	public void modify(Board b) throws BoardException {
		dao.update(b);
	}
	
	public boolean isExist(Board board) {
		return dao.isExist(board);
	}

}
