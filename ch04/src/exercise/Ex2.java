package exercise;


/*
 * Math.abs(값) : 절대값 리턴
 * 
 */
public class Ex2 {

	public static void main(String[] args) {
		//중첩된 for문을 이용하여 작성하시오

			//i값 = 행의 수. 
		for (int i = 0; i <= 7; i++) {
			for (int j = 7; j >= -7; j--) {
				if (Math.abs(j)>i) {
					System.out.print(' ');
				}
				else {
					System.out.printf("%d", Math.abs(j));
				}
			}
			System.out.println();
		}
		
	}
	
}
