package com.koitt.java.class01;

public class Student extends Person{

	/*
	 * Animal과 person의 필드값을 상속받기 때문에
	 * 중복으로 작성하지 않아도 된다.
	 * 단, Teacher는 상속받지 않았기 때문에
	 * Teacher의 필드는 사용할 수 없다.
	 */
	
	private int studentId;	//학생증 번호
	private String major; 	//전공
	private int grade;		//학년
	

	
	
	public int getId() {
		return this.studentId;
	}
	public void setId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getMaj() {
		return this.major;
	}
	public void setMaj(String major) {
		this.major = major;
	}
	
	public int getGrade() {
		return this.grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
