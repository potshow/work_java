package exercise;

import java.util.Scanner;

public class PersonInfo {

	public static void main(String[] args) {
		
		//input�� �����̸���. ���� Ű���� �Է¹��� �غ� ��!
		Scanner input = new Scanner(System.in);
		
		System.out.print("�����Կ� Ű�� �Է��ϼ��� : ");
		
		int weight = input.nextInt();
		double height = input.nextDouble();
		
		System.out.print("������ : " + weight + "kg "+ " Ű : " + height + "cm");
		
		input.close();
		
		
	}
	
}
