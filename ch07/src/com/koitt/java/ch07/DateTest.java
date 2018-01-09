package com.koitt.java.ch07;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class DateTest {
	
	public static void main(String[] args) {
		
		Date now = new Date();		
		System.out.println(now); // 객체가 만들어졌던 시간...실행할때마다 리셋
		System.out.println(now.getTime()); // 1970년 1월 1일 이후로 천분의 1초단위로 시간생성중
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA); 
						// Instance = 객체, Date타입의 Instance를 하나 생성해서 df에게 준다.
						// DateFormat.LONG / SHORT 두가지가잇음. 
		System.out.println(df.format(now));
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		System.out.println(df.format(now));
		System.out.println();
		
		//1970년 1월 1일 이후 지난 천분의 1초 시간으로 생성 
		Date when = new Date(100_000_000_000L);	 	 // 1970/1/1 이후로 1억초가 지난 후의 시간을 세팅한것이다. 
		System.out.println(when + " == " + (Date)when.clone()); // 1억초 후가 1973년 3월 3일 토요일이래 ㅎㅎ....
																//  when.clone 은 when의 내용을 그대로 복사하되 주소값만 다르게 만드는것.
		System.out.println(when.before(now));		// when 이 now 보다 예전인지?
		System.out.println(when.equals(now));		// when 이 now 와 같은가?
		System.out.println(when.compareTo(now)); 	// when 과 now 가 어떻게 차이나는가
	}
}
