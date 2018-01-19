package basicio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReaderWriter {
	
	public static void main(String[] args) {
		
		int data;
		
		// 읽을 파일 이름 지정
		String inFname = "src/basicio/MyFileReaderWriter.java";
		String outFname = "src/basicio/MyFileReaderWriter.back";
		

		try {
			// 읽을 파일 이름으로 FileReader 생성
			FileReader fr = new FileReader(inFname);
			// 다시 출력할 파일 이름으로 FileWriter 생성
			FileWriter fw = new FileWriter(outFname);
			
			// 한 문자씩 읽어 콘솔과 파일에 출력
			while ((data = fr.read()) != -1 ) {
				System.out.print((char) data);
				fw.write(data);
			}
			
			fr.close();
			fw.close();
			System.out.println();
			System.out.println("위 파일이 생성되었습니다. : " + outFname);
			
		} catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다. : " + inFname);
			
		} catch (IOException e) {
			System.out.println(e);
			
		}
		
	}

}
