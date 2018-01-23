package Excercise;

import java.io.File;
import java.util.Date;

public class Ex3 {

	public static void main(String[] args) {

		// Excercise 폴더를 객체화
		File parent = new File("src");
		
		// Excercise 폴더 내부의 파일 혹은 폴더 목록을 제공
		String[] list = parent.list();
		
		for (int i = 0; i < list.length; i++) {
			String name = list[i];
			
		// Excercise 폴더내의 파일 혹은 폴더를 객체화
			File file = new File("src/" + name);
			
		// File 클래스의 API(메서드)를 이용해서 파일인지 폴더인지 구분
			if (file.isDirectory()) {
				System.out.println("폴더: " + name);
			} else if (file.isFile()) {
				System.out.println("파일: " + name);
			} else {
				System.out.println("알 수 없는 파일이 있습니다.");
			}
		}
		
		/*
		
		String fname = "src/Excercise";

		File f = new File(fname);
		File[] sfile = f.listFiles();

		System.out.println("\t경로: " + f.getPath());
		System.out.println("\t폴더여부: " + f.isDirectory());

		
		for (int i = 0; i < sfile.length; i++) {
			
			File file = sfile[i];
			
			if(file.isFile()) {
				System.out.println("파일: " + file.getName());
			} else if(file.isDirectory()) {
				System.out.println("폴더: " + file.getName());
			}
		}

*/	}

}
