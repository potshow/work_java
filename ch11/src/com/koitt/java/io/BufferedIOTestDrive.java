package com.koitt.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOTestDrive {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			fis = new FileInputStream("music.mp3");
			fos = new FileOutputStream("music-copy.mp3");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			// 현재 시간을 밀리초로 저장
			long startTime = System.currentTimeMillis();
			System.out.println("복사 시작 ====" );
			
			
			
			// Chain Stream을 씀으로써 1바이트씩이 아니라 100바이트씩 읽어들임.
			byte[] buffer = new byte[100];
			while (bis.read(buffer) != -1) {		// file에 있는 내용을 buffer에 집어넣음.
				bos.write(buffer);
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("복사 종료 ====");
			
			System.out.println("복사 하는데 걸린 시간 : " + (endTime - startTime) + "ms");
			
			// 보통 Chain Stream 먼저 닫은 다음
			// Connection Stream 을 닫습니다.
			bis.close();
			bos.close();
			fos.close();
			fis.close();

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
