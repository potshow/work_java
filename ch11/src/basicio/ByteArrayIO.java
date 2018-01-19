package basicio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayIO {

	public static void main(String[] args) {
		int c;
		byte[] b = {'a', 'b', 'c', 'd'};	// 영어는 각각 1byte...

		// 배열 b를 읽는 ByteArrayInputStream 객체를 생성
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		
		// 배열 b를 소문자를 대문자로 출력하는 ByteArrayOutputStream 객체를 생성
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
		

		System.out.println("문자를 읽어 대문자로 출력");
		while ((c = bInput.read()) != -1) {		// -1은 마지막을 뜻함.
			System.out.print((char)c);
			
			// 객체 ByteArrayOutputStream에 대문자를 출력
			bOutput.write(Character.toUpperCase((char)c));
		}

		System.out.println();
		
		// 객체 ByteArrayOutputStream을 출력하면 출력된 자료가 그대로 출력
		System.out.println(bOutput);

		// 배열 Arrays 메소드 toString() 사용하여 각각 입력 값과 출력 값을 출력
		System.out.println(Arrays.toString(b));	// 배열에 있는 내용을 출력해줌. a, b, c, d는 문자니까
		System.out.println(Arrays.toString(bOutput.toByteArray()));
		
		// 97, 98, 99, 100은 -128 ~ 127 사이의 Byte 타입의 문자 이므로 1바이트먹음.
	}

}
