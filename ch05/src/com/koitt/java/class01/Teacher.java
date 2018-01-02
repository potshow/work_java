package com.koitt.java.class01;

public class Teacher extends Person {
	
	/*
	*	animal과 person의 필드값을 상속받기 때문에
	*	중복으로 작성하지 않아도 된다.
	*/

	private String subject; //담당과목
	private int year; 		//강의경력
	private String group;	//소속
	
	// 기본 생성자 (Default Constructor)
	/*
	 * 만약 구현된 생성자가 없다면
	 * 컴파일러가 기본 생성자를 자동으로 생성한다.
	 */
	public Teacher() {
		
	}
	
	// 다형성(Polymorphism)의 예 ↓↓ 
	// 메소드 오버로딩(Method Overloading) (2장에 예시있음)
	// -상속관계와 상관없이 쓸수있다.
	// 같은 이름(Teacher)으로 호출을 했는데 다양한 효과를 낼 수 있는걸 다형성이라고함
	// 생성자 (Constructor) : 필드 subject만 초기화하는 생성자
	
	public Teacher(String subject) {
		this.subject = subject;
	}
	
	// 생성자 (Constructor) : 필드 subject, year만 초기화하는 생성자
	public Teacher(String subject, int year) {
		this.subject = subject;
		this.year = year;
	}
	
	// 생성자 (Constructor) : 필드 전체를 초기화하는 생성자
	public Teacher(String subject, int year, String group) {
		this.subject = subject;
		this.year = year;
		this.group = group;
	}
	
	// ↑↑
	
	public String getSub() {
		return this.subject;
	}
	public void setSub(String subject) {
		this.subject = subject; 
	}
	
	
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String getGrp() {
		return this.group;
	}
	public void setGrp(String group) {
		this.group = group;
	}
	/*
	 * 다형성
	 * 메소드 오버라이딩(Method Overriding)
	 * (=메소드 재정의)
	 * -무조건 상속관계가 성립이 되어야함.
	 */
	
	/*@Override*/ //오버라이딩을 했다는 표시를 위한 애노테이션(Annotation)
			  	//@Override를 붙여봄으로써 상속관계가 성립되어있는지 확인가능.
			  	//오류나면 상속 안받은거고 오류안나면 상속받은거공ㅎㅎ
				//
	public void printTeacher() {
		System.out.println("주민등록번호: " + this.getSsn() + 
				" 주소: " + this.getAdd() + 
				" 과목: " + this.subject + 
				" 강의년수: " + this.year);
	}
	
	
}
