package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BasicServerSocket {

	public static void main(String[] args) {
		System.out.println(">> 서버를 시작합니다.");
		try {
			// ServerSocket 객체를 만듬.
			// 7070 :  포트번호
			// 프로그램마다 포트번호를 가집니다. 
			// 해당 포트번호와 서버 IP를 통해서 프로그램으로 접속합니다.
			ServerSocket myServerSocker = new ServerSocket(7070);
			System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다.");
			
			// 클라이언트 접속때까지 대기
			// accept 메서드를 쓰면 클라이언트가 접속할때까지 멈춰있음.
			Socket mySocket = myServerSocker.accept();
			System.out.println(">> 클라이언트가 접속에 성공했습니다.");
			
			// 클라이언트 소켓에 스트림을 연결
			// 소켓 안에 InputStram OutputStream 만듬.
			BufferedReader in =
					new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
					
			PrintWriter out = 
					new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));
			
			// 클라이언트 소켓으로부터 받은 메시지를 화면에 출력
			// readLine() 메서드는 메시지를 입력받을때까지 멈춰있음.
			// 클라이언트에서 out으로 보낸걸 in으로 받음. 그래서 메세지가 출력되는 것.
			System.out.println(" [클라이언트] " + in.readLine());
			
			// 클라이언트 소켓에 메시지 전송
			String msg = "서버에 접속하신 것을 환영합니다!";
			out.println(msg);
			
			// 변기 물내리는 버튼을 flush라 부르는데
			// 남은 찌꺼기를 마저 보낼때 flush를 씀.
			out.flush();
			System.out.println(" [서버] " + msg);
			mySocket.close();
		} catch (IOException e) {
			System.out.println(e.toString());

		}
		
		
		
	}
	
}
