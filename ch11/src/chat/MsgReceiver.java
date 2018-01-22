
package chat;

import java.io.BufferedReader;
//import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MsgReceiver extends Thread {
	String nickname;
	Socket socket;
	BufferedReader in;
	//DataInputStream dis;
	
	public MsgReceiver(String nickname, Socket socket) {
		this.nickname = "[" + nickname + "] ";
		this.socket = socket;
		try {
			//소켓에 입력 스트림을 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		} catch (IOException e) {
			System.out.println(e.toString());			
		}
	}
	
	public void run() {
		while (in != null) {

			try {
				//소켓으로부터 받은 메시지를 화면에 출력
				String msg = in.readLine();
				System.out.println(msg);
				if (msg == null || msg.equals("quit")) {
					in.close();
					in = null;
					System.exit(0);
				}
	
			} catch (IOException e) {
				System.out.println(e.toString());			
			}
		}
		try {
			// 클라이언트 소켓 종료
			socket.close();		
		} catch(IOException e) {
			e.printStackTrace();			
		}
	}
}
