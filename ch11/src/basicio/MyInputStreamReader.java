package basicio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {

	public static void main(String[] args) {

		String line;

		String fname = "src/basicio/MyInputStreamReader.java";

		try {
			// 읽을 파일 이름으로 FIleInputStream 생성			//Connection Stream
			FileInputStream fis = new FileInputStream(fname);

			// 파일 입력스트림을 다시 InputStreamReader로연결 	//Chain Stream
			InputStreamReader isr = new InputStreamReader(fis);

			// 현재 InputStreamReader의 인코딩 방식 출력
			System.out.println(isr.getEncoding());

			// InputStreamReader를 다시 BufferedReader로 연결	//Chain Stream
			// 최종적으론 BufferedRaeder가 파일을 읽음. 이 클래스는 한줄씩 바이트를 읽습니다.
			BufferedReader br = new BufferedReader(isr);
			System.out.println();

			// 한 줄씩 읽어 출력
			while ((line = br.readLine()) != null) { 	// 그냥 read는 -1로 끝나고 readLine은 null로 끝남.
				System.out.println(line);
			}
			br.close();
			isr.close();
			fis.close();
			
		} catch (FileNotFoundException e) {

			System.out.println("다음 파일이 없습니다. : " + fname);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println();


	}

}
