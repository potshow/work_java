package com.koitt.java.board;

import java.util.ArrayList;
import java.util.List;

import Exception.MyException;

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
	public void delete(Board b) throws BoardException{
		for (int i = 0; i < this.list.size(); i++) {
			if(this.list.get(i).equals(b)) {
				this.list.remove(i);
				return;
			}
		}
		throw new BoardException("E01: 삭제할 데이터가 없습니다.");
	}

	//게시글 수정
	public void update(Board b) throws BoardException {
		for (Board item : this.list) {
			if (item.equals(b)) {
				item.setTitle(b.getTitle());
				item.setContent(b.getContent());
				item.setWriter(b.getWriter());
				return;
			}
		}
		throw new BoardException("E02: 수정할 데이터가 없습니다.");
	}
}

