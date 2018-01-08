package com.koitt.java.deliver;

public class Chicken extends Process {

	@Override
	public void ordering() {
		System.out.println("치킨집에서 주문을 받는다.");
		
	}

	@Override
	public void cooking() {
		System.out.println("치킨집에서 주문받은 요리를 만든다.");
		
	}

	@Override
	public void delivering() {
		System.out.println("치킨집에서 배달한다.");
		
	}

	@Override
	public void payment() {
		System.out.println("치킨집 배달원이 결제를 받는다.");
		
	}

}
