package inheritance.abstractinterface;

public class Abstract {
	public static void main(String[] args) {
		Shape r = new Rectangle(2, 3, 3.67, 7.89);  // 보통 상속이 있을경우 상위클래스 타입으로도 객체생성가능.
		Shape c = new Circle(3, 4, 4.82);
		r.draw();
		c.draw();
		
		Shape[] sa = { //상위타입의 배열만들면 해당 배열에 하위타입들을 자유롭게 쓸수있음.
				new Rectangle(2.5, 3.1, 1.67, 3.89),
				new Circle(4.2, 3.8, 1.56)
		};
		sa[0].draw();
		sa[1].draw();
		
	}
	
	
}
