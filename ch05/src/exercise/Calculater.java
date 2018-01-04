package exercise;

public class Calculater {
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		//Calculator.ddd << static 메모리에 접근할떄 쓰는 것임.
		Calculater c = new Calculater();

	}
}
