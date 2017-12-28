package exercise;

public class Ex8 {

	public static void main(String[] args) {
		
		
		//배열 행의 합계
		int hap = 1;
		//배열 평균
		int pyung = 1;
		
		
		int[][] ary = new int[4][];
		ary[0] = new int[4];
		ary[1] = new int[2];
		ary[2] = new int[3];
		ary[3] = new int[4];
		
		ary[0][0] = 78; ary[0][1] = 48; ary[0][2] = 78; ary[0][3] = 98;
		ary[1][0] = 99; ary[1][1] = 92;
		ary[2][0] = 29; ary[2][1] = 64; ary[2][2] = 83;
		ary[3][0] = 34; ary[3][1] = 78; ary[3][2] = 92; ary[3][3] = 56;
		
		for (int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary[i].length; j++) {

			System.out.print(ary[i][j]+ " ");
			}
			System.out.println();
		}

		
		for (int i = 0; i < ary.length; i++) {
			
			for (int j = 0; j < ary[i].length; j++) {
				hap += ary[i][j];
				pyung = hap / ary[i].length;
			}
			System.out.printf("%d 행의 합계는 %d 입니다. 평균은 %d입니다.\n", i, hap, pyung);
		}
		
	}
	
}
