package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicUDPClient {
	DatagramSocket dsock;		// 서버랑 클라이언트를 연결하기 위해 
	DatagramPacket sPack, rPack; 
	InetAddress server; 
	int port = 8888;
	
	// UDP Packet 은 아이피랑 주소값을 적어줘야함.
	// 허가를 받지않고 파일을 보낼 수 있으니까
	// 여기저기서 몰려온 파일들이 어디서 온것인지 알수가 없으니
	// 적두도록합시다.
	
	public BasicUDPClient(String ip, int port) {
		try {
			// DatagramPacket에 들어갈 ip 주소가 InetAddress 형태여야 함
			server = InetAddress.getByName(ip);
			this.port = port;
			this.dsock = new DatagramSocket();
			System.out.println(">> 서버에 접속합니다."); 
			System.out.println(">> 서버에 전달할 메시지를 쓰고 Enter를 누르세요."); 
			System.out.println(">> 종료하려면 quit를 쓰고 Enter를 누르세요." + "\n"); 
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
	
	public void communicate() {
		try {
			// 키보드로부터 서버에게 전송할 문자열을 입력받기 위해 System.in을 BufferedReader 형태로 변환
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strOut = null;
			while ((strOut = br.readLine()) != null) {
				//DatagramPacket에 입력 줄을 저장하고 서버에 전송
				// strOut의 String 타입을 Byte로 바꾸기 위해 .getByte()를 씀.
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, server, port);
				dsock.send(sPack);				
				//서버에 quit를 전송하면 종료
				if (strOut.equals("quit")) break;
			
				//서버로부터 수신되는 DatagramPacket을 받아 표준출력 
				byte[] buffer = new byte[1024];	// 1 kilo byte
				rPack = new DatagramPacket(buffer, buffer.length);
				dsock.receive(rPack);		// 서버에서 메세지가 올때까지 대기
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);
				System.out.println("[서버" + server + ": " + port + "]" + strIn);
			}
			System.out.println("UDP 클라이언트를 종료합니다.");
		} catch(Exception e){
			System.out.println(e);
		}		
	}

	public static void main(String[] args) {
		BasicUDPClient client = new BasicUDPClient("127.0.0.1", 7777);
		client.communicate();
	}
}