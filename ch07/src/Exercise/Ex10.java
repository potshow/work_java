package Exercise;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		MyData<String, String, String> myData = new MyData<>();
		myData.put("김이용", "KT", "010-3196-3985");
		myData.put("홍길동", "SK", "010-8000-7800");
		
		System.out.println("검색할 이름을 적으세요 >>");
		
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		myData.search(name);
		input.close();
		
	}
	
}
