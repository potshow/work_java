package exercise;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է��ϼ���.");
		int A = input.nextInt();
	
		
		int man = A/10000;
		int thousand = (A%10000)/1000;
		int hundread = (A%1000)/100;
		int ten = (A%100)/10;
		int one = A%10;
		
		System.out.printf("%d�� %dõ %d�� %d�� %d�Դϴ�.", man, thousand, hundread, ten, one);
		
		
		input.close();
		
	}
	
}
