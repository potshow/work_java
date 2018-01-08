package inheritance.overloading;

public class MyMath {
	
	double x, y;
	
	public MyMath(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double multiply() {
		return x * y;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
		// return x * y; //오류발생 static -> 프로그램 시작하자마자 메모리에 올라감. 클래스 내용은 올라가지 않았기때문에.. static을 빼면 오류안없어짐.
		// return this.x * this.y; //오류발생 
		
	}
	
	public static void main(String[] args) {
		
		MyMath math = new MyMath(3.4, 6.7);
		System.out.println(math.multiply()); // <- 이게 비정적 메소드
		System.out.println(MyMath.multiply(3.4, 6.7)); // <- 이게 정적메소드
	}

}
