package exercise;

import java.util.Scanner;

public class ToDigit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		int A = input.nextInt();
		
		System.out.printf("8���� : %o ", A);
		System.out.printf("10���� : %d ", A);
		System.out.printf("16���� : %x", A);
		
		input.close();
		
		
	}
	
}
