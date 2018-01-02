package com.koitt.java.class01;

public class Person extends Animal {

	
	/*부모인 animal의 필드를 상속받기 때문에
	중복으로 작성하지 않아도 된다.*/
	
	
	 private String ssn; 	// 주민등록번호
	 private String address; // 주소
	
	public String getSsn() {
		return this.ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	public String getAdd() {
		return this.address;
	}
	public void setAdd(String address) {
		this.address = address;
	}
	
	// 메소드 - Person의 내용을 출력
	public void print() {
		System.out.println("주민등록 번호: " + this.ssn);
		System.out.println("주소: " + this.address);
	}
	
	
	
	
}
