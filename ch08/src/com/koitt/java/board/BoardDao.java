package com.koitt.java.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> list;			// 여기다 Data저장
	
	public BoardDao() {
		this.list = new ArrayList<Board>();
	}
	
	public void insert(Board b) {
		this.list.add(b);
	}
	
	// 게시글 목록 가져오기
	public List<Board> selectAll(){
		return this.list;
	}

	// 게시글 글번호로 삭제
	public void delete(Board b) {
		for (Board item : this.list) {
			if(item.equals(b)) {
				list.remove(b);
				return;
			}
		}
	}
	
}
