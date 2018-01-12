package Exercise;

import java.util.Calendar;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Scanner input = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요 >>");
		int year = input.nextInt();
		System.out.println("월을 입력하세요 >>");
		int month = input.nextInt();
		System.out.println("일을 입력하세요 >>");
		int day = input.nextInt();
		
		cal.set(year, month - 1, day);		// 월은 0부터 시작
		System.out.println(cal.getTime());
		
		// 요일을 숫자로 리턴: 1부터 일요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);	
		switch (dayOfWeek) {
		case Calendar.SUNDAY: 
			System.out.println("일요일 입니다.");
			break;
		case Calendar.MONDAY: 
			System.out.println("월요일 입니다.");
			break;
		case Calendar.TUESDAY: 
			System.out.println("화요일 입니다.");
			break;
		case Calendar.WEDNESDAY: 
			System.out.println("수요일 입니다.");
			break;
		case Calendar.THURSDAY: 
			System.out.println("목요일 입니다.");
			break;
		case Calendar.FRIDAY: 
			System.out.println("금요일 입니다.");
			break;
		case Calendar.SATURDAY: 
			System.out.println("토요일 입니다.");
			break;
			
		}
		
	}
	
}
