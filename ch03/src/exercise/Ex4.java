package exercise;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		
		System.out.println("���� �ϳ��� �Է��ϼ���. ����(C) ȭ��(F) >> ");
		String whichone = input.next();
		
		System.out.println("�µ��Է�");
		double degree = input.nextDouble();
		//input.next().charAt(0); << �Էµ� string ������
		//ù���ڸ� ������ ��¾����~~~~~`
		
		switch(whichone) {
		
		case "F" :
		case "f" :
			degree = (5.0/9.0)*(degree-32);
			System.out.printf("%.1f �����Դϴ�.", degree);
			break;
			
		case "C" :					
		case "c" :
			degree = (9.0/5.0)*degree + 32;
			System.out.printf("%.1f ȭ���Դϴ�.", degree);
			break;
			
		}
		
		input.close();
		
	}
	
}
