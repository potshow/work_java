package exercise;

import java.util.Scanner;

public class ToPound {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double kg = input.nextDouble();
		
		System.out.println(kg + "kg");
		
		double lb = kg * 2.2;
		
		System.out.println(lb + "lb");
		
		input.close();
		
	}

}
