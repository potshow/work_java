package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class BasicClientSocket {
	public static void main(String[] args) {

		try {
			// 서버 주소와 포트번호를 지정하여 서버에 접속
			// 서버소켓과는 다른 일반 소켓 객체를 생성.
			// 127.0.0.1 아이피는 자기자신을 의미하는 IP 주소값.
			// 127.0.0.1 LocalHost 라고도 부름.
			Socket mySocket = new Socket("192.168.0.11", 7070);
			System.out.println(">> 서버 접속에 성공했습니다.");

			// 버퍼 소켓에 스트림을 연결
			BufferedReader in =
					new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			PrintWriter out =
					new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));

			// 서버 소켓에 메시지 전송
			String msg = "안녕하세요? 클라이언트입니다.";
			out.println(msg);
			out.flush();
			System.out.println(" [클라이언트] " + msg);

			// 서버 소켓으로부터 받은 메시지를 화면에 출력
			System.out.println(" [서버] " + in.readLine());

			// 서버 소켓 종료
			mySocket.close();

		}  catch (IOException e) {

			System.out.println(e.toString());
		}


	}

}
