package exercise;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("임의의 달을 입력해주세요.");
		int month = input.nextInt();
		String month01 = (month < 7) ? "상반기입니다." : "하반기입니다.";
		
		System.out.printf("%d월은 %s", month, month01);
		
		if (month > 12) {
		System.out.println("적절한 개월 수가 아닙니다.");
		}
	}
	
}
