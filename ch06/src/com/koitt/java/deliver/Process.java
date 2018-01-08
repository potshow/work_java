package com.koitt.java.deliver;

/*
 *  디자인 패턴 - 템플릿 메소드 패턴( Template Method Pattern ) 
 *  여기서 말하는 디자인은 코드의 디자인을 말합니다. 옷 디자인이 아님.
 */
public abstract class Process {

	// 1. 주문받기
	public abstract void ordering();
	
	// 2. 요리하기
	public abstract void cooking();
	
	// 3. 배달하기
	public abstract void delivering();
	
	// 4. 결제하기
	public abstract void payment();
	
	// 순서대로 호출하는 메소드 구현
	public void processing() {
		this.ordering();
		this.cooking();
		this.delivering();
		this.payment();
	}
	
	public static void main(String[] args) {
		Process chicken = new Chicken();
		Process chinese = new Chinese();
		Process Pizza = new Pizza();
		
		Process[] stores = new Process[3];
		stores[0] = chicken;
		stores[1] = Pizza;
		stores[2] = chinese;
		
		for (int i = 0; i < stores.length; i++) {
			stores[i].processing();
		}

	}
	
}
