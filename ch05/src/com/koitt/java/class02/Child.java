package com.koitt.java.class02;

// Child 클래스는 Parent 클래스를 상속받는다.
public class Child extends Parent {

	//Child 클래스의 생성자
	public Child() {
		//super();	// 작성을 안하면 컴파일러가 자동을 추가한다.
					// 부모의 생성자중에 하나는 꼭 생성이 되어야한다. 그래야 자식이 생성자 구현 가능.
		System.out.println("Child() 기본생성자 호출 ...");
	}
	
	public Child(String msg) {
		System.out.println("Child(String) 생성자 호출 ... "+ msg);
	}
	
	public Child(int num) {
		this("ㅎㅇㅌ");
		System.out.println("Child(int num) 생성자 호출 .../ " + num);
	}
}
