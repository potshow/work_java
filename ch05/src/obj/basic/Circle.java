package obj.basic;

public class Circle {
	public double radius;
	public static double PI = 3.141592; // 쓰임새 많은 애들은 Static으로 써도댐. Static은 프로그램시작하자마자 메모리에 올라감(class영역에)
	
	//생성자 구현
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return radius * radius * PI;
		//return radius * radius * Circle.PI; // OK
		//return radius * radius * this.PI; //오류발생
	}
	
	//주요 정보 출력
	public void print() {
		System.out.printf("반지름이 %f인 원의 면적은 %f이다. %n", radius, getArea());
	}
	
	public static void main(String[] args) {
		System.out.println("원주율: " + Circle.PI); //걍 클래스명에 점찍고 쓰셩
	
		Circle c1 = new Circle(2.78);
		c1.print();
		Circle c2 = new Circle(5.25);
		c2.print();
		
		c1.PI = 3.14159265; //객체에다가 점찍고 하지 마셩
		System.out.println("원주율: " + c2.PI);
	}
}
