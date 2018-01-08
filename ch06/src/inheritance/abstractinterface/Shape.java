package inheritance.abstractinterface;


//추상 클래스
public abstract class Shape {
	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void drawCenter() {
		System.out.println("(x, y) = " + x + ", " + y);
	}
	
	//추상메서드
	public abstract void draw(); //구현은 자식클래스가 함. 
	/*
	 * 메소드 몸체가 없는 이유
	 * - 상속받은 클래스에서 구현을 하라는 뜻
	 */
	
	public static void main(String [] args) {
	Shape s = new Circle(3.1, 4.5, 3.0); // 객체화오류
	s.draw();
	}

}
