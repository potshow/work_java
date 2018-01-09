package com.koitt.java.ch07;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 
		
		list.add("pascal");		// pascal
		list.addLast(1);		// pascal 1
		list.add("java");		// pascal 1 java
		list.addLast(3.4);		// 3.4 pascal 1 java
		list.addFirst("algol");	// algol 3.4 pascal 1 java
		list.addFirst(0.87);	// 0.87 algol 3.4 pascal 1 java
		list.add(3, null);		// 0.87 algol 3.4 null pascal 1 java   3번째칸에 null
		list.addLast(5.8);		// 0.87 algol 3.4 null pascal 1 java 5.8
	
		Iterator it = list.iterator(); // list 안에있는 내용들을 순차적으로 출력해줌. iterator을 뽑아 줌.
		print(it);
		print(list.descendingIterator());	// 거꾸로 출력해주는 메서드. 두번째줄을 얘가..프린트해준듯
		
		
		// 배열로 반환하여 모든 원소 출력 가능 (for-each문)
		// 제일 마지막에 출력된 값이 이하 for문.
		for (Object e : list.toArray()) { 
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static void print(Iterator it) {
		while ( it.hasNext()) {			// 다음값이 있는지 확인하는 메서드
			System.out.print(it.next() + " ");	// 다음값 출력
		}
		System.out.println();
	}
	
}
