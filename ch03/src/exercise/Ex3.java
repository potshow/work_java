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
		System.out.printf("%.1fkg�� %.3f�Ŀ�� �Դϴ�.", kg, pound);
		
		input.close();
	}
	
}
