package com.koitt.java.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

class User {
	private Socket socket;				// 서버에서 accept 이후 받은 socket을 저장
	private ObjectInputStream ois;		// 클라이언트에서 전달한 메시지를 수신
	private ObjectOutputStream oos;		// 서버에서 여러 클라이언트로 메시지 송신

	public User (Socket s, ObjectInputStream ois, ObjectOutputStream oos) {
		this.socket = s;	
		this.ois = ois;
		this.oos = oos;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public ObjectInputStream getOis() {
		return ois;
	}

	public void setOis(ObjectInputStream ois) {
		this.ois = ois;
	}

	public ObjectOutputStream getOos() {
		return oos;
	}

	public void setOos(ObjectOutputStream oos) {
		this.oos = oos;
	}

	public void close() throws IOException {
		ois.close();
		oos.close();
		socket.close();
	}

}

public class ChatServerTestDrive {

	public static final int PORT = 7070;
	private List<User> userList;

	public ChatServerTestDrive() {
		this.userList = new ArrayList<User>();
	}

	class ChatServerThread extends Thread {

		private ObjectInputStream ois;

		public ChatServerThread(ObjectInputStream ois) {
			this.ois = ois;
		}

		// receiver 역할
		public void run() {
			while(true) {

				try {
					// readLine하고 하는 역할이 같음. 
					// 입력받은 ois 값을 String 클래스를 상속받는지 확인하기 위해 Object 안에 넣음.
					// 비교하려고. ㅎㅎ 
					Object obj = ois.readObject();
					if (obj instanceof String) {
						String msg = (String) obj;
						System.out.println();
						broadcast(msg);
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					
				} catch (IOException e) {
					// 사용자 한명이 퇴장하면 IOException이 발생
					removeClient(ois);
				}
			}
		}
	}

	// 접속한 각 클라이언트마다 특정 사용자의 메시지를 전달
	private void broadcast(String msg) {
		for (int i = 0; i < userList.size(); i++) {
			try {
				userList.get(i).getOos().writeObject(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// 사용자 퇴장처리
	public void removeClient(ObjectInputStream ois) {
		// 사용자 목록 전체를 검색해서 인자로 받은 ois와 같은 사용자가 있는지 검사
		for (User user: userList) {
			ObjectInputStream in = user.getOis();
			if (in.equals(ois)) {
				try {
					user.getOis().close();
					user.getOos().close();
					user.getSocket().close();
				} catch (IOException e){
					System.out.println(e.toString());
				}
				userList.remove(user);
				broadcast("사용자가 나갔습니다.......");
				System.out.println("사용자가 나갔습니다.......");
			}
		}
	}


	// 프로그램 처음 실행 시 호출
	public void go() {
		try {
			// 1. ServerSocket 생성
			ServerSocket serverSocket = new ServerSocket(PORT);

			while (true) {
				// 2. 접속한 클라이언트의 socket 객체를 받음
				System.out.println("클라이언트 접속 대기중 ...");
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트 접속 완료 ...");

				// 3. socket에서 Connection Stream 가져오기
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();

				// 4. Connection Stream을 Chain Stream에 연결
				ObjectInputStream ois = new ObjectInputStream(in);
				ObjectOutputStream oos = new ObjectOutputStream(out);

				// 5. User 객체 생성
				// (여기서 User에 없는 Connection Stream을 넣는것)
				User user = new User(socket, ois, oos);

				// 6. User 목록에 추가
				userList.add(user);
				System.out.println("사용자 추가완료 ...");

				// 7. 추가한 사용자의 메시지를 계속 듣기위해 Thread 생성
				new ChatServerThread(ois).start();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ChatServerTestDrive().go();

	}

}
