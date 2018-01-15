package com.koitt.java.javabean;

import java.io.Serializable;

public class JavaBean extends Object implements Serializable{
	
	int studentId;	//학번
	String name;	//이름
	
	public JavaBean() {}
	
	public JavaBean(int studentId, String name) {
		this.name = name;
		this.studentId = studentId;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
			}
		
		if(!(obj instanceof JavaBean)) {
			return false;
		}
		
		JavaBean s = (JavaBean) obj;
		if(this.studentId != s.studentId){
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.studentId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("학생번호:");
		sb.append(this.studentId);
		sb.append(", 학생이름:");
		sb.append(name);
		String ssb = sb.toString();
		return ssb;
	}


}
