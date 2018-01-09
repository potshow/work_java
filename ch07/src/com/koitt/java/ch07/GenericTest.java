package com.koitt.java.ch07;

public class GenericTest<T> {
	
	//T 는 type E는 Element 를 뜨탐.
	
	public boolean myEqual(T a, T b) {
		return a.equals(b);
	}
	
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		
		Integer c = 1;
		Integer d = 1;
		
		
		// String 타입을 이용하는 myEqual 메소드를 호출할 수 있게 됨.
		GenericTest<Object> test = new GenericTest<Object>(); // 둘이 스트링타입이 같은지 비교하고 싶어서 String을 넣음.
		boolean isEqual = test.myEqual(a, b);
		System.out.println(isEqual);
	
		boolean isEqual2 = test.myEqual(c, d);
		System.out.println(isEqual2);
	}
	
}
