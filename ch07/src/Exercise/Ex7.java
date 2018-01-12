package Exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex7 {
	public static void main(String[] args) {

		System.out.println("표준입력으로 문자열을 여러 줄에 입력하세요.");
		System.out.println("결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요.");
		
		Scanner input = new Scanner(System.in);
		Set<String> set01 = new HashSet<String>(); // 중복되지 않은 문자열을 저장
		Set<String> set02 = new HashSet<String>();	// 중복된 문자열을 저장
		
		while(true) {
		String text = input.next();
			if(text.equals("quit")) {		// String 값은 비교할때 연산자 말고 equals 메서드 써야댐
				break;
			}
			
			boolean isDup = !set01.add(text);	// isDup은 set01이 아닌 text 
			if(isDup) {							
				set02.add(text);
			}
		}
		// 차집합 : 모든 문자열 - 중복된 문자열
		set01.removeAll(set02);	//set01 - set02 
		
		System.out.println("중복되지 않은 문자열 => " + set01);
		System.out.println("중복된 문자열 => " + set02);
	}
	
}
