package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		
		list.add(0.87);
		list.add("algol");
		list.add("pascal");
		list.add(null);
		list.add(1);
		list.add("java");
		list.add(3.4);
		list.add(5.8);
		
		Iterator<Object> it = list.iterator();		// 출력 첫번째 줄
		print(it);
		
		for(Object e : list.toArray()) {	// 출력 두번째 줄
			System.out.print(e + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {	// list에서는 length 대신에 size 불러옴.
			 Object e = list.get(i);
			System.out.print(e + " ");
		}
	}

	public static void print(Iterator<Object> it) {
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	
}
