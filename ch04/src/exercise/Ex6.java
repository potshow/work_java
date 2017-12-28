package exercise;

public class Ex6 {

	public static void main(String[] args) {
		
		//섭씨온도
		double sub = 1;
		//화씨온도
		double hwa = 1;
		
		for (sub = -60; sub < 141; sub+=20) {
			
			hwa = (9.0/5.0)*sub + 32;
			System.out.println( (int)hwa );
		}
		
	}
	
}
