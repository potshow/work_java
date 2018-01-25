package com.koitt.sql;

public class TestDrive {
	
	
	/*
	 * TestDrive 클래스는 main 메서드를 포함
	 * Java 가상머신(VM)이 main 부터 실행을 위해 
	 * TestDrive 클래스 정보를 메모리에 올려야 하기 때문에 static 블록이 실행. 
	 */
	static {
		System.out.println("TestDrive static block 실행 ...");
	}
	
	// 실행순서
	
	public static void main(String[] args) throws ClassNotFoundException{
		//Class.forName("com.koitt.sql.ExStaticBlock");
		new ExStaticBlock();
		new ExStaticBlock();
		new ExStaticBlock("테스트");
	}
}
