package etc;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//2. 배열을 이용하여 아래와 같이 출력하시오. (배열을 사용)
		//단, 표준입력으로 한 행의 최대 별 개수를 입력받아 출력하시오.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 >>");
		int num = input.nextInt();
		
		//입력받은 값을 1차 배열에 넣는다.
		//	num = 5 입력
		// int[][] star = new int[5] == int star[4][];
		// 	star[4][]; -> 5칸
		int[][] star = new int[num][];
		
		//입력받은 값을 2차 배열에 넣는다.
		// (num < 5) -> num : 0~4 (5번)
		// num[4][4] 
		
		for (num = 0; num < star.length; num++) {
			star[num] = new int[num];
		}
		
		
		/* 현재 배열) ex.  입력 : 5 / star[5][5]
		*				star.length : 5
		*				i는 0~4(5번)만큼 돌고 j는 0~4(5번)만큼 돈다.				
		*				별 입력 및 출력
		*/				
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j <= star[i].length; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}
