package com.koitt.sql;

public class ExStaticBlock {

	static int staticNum = 20;
	int num = 10;
	
	// static block
	// static block은 객체를 만들고 난 뒤에야 필드값을 불러올 수 있음.
	static {
		System.out.println("static block 실행: " + ExStaticBlock.staticNum);
	}
	
	/* instance block
	 * - 생성자보다 먼저 싱행이 됨.
	 * - 여러 생성자의 공통적인 코드를 instance block에 구현하면 편리함. 
	 */
	
	{
		System.out.print("instance block 실행: ");
		System.out.print(ExStaticBlock.staticNum + " / ");
		System.out.println(this.num);
	}
	
	// 기본 생성자
	public ExStaticBlock() {
		System.out.println("기본생성자 실행: " + this.num);
	}
	
	public ExStaticBlock(String test) {
		System.out.println("ExStaticBlock(String test) 실행");
	}
	
	public static void main(String[] args) {
		try {
			// static 클래스 불러내면 자동으로 sysout이 실행되는 것을 볼 수 있음
			Class.forName("com.koitt.sql.ExStaticBlock");
			
			ExStaticBlock block  = new ExStaticBlock();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
