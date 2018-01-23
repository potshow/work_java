package Excercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		
		// 파일을 객체화
		File originfile = new File(args[0]);	// 원본파일	
		File copyfile = new File(args[1]);		// 앞으로 새로 생성되는 파일
		
		// Connection Stream
		try {
			FileInputStream fis = new FileInputStream(originfile);
			FileOutputStream fos = new FileOutputStream(copyfile);
			
			int data = -1;
			
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
