package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorForEach {

	//Iterator를 이용해 For-Each문이 만들어진 원리를 설명
		public static void main(String[] args) {
	
			List<Integer> array = new ArrayList<Integer>();
			array.add(10);
			array.add(20);
			array.add(30);
			array.add(40);
		
		//For-each  ↓ array의 값을 item이라는 변수에 넣겠당
		for (int item : array) {
			System.out.println(item);
		}	
		
		//For-each 문의 원리: Iterator(이터레이터~)
		for (Iterator<Integer> i = array.iterator(); i.hasNext();) { //hasNext가 없으면 자동종료
			Integer item = i.next();								 // iterator가 자동으로 array의 첫번째부터 마지막까지 돌음					
			System.out.println(item);
		}
		
		
	}
}
