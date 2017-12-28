package exercise;

public class Ex1 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 0;
				
		for (i = 1; i < 101; i++) {
			//if ((i%2 != 0)&&(i%3 != 0)&&(i%5 != 0)&&(i%7 ==0))
			if (i%2 == 0) continue;
			if (i%3 == 0) continue;
			if (i%5 == 0) continue;
			if (i%7 == 0) continue;
			
			System.out.print(i + " ");
			j++;
			if(j == 10) {
				System.out.println();
				j = 0;
			}
		}
		
	}
	
}
