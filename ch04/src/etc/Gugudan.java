package etc;

public class Gugudan {

	public static void main(String[] args) {
	
		//1. 구구단을 옆으로 2단에서 9단까지 출력하시오. (배열없이)

		
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%2d * %d = %2d ", i, j, i * j);
			}
			
			System.out.println();
		}
	
	
	}
}
