package com.koitt.java.ch07;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	
	public static void main(String[] args) {
		
		String str = "public static void main(String[] args) {"; // 우리가 분석할 문자열. 한 덩어리마다 1토큰. 얘는 6토큰
		StringTokenizer st1 = new StringTokenizer(str); //기본 분리자 " \t\n\r\f":공백\탭\엔터\현재행의처음으로이동\새페이지의 처음으로 이동
		printToken(st1);
		
		StringTokenizer st2 = new StringTokenizer(str, " ()");  // 공백과 소괄호를 분리자로 선언
		printToken(st2);
		
		StringTokenizer st3 = new StringTokenizer(str, " ()[]{");	// 공백과 소괄호, 중괄호, 대괄호를 분리자로 선언.
		printToken(st3);
		
		//토큰을 분리자에 포함 
		StringTokenizer st4 = new StringTokenizer(str, "()[]{", true);	// 분리자를 토큰으로 침.
		printToken(st4);
		
		StringTokenizer st5 = new StringTokenizer(str); //기본 분리자 " \t\n\r\f":
		printToken(st5, "()");
	}	
	
	public static void printToken(StringTokenizer st) {
		
		System.out.println("토큰 수: " + st.countTokens()); // 토큰의 수를 센다
		int cnt = 0;
		while (st.hasMoreTokens()) {	//토큰이 더 있는지 확인.
			System.out.print(++cnt + ". " + st.nextToken() + " ");
		}
		System.out.println();
		
		
	}
	public static void printToken(StringTokenizer st, String delim) {

		int cnt = 0;
		while (st.hasMoreTokens()) {
			System.out.print(++cnt + ". " + st.nextToken(delim) + " ");
		}
		System.out.println();
	}

}