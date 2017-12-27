package exercise;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		
		System.out.println("문자 하나를 입력하세요. 섭씨(C) 화씨(F) >> ");
		String whichone = input.next();
		
		System.out.println("온도입력");
		double degree = input.nextDouble();
		//input.next().charAt(0); << 입력된 string 값에서
		//첫글자만 가져옴 개쩐다잉~~~~~`
		
		switch(whichone) {
		
		case "F" :
		case "f" :
			degree = (5.0/9.0)*(degree-32);
			System.out.printf("%.1f 섭씨입니다.", degree);
			break;
			
		case "C" :					
		case "c" :
			degree = (9.0/5.0)*degree + 32;
			System.out.printf("%.1f 화씨입니다.", degree);
			break;
			
		}
		
		input.close();
		
	}
	
}
