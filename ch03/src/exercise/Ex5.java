package exercise;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요 >>");
		int year = input.nextInt();

		boolean cond1 = year%4 == 0;
		boolean cond2 = year%100 != 0;
		boolean cond3 = year%400 == 0;
		
		if (cond1 && cond2 || cond3) { System.out.println("윤년입니다.");	}
			
		else { System.out.println("평년입니다."); }
		
		input.close();
		
	}
	
}