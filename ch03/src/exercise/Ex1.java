package exercise;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�� �Ǽ��� �Է��ϼ���. >>");
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		
		System.out.println(A+B);
		System.out.println((A+B)/2);
	
		
		input.close();
	}
	
}
