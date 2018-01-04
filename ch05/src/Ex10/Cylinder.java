package Ex10;

public class Cylinder {
	Circle circle;
	double height;

	// 4번문제.
	public Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	}
	
	public double getVolume() {
		double area = circle.getArea(); // 원 넓이를 구하고
		double volume = area*this.height;
		return volume;
	}

	// 방법1 circle필드를 setter를 이용하여 초기화
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static void main(String[] args) {
		// 1. 원을 만든다. Circle 클래스를 이용하여 객체 생성하기
		Circle c1 = new Circle(2.8);

		// 2. 실린더를 만든다
									//생성자를 통해서 바로 초기화를 했다
									// c1 = circle(2.8)
		Cylinder cylinder = new Cylinder(new Circle(2.8), 5.6);
		
/*		cylinder.setCircle(c1); //cylinder객체의 circle필드를 초기화
		cylinder.setHeight(5.6); //cylinder객체의 height필드를 초기화
*/
		
		System.out.println(cylinder.circle + " / " + cylinder.height);


		// 3. 실린더의 부피를 구하는 메소드를 호출
		System.out.println("원통의 부피는 " + cylinder.getVolume() + "이다.");


	}
}