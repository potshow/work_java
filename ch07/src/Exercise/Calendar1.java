package Exercise;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		
		System.out.print("연도 입력>> ");
		Integer year = input.nextInt();
		
		System.out.print("월 입력>> ");
		Integer month = input.nextInt();
		
		System.out.print("일 입력>> ");
		Integer day = input.nextInt();
		
		
		now.set(Calendar.YEAR, year);
		now.set(Calendar.MONTH, month+1);
		now.set(Calendar.DATE, day);
		
		Integer yoil = now.get(Calendar.DAY_OF_WEEK);
		
		switch(yoil) { 

		case 1 : System.out.print("일요일"); break;
		
		case 2 : System.out.print("월요일"); break;
		
		case 3 : System.out.print("화요일"); break;
		
		case 4 : System.out.print("수요일"); break;
		
		case 5 : System.out.print("목요일"); break;
		
		case 6 : System.out.print("금요일"); break;
		
		case 7 : System.out.print("토요일"); break;
		
		
		}

		
		/*System.out.println(yoil);*/
		
		/*System.out.printf("%d년 %d월 %d일은 %d요일입니다.", year, month, day, yoil);*/
		
		/*Calendar now = Calendar.getInstance();
		System.out.println(now.getTime());
		System.out.println();*/
	}
	
}
