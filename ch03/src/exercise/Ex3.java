package exercise;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double kg = input.nextDouble();
		double pound = kg/0.453592;
		/*
		* double pound = kg * 1000000 / 453592;
		*/
		System.out.printf("%.1fkg은 %.3f파운드 입니다.", kg, pound);
		
		input.close();
	}
	
}
