package com.koitt.java.ch07;

public class WrapperCharacter {

	public static void main(String[] args) {
		
		Character ch = '@';			//Boxing
		Character ch2 = '@';
		
		
		System.out.print(ch + " ");	//Unboxing 컴파일러가 자동으로 해주는걸 언박싱이라고 합니다.
		System.out.print(ch.charValue() + " ");	// 얘는 그냥 메소드래.
		System.out.println(ch.toString());
		System.out.print(ch.compareTo('@') + " "); // 결과값 : 0 -> 서로 다른점이 0가지다. = 다른게 하나도 없다.
		System.out.println(ch.hashCode());
		System.out.println(ch2.hashCode());
		System.out.println();
		
		System.out.print(Character.toUpperCase('d') + " ");
		System.out.println(Character.toLowerCase('F'));
		System.out.print(Character.getName('@') + ", ");
		System.out.print(Character.getName('|') + ", ");
		System.out.println(Character.getName('^') + " ");
		System.out.print(Character.isDigit('$') + " ");
		System.out.println(Character.isDigit('5'));
		
	}
	
}
