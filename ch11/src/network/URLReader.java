
package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
	URL url;
	BufferedReader input;
	String inLine;
	
	//접속 사이트를 URL로 지정
	public URLReader(String site) {
		try {
			this.url = new URL(site);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//접속한 페이지 내용을 표준출력에 출력
	public void printPage() {
		try {
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			while ( (inLine = input.readLine()) != null ) {
				System.out.println(inLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//접속한 페이지의 정보를 간단히 표준출력에 출력
	public void printConnectionInfo() {
		try {
			URLConnection conn = url.openConnection();
			System.out.println(conn);
			System.out.println(conn.getURL() + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//String site = "http://www.naver.com/index.html";
		//String site = "http://www.google.com/index.html";
		String site = "https://www.koitt.com";
		URLReader homePage = new URLReader(site);
		homePage.printConnectionInfo();
		homePage.printPage();
		
		// 크롤링 (Crawling): 남의 사이트 정보를 가져와서 사용
		
	}
}
