package Excercise;

import java.util.Scanner;

public class Ex01 {


	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int z = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("숫자 두 개를 입력해주세요. >>");

		try {
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
		} catch (java.util.InputMismatchException e) {
			System.out.println("정수만 입력해주세요.");
		}





	}
}