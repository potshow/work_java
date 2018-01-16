package com.koitt.java.board;

import java.util.Date;

public class Board {

	private Integer id;			// 게시물 번호
	private String title;	// 제목
	private String content;	// 내용
	private String writer;	// 작성자
	private Date regDate;	// 작성일

	// 기본생성자
	public Board() {
	}

	// 필드 전체를 초기화하는 생성자
	public Board(Integer id, String title, String content, String writer, Date regDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}


	// getter setter
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	// id로 비교하는 equals 구현
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Board)) {
			return false;
		}

		Board b = (Board) obj;
		if (this.id != id) {
			return false;
		}
		return true;
	}

	// 해쉬코드 : 글제목+id
	public int hashCode() {
		return this.title.hashCode() + this.id
		+ this.content.hashCode() + this.writer.hashCode()
		+ this.regDate.hashCode();
	}

	// toString
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("글번호 : ");
		sb.append(this.id);
		sb.append("  제목 : ");
		sb.append(this.title);
		sb.append("  글 내용 < ");
		sb.append(this.content);
		sb.append(" >  작성자 [");
		sb.append(this.writer);
		sb.append("] 작성일 : ");
		sb.append(this.regDate);
		return sb.toString();
	}

	




}
