package exercise;

import java.util.Scanner;

public class ToDigit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		int A = input.nextInt();
		
		System.out.printf("8진수 : %o ", A);
		System.out.printf("10진수 : %d ", A);
		System.out.printf("16진수 : %x", A);
		
		input.close();
		
		
	}
	
}
