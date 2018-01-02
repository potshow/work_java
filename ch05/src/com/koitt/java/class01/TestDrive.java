package com.koitt.java.class01;

public class TestDrive {

	public static void main(String[] args) {
		
		// 강사 sanghoon 생성 - Teacher 클래스의 객체(Object)를 생성
		/*
		 *  Teacher()은 기본 생성자를 호출한 것이다.
		 */
		Teacher sanghoon = new Teacher();
		Teacher changmok = new Teacher("수학");
		Teacher gildong = new Teacher("국어", 3);
		Teacher younghee = new Teacher("영어", 10, "영희선생 어학원");	
		
		
		// 강사 sanghoon의 정보 입력
		sanghoon.setAdd("상도동");
		sanghoon.setAge(32);
		sanghoon.setGen("남");
		sanghoon.setGrp("한국아이티인재개발원");
		sanghoon.setName("정상훈");
		sanghoon.setSsn("861201");
		sanghoon.setSub("컴퓨터");
		sanghoon.setYear(1);
		
		//(default) 접근제한자로 변경 시 발생하는 문제
		//sanghoon.setSsn("801201");
		//System.out.println("주민등록번호 날조: " + sanghoon.ssn);
		
		sanghoon.printTeacher();
	}
	
}
