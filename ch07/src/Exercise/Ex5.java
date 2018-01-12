package Exercise;

import java.util.Calendar;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		// 달에서 요일의 횟수 반환
		int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);

		// 몇번째 주인지 반환
		int WeekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);

		// 해의 날짜를 반환
		int DayOfYear = cal.get(Calendar.DAY_OF_YEAR);

		// 해의 주 횟수를 반환
		int WeekOfYear = cal.get(Calendar.WEEK_OF_YEAR);

		// 주의 요일 반환
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(cal.getTime());

		System.out.print("오늘은 ");
		System.out.print(cal.get(Calendar.YEAR) + "년 ");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(cal.get(Calendar.DATE) + "일 ");
		System.out.print(Ex5.getDayOfWeek(dayOfWeek));
		System.out.print(" 입니다.");
		
		System.out.print("이 달의 ");
		System.out.println(dayOfWeekInMonth + "번째 " + Ex5.getDayOfWeek(dayOfWeek) + "입니다.");
	
		System.out.print("이 달의 ");
		System.out.println(WeekOfMonth + "번째 주입니다.");
		
		System.out.print("이 해의 ");
		System.out.println(DayOfYear + "일 입니다.");
		
		System.out.print("이 해의");
		System.out.println(WeekOfYear + "번째 주입니다.");
	}

	// 숫자 형태의 요일값을 받아서 문자열로 요일을 리턴하는 메소드
	public static String getDayOfWeek(int dayOfWeek) {

		switch (dayOfWeek) {
		case Calendar.SUNDAY: 
			return "일요일";
		case Calendar.MONDAY: 
			return "월요일";
		case Calendar.TUESDAY: 
			return "화요일";
		case Calendar.WEDNESDAY: 
			return "수요일";
		case Calendar.THURSDAY: 
			return "목요일";
		case Calendar.FRIDAY: 
			return "금요일";
		case Calendar.SATURDAY: 
			return "토요일";
		}
		return null;
	}


}
