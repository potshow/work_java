package com.koitt.java.ch06;

/*
 *Java는 C언어와 다르게 상속을 하나의 클래스만 받을 수 있다. 
 */
public class Motor extends Vehicle {
	public String name = "자동차"; // 같은변수이름이면 해당클래스내에서 재정의 된걸로 덮어씌어진다.
	
	public void setMaxspeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}
	
	
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int displacement;
	
	public void printInfo() {
		System.out.print(super.name + ": " + this.name);
		System.out.println(", 최대속도: " + maxSpeed + " km");
		System.out.print("정원: " + seater + " 명");
		System.out.println(", 배기량: " + displacement + " cc");
	}
	
	public static void main(String[] args) {
		Motor myCar = new Motor();
		myCar.setMaxspeed(300);
		myCar.setSeater(2);
		myCar.setDisplacement(3500);
		myCar.printInfo();
	}

}
