package exercise;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ű�� �����Ը� ������� �Է��ϼ��� >>");
		double height = input.nextInt();
		double weight = input.nextInt();
		
		
		if (weight <= (height - 100)*0.9) {
		
			System.out.println("�����Դϴ�.");
			
		} else {
			
		System.out.println("���Դϴ�.");
		}
	
	}
}
