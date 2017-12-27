package programming.basic;

public class HelloOverloading {

	public static void main(String[] args) {
		
		/* 메소드 오버로딩 (method overloading) 호출조건 -> 메서드이름을 중복해서 쓸수있당
		 * 1. Argument(Parameter)의 개수가 일치하고
		 * 2. Argument의 타입이 일치할 경우
		 * 호출한 형식과 구현한 형식이 일치하면 불러와집니다.
		 */
		
		int sum = plus(10, 20); // << '20' 얘랑 
		System.out.println(sum);
		
		double sum01 = plus(10.25, 20.10);
		System.out.println(sum01);
		
	}
	
	static int plus(int a, int b) { // << 'int b' 얘랑 타입이 일치해야 호출가능
		int result = a + b;
		return result;
	}
	
	static double plus(double a, double b) {
		double result = a + b;
		return result;
		
	}
}
