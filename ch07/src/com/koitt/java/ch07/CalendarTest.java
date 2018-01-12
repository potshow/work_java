package com.koitt.java.ch07;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // 객체 직접적 생성이 허용이 안댐
		System.out.println(now.getTime());
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; //월 시작이 0부터 시작하기 때문에 +1 해줌.
		int date = now.get(Calendar.DATE);

		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE); 
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + date + "일");
		System.out.println(hour + ":" + minute + ":" + second);
	}
}
