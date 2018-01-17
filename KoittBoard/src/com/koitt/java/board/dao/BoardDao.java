package com.koitt.java.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.Board;

public class BoardDao {
		
		// 데이터베이스 대신 게시글을 저장하는 용도로 사용
		private List<Board> list;
		
		public BoardDao() {
			this.list = new ArrayList<Board>();
		}
	
		public void insert(Board board) {
			list.add(board);
	}
		
		
	
}
