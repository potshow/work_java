package basicio;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedrStream {
	
	public static void main(String[] args) {
		
		//Connection Stream (Source 또는 Destination에 집적 연결)
		FileOutputStream fos;	
		
		// Chain Stream	(Source 또는 Destination에 직접 연결이 불가능, Connection Stream에 연결)
		BufferedInputStream bis = null;		
		BufferedOutputStream bos = null;	
		String fname = "src/basicio/test.buff";
		
		try {
			fos = new FileOutputStream(fname);
			bos = new BufferedOutputStream(fos);
			byte[] data = {'A', 'B', 'C', 'D', 'E'};
			
			// wirte(배열, [index의 시작점], [length]); file 에 write 메서드를 이용해서 적음.
			bos.write(data, 0, 5);
			
			bos.close();
			fos.close();
			System.out.println(fname + " : 파일이 생성되었습니다.");
			
			// 읽을 파일 이름으로 FileInputStream 생성
			
			/*		밑에 쓴거랑 같은 코드임. 밑에거가 좀 더 직관적으로 바로 생성한거. 밑에거는 bis.close();만 해도 fis까지 다 닫힘.
			 * 		fos = new FileOutputStream(fname);
			 * 		bos = new BufferedOutputStream(fos);
			 *		↓↓
			 */		
			bis = new BufferedInputStream(new FileInputStream(fname));
			data = new byte[10];
			bis.read(data, 0, 10);
			bis.close();
			System.out.println(Arrays.toString(data));
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
