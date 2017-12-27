package exercise;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		int max1 = (A > B) ? A : B;
		int max2 = (max1 > C) ? max1 : C;
		
		System.out.printf("가장 큰 수는 %d입니다.", max2);
		
	}
	
}
