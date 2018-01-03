package obj.constructor;

public class Car2 {
	private int maxSpeed;		//최고속도
	private String brandName;	//브랜드이름
	private int speed;			//현재속도
	
	//브랜드 이름을 지정하는 생성자
	public Car2(String brandName) {
		this.brandName = brandName;
	}
	
	//브랜드 이름과 최고 속도를 지정하는 생성자
	public Car2(String brandName, int maxSpeed) {
		this(brandName); //자기자신의 생성자중에서 String을 받는 생성자를 호출
		this.maxSpeed = maxSpeed;
	}
	
	//속도 관련 메소드
	public int speedUp() {
		int tempSpeed = this.speed;
		tempSpeed +=30;
		
		// 최대 속도보다 더 높다면 이전속도 유지
		if(tempSpeed > this.maxSpeed) {
			return this.speed;
		}
		// 최대 속도보다 같거나 작다면 현재 속도를 갱신
		this.speed = tempSpeed;
		
		return  this.speed;
		
	}
	
	public int speedDown() {
		int tempSpeed = this.speed;
		tempSpeed -=20;
		if(tempSpeed < 0) {
			this.speed = 0;
			return this.speed;
		}
		
		this.speed = tempSpeed;
		
		return this.speed;
	}
	
	//maxSpeed의 setter와 getter
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		Car2 mycar = new Car2("포르쉐", 300);
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedDown();
		mycar.speedDown();
		mycar.speedDown();
		mycar.speedDown();
		
		System.out.print("차종: " + mycar.brandName);
		System.out.print(", 최고 속도: " + mycar.getMaxSpeed());
		System.out.print(", 현재 속도: " + mycar.speedDown());
	}
}
