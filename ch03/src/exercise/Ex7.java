package exercise;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ ���� �Է����ּ���.");
		int month = input.nextInt();
		String month01 = (month < 7) ? "��ݱ��Դϴ�." : "�Ϲݱ��Դϴ�.";
		
		System.out.printf("%d���� %s", month, month01);
		
		if (month > 12) {
		System.out.println("������ ���� ���� �ƴմϴ�.");
		}
	}
	
}
