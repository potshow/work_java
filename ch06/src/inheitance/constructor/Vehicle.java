package inheitance.constructor;

public class Vehicle {
	// 부모클래스는 기본생성자를 영혼빼고 그냥~~~~만들어놓는게 원칙~
	// 부모가 기본생성자가 없으면 자식도 기본생성자를 못만든다.
	private String name = "차량";
	private double maxSpeed;
	private int seater;
	

	//기본 생성자
	public Vehicle() {
	}
	
	//생성자
	public Vehicle(double maxSpeed, int seater) {
		this.maxSpeed = maxSpeed;
		this.seater = seater;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSeater() {
		return seater;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}
}
