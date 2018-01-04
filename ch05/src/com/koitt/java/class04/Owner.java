package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {

	private Car[] car;
	private String name; 	//이름
	
	public Owner(String name, Car[] car) {
		this.name = name;
		this.car = car;
	}

	
	public void introCar() {
		for (int i = 0; i < car.length; i++) {
		System.out.print(this.name + "의 자동차 브랜드 이름은 " + car[i].getBrandName() + 
						"이고, 최고속도는 " + car[i].getMaxSpeed() + "km 입니다. \n");
		}
	}
	
	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

public static void main(String[] args) {
		
		Car c1 = new Car("현대", 200);
		Car c2 = new Car("폭스바겐", 250);
		Car c3 = new Car("아우디", 300);
		
		Owner yeEun = new Owner("강예은", c1);
		
		yeEun.introCar();
		
		Owner JK = new Owner("JK", car1);
	
		
		//차량 3대를 생성하세요.
		
		Car car1[] = new Car[3];
		
		car1[0] = new Car("혼다", 250);
		car1[1] = new Car("제네시스", 300);
		car1[2] = new Car("대우", 300);
		
		Car car2[] = new Car[3];
		
		car2[0] = new Car("기아", 180);
		car2[1] = new Car("쉐보레", 250);
		car2[2] = new Car("벤츠", 300);
		
		//홍길동의 차량을 변경하세요.
		
		//JK.setCar(c3);
		
		//변경한 차량을 소개하세요.
		
		JK.introCar();
		
		JK.setCar(car2);

		JK.introCar();
		
	}
	
}
