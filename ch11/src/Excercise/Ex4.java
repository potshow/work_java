package Excercise;

import java.io.File;
import java.util.Scanner;

public class Ex4 {
	
	public static final String PATH = "src/practice";
	
	public static void main(String args[]) {
		
		
		// "." << 자기자신. 지금 나으 위치.
		// "./" << 나 자신의 밑에다가 만듬.
		Scanner input = new Scanner(System.in);
		
		System.out.println("폴더 이름을 입력하세요. >>");
		args[0] = input.next();

		File file = new File(PATH + args[0]);
		
		/*
		 * 현재 폴더 기준
		 * 이클립스에서 실행: 프로젝트 최상위 폴더
		 * cmd에서 실행: 현재 실행한 폴더가 현재 폴더
		 */
		
		boolean isMake = file.mkdir();
		if (isMake) {
			System.out.println("폴더가 생성되었습니다.");
		} else {
			System.out.println("폴더 생성에 실패했습니다.");
		}
		
		input.close();

	}
}