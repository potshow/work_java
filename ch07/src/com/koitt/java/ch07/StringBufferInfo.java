package com.koitt.java.ch07;

public class StringBufferInfo {

	public static void main(String[] args) {
		
		StringBuffer pg = new StringBuffer("Java"); //	용량 16
													// StringBuffer("Java")>> Java의 length값 4 + 16 length 만큼의 배열이 만들어짐.
		
		System.out.println(pg.capacity());			// 배열의 크기 출력.
		System.out.println(pg.append(" language"));	// pg 값 바로 뒤에 해당 문자 더해줌.
		System.out.println(pg.insert(5, "programming "));	//배열의 5번째 칸에  "String"값을 집어넣음.
															//값을 넣으려하는데 칸이 부족할때 칸을 2배로 늘림.
		System.out.println(pg.capacity());			// 출력하면 값이 늘어나있음. 위에서 칸 부족해서 늘려가지고
		System.out.println(pg);						// 현재 자바 프로그래밍 랭귀지로 바껴잇음
		System.out.println(pg.replace(0, 4, "Objective-C"));	// 0부터 4까지 사이에 "String"값을 넣음.
		System.out.println(pg.substring(0, 9));		// 0부터 9까지 값을 출력함.
		System.out.println(pg);
		System.out.println(pg.charAt(10));			// 10번째에 있는 캐릭터를 출력. 
		pg.setCharAt(10, 'D');						// 10번째에 있는 알파벳을 'D'로 바꿈.
		System.out.println(pg);
	}
	
}
