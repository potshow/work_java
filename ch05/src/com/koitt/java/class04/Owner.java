package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {

	Car car;
	
	String name; 	//이름
	
	public Owner(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	
	public void introCar() {
		System.out.print(this.name + "의 자동차 브랜드 이름은 " + car.getBrandName() + "이고, 최고속도는 " + car.getMaxSpeed() + "km 입니다. \n");
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car("현대", 200);
		
		Owner yeEun = new Owner("강예은", c1);
		
		yeEun.introCar();
		
		Car c2 = new Car("폭스바겐", 250);
		
		Owner JK = new Owner("JK", c2);
		
		JK.introCar();
	}
	
}
