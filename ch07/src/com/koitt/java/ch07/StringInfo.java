package com.koitt.java.ch07;

public class StringInfo {
	public static void main(String[] args) {

		String snum = "20123458";
		
		//생성자 오버로딩
		String name = new String("김경석");		//기본 String
		String dept = new String(new char[] {'컴', '퓨', '터', '학', '과'});	//String(char 배열) 넣고 dept 프린트하면 배열글자 주루룩나옴
		String java = new String("java");
		
		System.out.printf("%d ", snum.compareTo("20123458"));	// snum과 20123458의 다른점을 비교함. 
		System.out.printf("%d %n", snum.compareTo("20123456"));	// 문자 8의 char값과 문자 6의 char값이 2만큼 차이남.
		System.out.printf("%s ", name);
		System.out.printf("%s ", name.replace('김', '강'));		// char 김 -> char 강 으로 바꿈. 그래서 강경석으로 나옴
																// char 강으로 아예 바꾸고 싶으면 name = name.replace('김', '강')으로 하면됨.
		System.out.printf("%s %n", name);
		System.out.printf("%s ", dept);
		System.out.printf("%s ", dept.substring(0, 3));			// 글자 0부터 3까지 출력.
		System.out.printf("%d %n", dept.length());				// 글자의 길이를 말해줌
		System.out.printf("%s ", java.indexOf('a'));			// 'a'의 위치를 찾아줌. 첫번째 뜨는 'a'만 찾아줌.
		System.out.printf("%s ", java.concat(" language"));		// 뒤에 language 라는 말만 붙임. 저장되는건 아니고 일시적으로 붙이는것.
		System.out.printf("%s ", java.replace('j', 'J'));		// 'j' 를 'J'로 바꿔줌.
		System.out.printf("%s ", java.toUpperCase());			// 전체를 대문자로 바꾼다.
		System.out.printf("%b ", java.equals("JAVA"));			// 대소문자 구분하고 java와 JAVA를 비교
		System.out.printf("%s ", java.equalsIgnoreCase("JAVA"));// 대소문자 구분하지 않고 java와 JAVA를 비교
		System.out.printf("%s %n", java.substring(1));			// 시작점 1부터 출력
		
	}
}
