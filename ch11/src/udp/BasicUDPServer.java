package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicUDPServer {
	DatagramSocket dsock;
	DatagramPacket sPack, rPack; 
	InetAddress client;
	// 서버 포트 설정 .. sport
	int sport = 7777, cport;
	
	public BasicUDPServer(int sport) {
		try {
			//DatagramPacket을 sport로 지정하여 생성
			this.sport = sport;
			System.out.println(">> 서버를 시작합니다."); 
			System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다." + "\n"); 
			this.dsock = new DatagramSocket(sport);
		
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
	
	public void communicate() {
		try {
			//키보드로부터 전송할 문자열을 입력받기 위해 BufferedReader 형태로 변환
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				// 한번에 정보를 1kili byte씩 보내겠다.
				byte[] buffer = new byte[1024];
				
				//클라이언트에서 전송되는 DatagramPacket을 받기 위해 rPack 생성한 후 대기 
				// Packet에 정보를 실음.
				rPack = new DatagramPacket(buffer, buffer.length);
				dsock.receive(rPack);
				// receive -> client가 메세지를 보내기 전까지 대기중.
				// rPack에 client가 보낸 메시지를 받는다. ( DatagramPacket으로 공간만듬 )
				
				// 전송받은 결과를 문자열로 변환
				// String(byte[] bytes, int offset, int length) 
				// 여기서 rPack안에 들어있는 Byte Data 불러올 수 있음
				// 0번째 부터 length만큼의 길이까지 데이터를 불러오겠다.
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);
				
				// 보낸 사람의 주소(IP) 확인
				client = rPack.getAddress(); 
				// 보낸 사람의 port 번호 확인
				cport = rPack.getPort();			
				//전송받은 결과를 출력하고 quit이면 종료
				System.out.println("[클라이언트" + client + ": " + cport + "]" + strIn);
				 
				if (strIn.trim().equals("quit")) {
					break;				
				}
				
				//표준입력으로 입력된 정보를 DatagramPacket으로 만들어 클라이언트에 전송
				String strOut = br.readLine();
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);
				dsock.send(sPack);
			}
			System.out.println("UDP 서버를 종료합니다.");
		} catch(Exception e){
			System.out.println(e);
		}		
	}

	public static void main(String[] args) {
		BasicUDPServer client = new BasicUDPServer(7777);
		client.communicate();
	}
}