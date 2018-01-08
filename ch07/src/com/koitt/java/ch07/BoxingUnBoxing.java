package com.koitt.java.ch07;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		
		//Double radius = New Double(2.59);	// JDK 1.5 이전
		Double radius = 2.59;				// boxing
		
		//double r = radius.doubleValue();	// JDK 1.5 이전
		double r = radius;					// unboxing >> 숫자가 아닌게 들어갔는데 오류가 안난 이유는 boxing 때문입니다.
		
		System.out.print("반지름: " + r + ", 원 면적 : ");
		System.out.println(radius * radius* Math.PI);
		
		Integer x = 5, y = 3;				// boxing
		System.out.printf("%d + %d = %d %n", x, y, x+y);	// unboxing
		Boolean b = true;					// boxing
		System.out.printf("%b %n", b);		// unboxing
	}
	
}
