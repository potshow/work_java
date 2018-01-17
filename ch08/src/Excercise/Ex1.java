package Excercise;

import java.util.Scanner;

public class Ex1 {
	
	
	public int Gob (int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x;
		int y;

		System.out.println("정수 2개를 입력하세요. >>");
		x = input.nextInt();
		y = input.nextInt();
		
		Ex1 a = new Ex1();
		
		System.out.println(a.Gob(x, y));
	}



}
