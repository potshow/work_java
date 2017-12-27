package exercise;

import java.util.Scanner;

public class PersonInfo {

	public static void main(String[] args) {
		
		//input은 변수이름임. ㅎㅎ 키보드 입력받을 준비 끝!
		Scanner input = new Scanner(System.in);
		
		System.out.print("몸무게와 키를 입력하세요 : ");
		
		int weight = input.nextInt();
		double height = input.nextDouble();
		
		System.out.print("몸무게 : " + weight + "kg "+ " 키 : " + height + "cm");
		
		input.close();
		
		
	}
	
}
