package Ex10;

public class Car {

	int maxSpeed;	//최대속도
	int speed;		//현재속도

	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int speedUp() {
		this.speed += 5;
		System.out.printf("최대속도: %d, 현재속도: %d\n", maxSpeed, this.speed);
		
		return this.speed;
	}
	
	public int speedUp(int speed) {
		if (speed<0) {
			System.out.println("속도가 음수이므로 0으로 지정: 최대속도: " + maxSpeed + " 현재속도: " + this.speed);
			
		} else if(this.speed + speed > this.maxSpeed){
			this.speed = this.maxSpeed;
			System.out.println("최대속도보다 높아 최대속도로 지정, 최대속도: " + maxSpeed + " 현재속도: " + this.speed);
			
		} else {
			this.speed += speed;
			System.out.printf("최대속도: %d, 현재속도: %d\n", maxSpeed, this.speed);
			
		}
		return this.speed;
	}
	
	public int speedDown() {
		this.speed -= 5;
		System.out.printf("최대속도: %d, 현재속도: %d\n", maxSpeed, this.speed);
		return this.speed;
	}
	
	public int speedDown(int speed) {
		if (speed<0) {
			System.out.println("속도가 음수이므로 0으로 지정: 최대속도: " + maxSpeed + " 현재속도: " + this.speed);
			
		} else if(this.speed - speed < 0){
			System.out.println("속도가 0보다 작아져 0으로 지정, 최대속도: " + maxSpeed + " 현재속도: " + this.speed);
			
		} else {
			this.speed -= speed;
			System.out.printf("최대속도: %d, 현재속도: %d\n", maxSpeed, this.speed);
		}
		return this.speed;
	}
	
	
	
}
