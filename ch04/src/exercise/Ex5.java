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
			int won1 = won + inter; 
			//int won1 = won + inter;
			System.out.printf("%d년 째 수령액은%d원 입니다.\n", year, won1);
			
			

			//System.out.printf("%d년의 이자는: %.2f \n", year, won * 0.045 * year);
		}
		
	}
	
}
