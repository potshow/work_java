/*package exercise;

public class Ex2 {

	public static void main(String[] args) {
		
		double A = 1.9;
		double B = 5.9;
		
		int C = (int)A + (int)B;
		
		System.out.println(C);
		System.out.println(C/2);
		
	}
	
}
*/

package exercise;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�� �Ǽ��� �Է��ϼ���. >>");
		
		//����� ����ȯ
		int A = (int)input.nextDouble();
		int B = (int)input.nextDouble();
		
		//����������ȯ
		/*
		 * A�� B�� ���� int ���̰�
		 * double sum ������ ������� �� �ڵ����� double ������ ����ȴ�.
		 * 
		 * sum�� int�� 2�� ������ ������ ����� double���̰�
		 * ���������� double avg ������ ���� �־��� ������ �ڵ����� double������ ����ȴ�.
		 */
		double sum = A + B;
		double avg = sum/2;
		
		System.out.printf("��: %.2f, ���: %.2f %n", sum, avg);
		
		input.close();
	}
	
}
