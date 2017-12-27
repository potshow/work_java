package array.basic;

public class ArrayInit2 {

	public static void main(String[] args) {
		int score[];

		/*
		 * score[0] = 2;
		 * score[1] = 4;
		 * score[2] = 7;
		 */
		score = new int[] {2, 4, 7};

		System.out.printf("%d %d %d %n", score[0], score[1], score[2]);
		
		score = new int[] {23, 46, 78};
		System.out.printf("%d %d %d %n", score[0], score[1], score[2]);
		
		// 현업에 뛰시는 분들은 보통 배열선언 int[] 변수명 << 요렇게함
	}
	
}
