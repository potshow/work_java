package exercise;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요 >>");
		int money = input.nextInt();
		
		int fiveman = money / 50000;
		System.out.println(fiveman);
		
		money = money - fiveman * 50000;
		
		int man = money / 10000;
		System.out.println(man);
		
		money = money - man * 10000;
		
		int fiveChun = money / 5000;
		System.out.println(fiveChun);
		
		money = money - fiveChun * 5000;
		
		int chun = money / 1000;
		System.out.println(chun);
		
		money = money - chun * 1000;
		
		/*
		 int fiveman = money / 50000;
		 int man = money % 50000 / 10000;
		 int fiveChun = money % 10000 / 5000;
		 int chun = money % 5000 / 1000;
		 
		 System.out.printf("5만원권 %d개, 1만원권 %d개, 5천원권 %d개, 천원권 %d개%n", fiveman, man, fiveChun,chun);
		 */
		
	}
	
}
