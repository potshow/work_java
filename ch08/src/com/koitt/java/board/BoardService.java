package com.koitt.java.board;

import java.util.List;

public class BoardService {
	
	private BoardDao dao;
	private int count;
	
	public BoardService() {
		this.dao = new BoardDao();
	}
	
	public void add(Board b) {
		b.setId(count++);
		dao.insert(b);
	}

	public List<Board> read(){
		return dao.selectAll();
	}
	
	public void remove(Board b) {
		dao.delete(b);
	}

}
