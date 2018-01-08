package Ex10;

public class TestCar {

	public static void main(String[] args) {
		
		Car mycar = new Car(300);
		
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp(-50);
		mycar.speedUp(50);
		mycar.speedDown(-30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedUp(100);
		mycar.speedUp(300);
	}
	
}
