package com.koitt.java.class03;

public class Cat {

	private String name; //고양이이름
	private int age; //나이
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
