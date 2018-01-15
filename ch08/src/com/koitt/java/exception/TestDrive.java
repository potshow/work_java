package com.koitt.java.exception;

public class TestDrive {

	public static void main(String[] args) {
		
		CallForName object = new CallForName();
		try {
			object.call();
			
		} catch (ClassNotFoundException e) {		//throw에서 일로 보냈더니 catch가 있어서.. 여기서 정상적으로 실행되었다.
			e.printStackTrace();
		}
		System.out.println("예외가 정상적으로 처리됐다면 출력되겠지");
	}
	
}
