package Ex10;

import java.util.Scanner;

public class Student {
	
	
	public Student(String school, String major, int stuNum) {
		
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String school;			//학교명
		String major;			//학과
		int stuNum;				//학번
		double grade[] = new double[8]; //8개 학기 평점
		double gpa;
		
		System.out.println("8학기 학점을 순서대로 입력하세요");
		
		
			
		for (int i = 0; i < grade.length; i++) {	
				System.out.print((i+1) + "학기 평점 → ");
				grade[i] = input.nextDouble();
					}
			
		public double average() {
			
			int sum = 0;
			
			for (int i=0; i<grade.length; i++) { 
				sum += grade[i]; 
			}
			
			gpa = sum / 8;
			
			System.out.printf("8학기의 총 평균 평점은 %.4f입니다.", gpa);
			
		}
		
	}
}
