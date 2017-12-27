/*package exercise;

public class Ex2 {

	public static void main(String[] args) {
		
		double A = 1.9;
		double B = 5.9;
		
		int C = (int)A + (int)B;
		
		System.out.println(C);
		System.out.println(C/2);
		
	}
	
}
*/

package exercise;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("두 실수를 입력하세요. >>");
		
		//명시적 형변환
		int A = (int)input.nextDouble();
		int B = (int)input.nextDouble();
		
		//묵시적형변환
		/*
		 * A와 B의 합은 int 형이고
		 * double sum 변수에 집어넣을 때 자동으로 double 형으로 변경된다.
		 * 
		 * sum은 int형 2를 나눴기 때문에 결과는 double형이고
		 * 마찬가지로 double avg 변수에 집어 넣었기 때문에 자동으로 double형으로 변경된다.
		 */
		double sum = A + B;
		double avg = sum/2;
		
		System.out.printf("합: %.2f, 평균: %.2f %n", sum, avg);
		
		input.close();
	}
	
}
