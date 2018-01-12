package Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Map<String, String> phoneBook = new HashMap<String, String>();
		Scanner input = new Scanner(System.in);
		
		phoneBook.put("홍길동", "010-1234-5678");
		phoneBook.put("현빈", "010-3213-3333");
		phoneBook.put("강소라", "010-1414-1414");
		
		System.out.println("검색할 이름을 적으세요 >> ");
		
		String name = input.next();
		String phone = phoneBook.get(name);
		
		System.out.println("입력하신 " + name + "의 전화번호는 " + phone + " 입니다.");
	}
	
}
