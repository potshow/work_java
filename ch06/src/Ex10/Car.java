package Ex10;

public class Car {

	int maxSpeed;	//최대속도
	int speed;		// 속도
	
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void speedUp() {
		this.speed += 5;
		System.out.println("최대속도: " + this.maxSpeed + " 현재속도: " + this.speed);
	}
	
	public void speedUp(int speed) {
		if(speed<0) {
			System.out.print("오류: 속도가 음수이므로 0으로 지정 ");
			System.out.println("최대속도: " + this.maxSpeed + " 현재속도: " + this.speed);
		} else {
			this.speed += speed;
			System.out.println("최대속도: " + this.maxSpeed + " 현재속도: " + this.speed);
		}
	}
	
	public int speedDown() {
		return this.speed -= 5;
	}
	
	public void speedDown (int speed) {
		if((maxSpeed-speed)<=0) {
			System.out.print("오류: 속도가 0보다 작아져 0으로 지정 ");
			System.out.println("최대속도: " + this.maxSpeed + " 현재속도: " + this.speed);
		} else {
			this.speed -= speed;
			System.out.println("최대속도: " + this.maxSpeed + " 현재속도: " + this.speed);
		}
	}
	
	
	
	
}
