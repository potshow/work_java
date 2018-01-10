package com.koitt.java.ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		
		setA.add(3); 
		setA.add(5); 
		setA.add(7);
		setA.add(8); 
		setA.add(7);	// 중복된 '7'값은 안들어감.
		setA.add(9);
		System.out.print("A = ");
		// println에서 자동으로 Argument로 전달받은 객체의 toString 메소드를 호출한다.
		print(setA);
		System.out.println(" A = " + setA.toString());
		
		// List는 넣은 순서대로 들어가지만
		// Set은 넣은 순서와 상관없이 오름차로 정렬됨.
		
		setB.add(5); 
		setB.add(3); 
		setB.add(2);
		
		System.out.print("B = ");
		print(setB);
		System.out.println(" B = " + setB);
		
		boolean isChanged = setA.removeAll(setB); // setA에서 setB를 뺀다.
		System.out.print("A - B = ");
		if (isChanged) System.out.println(setA); // 바뀐게 있어서 true, 아님 false
		
		
		System.out.print("for-each문으로 출력: ");
		for (Integer i : setA) {
			System.out.print(i + " ");
		}
		
	}
	
	//for-each문
	
	public static void print(Set<Integer> s) {
		Iterator<Integer> i  = s.iterator();	//객체를 끄집어내서 set에 있는 값을 순차적으로 꺼내옴.
		while (i.hasNext())
			System.out.print(i.next() + " ");
	}	
}
