package com.koitt.java.board;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardController {

	private BoardService service;
	private Scanner input;

	public BoardController() {
		this.service = new BoardService();
		this.input = new Scanner(System.in);
	}

	public static void main(String[] args) {

		BoardController controller = new BoardController();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("<--- 안녕하세요. 오늘도 좋은 하루 보내세요. --->");
			System.out.println("1. 게시글 작성");
			System.out.println("2. 게시글 목록");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴번호 입력 > ");
			int menu = -5;
			menu = Integer.parseInt(input.nextLine());

			

			switch (menu) {
			case 1 :
				controller.menuAdd();
				break;
			case 2 : 
				controller.menuRead();
				break;
			case 3 : 
				controller.menuRemove();
				break;

				default:
					System.out.println("메뉴 번호를 잘못 입력하셨습니다.");
			}
		}

	}

	public void menuAdd() {

		System.out.println("=== 게시글 작성 ===");

		System.out.print("제목 : ");
		String title = this.input.nextLine();
		
		System.out.print("작성자 : ");
		String writer = this.input.nextLine();

		System.out.print("내용 : ");
		String content = this.input.nextLine();
		
		Board b = new Board(0, title, content, writer, new Date());
		this.service.add(b);
	}
	
	public void menuRead() {
		System.out.println("<--- 게시글 목록 --->");
		
		List<Board> list = this.service.read();
		for (Board item : list)
		System.out.println(item);


	}
	
	public void menuRemove() {
		System.out.println("=== 삭제할 게시글 번호를 입력해주세요 ===");
		System.out.println("글 번호 : ");
		Integer id = this.input.nextInt();
		
		Board b = new Board(id, null, null, null, null);
		service.remove(b);
		System.out.println(b.getId() + "번 게시글이 삭제되었습니다.");
	}
	
	
}
