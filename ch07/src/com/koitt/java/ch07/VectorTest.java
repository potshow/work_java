package com.koitt.java.ch07;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		// 제네릭 (Generic) : <> 꺽쇠.
		
		/*
		 * 새로운 객체 생성. 
		 * <Object> <- 클래스 
		 * (3) <- 배열크기
		 */
		List<Object> data = new Vector<Object>(3);
		//Vector data = new Vector(3);
		
		((Vector<Object>)data).addElement(2012); // addElement랑 add는 기능의 차이가 없음. 배열의 마지막에다가 내용을 추가.
		data.add("년도");
		((Vector<Object>)data).addElement(4.35);
		data.add(2, "목표학점");
		((Vector<Object>)data).insertElementAt("자바강좌", 0); // 0번째에 "자바강좌" 삽입
		System.out.println("size = " + data.size());
		System.out.println("capacity = " + ((Vector<Object>)data).capacity()); 
		/*
		 *  3칸이었는데 2개가 더들어와서 공간 부족해가지고 
		 *  3*2 해서 6칸으로 늘어나가지고 capacity가 6으로 뜨는것. add 메서드 만들던거 참조 --)/
		 */
		System.out.println(data.toString());
	}
	
}
