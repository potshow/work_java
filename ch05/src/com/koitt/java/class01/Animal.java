package com.koitt.java.class01;

/*
 * Object 클래스
 * - 자바에서 모든 클래스가 기본으로 상속받는 클래스
 * - 이미 기본으로 구현되어 있는 클래스
 * - extends로 선언하지 않아도 기본으로 상속받는 클래스
 * 
 * 접근제한자
 * - private : 같은 클래스 내부에서만 사용가능
 * - public : 어느 곳이든 사용 가능
 * - (default) : 같은 패키지(폴더) 내부에서만 사용가능
 * - protected : default 범위 + 상복받은 클래스까지 사용가능
 */
public class Animal /*extends Object*/ {
	
	//private << Animal 클래스에서만 사용하게끔 만듬.
	
	//필드 (Field) = 속성
	private String name;
	private int age;
	private String gender;
	
	//메소드 (Method) 
	// (output)
	public String getName() {
		// return sanghoon.name
		return this.name;
	}
	
	// getter, setter (input)
	public void setName(String name) {
		this.name = name; // this. 는 자기자신을 말함.
						  // sanghoon.name = "정상훈"
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	
	}
	
	public String getGen() {
		return this.gender;
	}
	public void setGen(String gender) {
		this.gender = gender;
	}
	
}
