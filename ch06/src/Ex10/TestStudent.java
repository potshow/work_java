package Ex10;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		double avg;		// 배열 평균값 넣을 값
		double sum = 0;	// 배열 합 넣을 값
		
		double[] grade = new double[8];	
		Scanner input = new Scanner(System.in);
		
		Student kim = new Student("김다정", 20, "서울시 관악구", "동양서울대학교", "전산정보학과", 20132222);
		
		kim.introduce();
		
		System.out.println("8학기 학점을 순서대로 입력하세요.");
		for (int i = 0; i < grade.length; i++ ) {
			System.out.print((i+1) + "학기 학점  → ");
			grade[i] = input.nextDouble();
		}
		
		
		
		for (int i = 0; i < grade.length; i++) {
			sum += grade[i];
		}

		avg = sum / grade.length;
		
		System.out.println("-------------------------------");
		
		System.out.printf("8학기 총 평균 평점은 %.4f점입니다.", avg);
		
		input.close();
	}
	
}
