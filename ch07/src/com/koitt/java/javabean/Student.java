package com.koitt.java.javabean;

import java.io.Serializable;

public class Student extends JavaBean implements Serializable{

	private int studentId;	//학번
	private String name;	//이름
	
	public Student() {}
	
	public Student(int studentId, String name) {
		this.name = name;
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		JavaBean s1 = new JavaBean(20132131, "명희");
	/*	s1.setName("명희");
		s1.setStudentId(20132131);*/
		JavaBean s2 = new JavaBean(20132131, "진수");
/*		s2.setName("진수");
		s2.setStudentId(20132131);*/
		JavaBean s3 = new JavaBean(19922145, "정학");
/*		s3.setName("정학");
		s3.setStudentId(19922145);*/
		
		if(s1.equals(s2)) {
			System.out.println("두 사람은 같은 사람입니다.");
		} else {
			System.out.println("두 사람은 다른 사람입니다.");
		}

		if(s2.equals(s3)) {
			System.out.println("두 사람은 같은 사람입니다.");
		} else {
			System.out.println("두 사람은 다른 사람입니다.");
		}

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);



	}

	
}
