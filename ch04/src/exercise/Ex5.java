package exercise;

public class Ex5 {

	public static void main(String[] args) {
		
		//원금
		int won = 1000000;
		
		//예치기간
		int year = 1;
		
		//이자
		int inter;
		
		for (year = 1; year < 11; year++) {
			
			inter = (int)(won*0.045*year);
			int result = won + inter; 

			System.out.printf("%d년 째 수령액은%d원 입니다.\n", year, result);
			
			
		}
		
	}
	
}
