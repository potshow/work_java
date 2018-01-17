package com.koitt.java.board.controller;

import java.util.Scanner;

import com.koitt.java.board.service.BoardService;

public class BoardController {

	private BoardService service;
	private Scanner input;

	private BoardController() {
		this.service = new BoardService();
		this.input = new Scanner(System.in);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (true) {
		System.out.println("<----- 게쉬파나 ----->");
		System.out.println("<--- 안녕하세요. 오늘도 좋은 하루 보내세요. --->");
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 목록");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴번호 입력 > ");

		int menu = Integer.parseInt(input.nextLine());
		
		
		}
	}

}
