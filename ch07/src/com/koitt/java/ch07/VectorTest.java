package com.koitt.java.ch07;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		// 제네릭 (Generic) : <> 꺽쇠.
		Vector<Object> data = new Vector<Object>(3);
		//Vector data = new Vector(3);
		
		data.addElement(2012);
		data.add("년도");
		data.addElement(4.35);
		data.add(2, "목표학점");
		data.insertElementAt("자바강좌", 0); // 0번째에 "자바강좌" 삽입
		System.out.println("size = " + data.size());
		System.out.println("capacity = " + data.capacity());
		System.out.println(data.toString());
	}
	
}
