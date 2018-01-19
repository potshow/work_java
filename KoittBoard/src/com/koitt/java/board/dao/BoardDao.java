package com.koitt.java.board.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.exception.BoardException;
import com.koitt.java.board.model.Board;

public class BoardDao {
	
	public static final String FILE_NAME = "BoardList.dat"; // 상수는 보통 대문자씀 ㅎㅎ

	// 데이터베이스 대신 게시글을 저장하는 용도로 사용
	private List<Board> list;
	private FileOutputStream fos = null;
	private ObjectOutputStream oos = null;
	private FileInputStream fis = null;
	private ObjectInputStream ois = null;

	public BoardDao() {
		/*this.list = new ArrayList<Board>();*/
		this.list = loadFromFile(BoardDao.FILE_NAME);
		// TODO 6. this.list = loadFromFile([파일명]); 이거 하고 나서는 list가 필요없어짐.
	}

	public void insert(Board board) throws BoardException {
		for (Board item : this.list) {
			if (item.equals(board)) {

				throw new BoardException("E01: 중복된 번호의 게시글입니다.");
			}
		}

		list.add(board);
		saveToFile(list, BoardDao.FILE_NAME);
		// TODO 3. saveToFile(list, [파일명]);
	}


	public List<Board> selectAll() {
		return this.list;
	}


	public void delete(Board board) throws BoardException {
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i).equals(board)) {
				this.list.remove(this.list.get(i));
				saveToFile(list, BoardDao.FILE_NAME);
				// TODO 4. saveToFile(list, [파일명]);
				return;
			}
		}


		throw new BoardException("E02: 삭제할 게시글이 존재하지 않습니다.");
	}


	public void update(Board board) throws BoardException {
		for (Board item : this.list) {
			if (item.equals(board)) {
				/*
				 * id: 검색 조건이기 때문에 변경 필요 없음
				 * writer: 기존 작성한 작성자와 동일하다고 가정해서 변경 필요 없음
				 * regDate: 글 생성일이기 때문에 일자를 변경 필요 없음
				 */
				item.setContent(board.getContent());
				item.setTitle(board.getTitle());
				item.setModiDate(board.getModiDate());
				saveToFile(list, BoardDao.FILE_NAME);
				// TODO 5. saveToFile(list, [파일명]);
				return;
			}
		}

		throw new BoardException("E03: 수정할 게시글이 존재하지 않습니다.");
	}

	// 1. 해당 글이 존재하는지 여부 확인 메소드
	public boolean isExist(Board board) {
		for (Board item : this.list) {
			if (item.equals(board)) {
				return true;	// 글이 존재할 경우 존재한다고 리턴
			}
		}

		return false;	// 다 찾아봤는데 없어서 false 리턴
	}

	/*
	 * TODO 1. private void saveToFile(List<Board> list, String filename) 
	 * list: BoardDao에 있는 list 필드
	 * filename: list 객체를 저장할 파일 이름
	 */

	// 카운트를 저장하는 메서드
	private void SaveCount(List<Board> list, String fileName) {
		this.list = list;
		
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
		} catch (FileNotFoundException e) {
			
		}
		
	}
	
	private void saveToFile(List<Board> list, String fileName) {
		this.list = list;
		try {

			// 객체를 저장하려면 oos를 이용해서 써야댐.
			// 입-출력 과정에서 oos 는 선택이 아니라 필수입니당.

			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(list);

			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	/*
	 * TODO 2. private List<Board> loadFromFile(String filename)
	 * filename: 게시글 리스트가 저장된 파일명
	 * List<Board> : 파일에서 불러온 list 객체를 리턴
	 */

	private List<Board> loadFromFile(String fileName){
		Object list;
		list = null;
		try {
			File file = new File(fileName);
			if (file.exists()) {
				fis = new FileInputStream(fileName);
				ois = new ObjectInputStream(fis);
				
				// 파일에 있던 리스트 객체를 끄집어내기
				list = ois.readObject();
				
				fis.close();
				ois.close();
				
				return (List<Board>) list;
				
			} else {
				System.out.println("처음 방문입니다.");
				return new ArrayList<Board>();
			}
		
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} 
		
		return null;

	}
}