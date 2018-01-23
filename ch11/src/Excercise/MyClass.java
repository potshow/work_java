package Excercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MyClass {
	
	public static void main(String[] args) {
		
		
		try {
			// Connection Stream
			FileReader fr = new FileReader("src/Excercise/MyClass.java");
			FileWriter fw = new FileWriter("src/Excercise/Myclass.num");
			
			// 메모장에 글을 작성했을 경우에는
			// Reader나 Writer를 사용한다.
			
			// Chain Stream
			// 한줄씩 읽는 메서드는 Buffered 밖에 없음.
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String data;
			// readLine()을 쓰면 한줄씩 읽음.
			for (int i = 1; (data = br.readLine()) != null; i++){
				bw.write(i + " " + data + "\n");
			}
			
			br.close();
			bw.close();
			fr.close();
			fw.close();
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		/*
		
		int data;
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String inFname = "src/Excercise/MyClass.java";
		String outFname = "src/Excercise/MyClass.num";
		
		try {
			fis = new FileInputStream(inFname);
			fos = new FileOutputStream(outFname);
			
			int count = 1;
			
			while ((data = fis.read()) != -1 ) {

				fos.write(data);
			}
			
			System.out.println(outFname + " 파일 생성 완료.");
			
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		*/
		
	}

}
