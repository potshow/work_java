package com.koitt.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOTestDrive {

	public static void main(String[] args) {

		// 파일에 저장할 객체 생성
		Person p1 = new Person("홍길동", "서울", 30);
		Person p2 = new Person("홍길순", "부산", 38);
		Person p3 = new Person("홍길자", "전주", 33);

		// 1. Connection Stream, Chain Stream 생성
		// Try Catch 때문에 미리 빼놓은 것. 초기화한거임.
		ObjectOutputStream oos = null;	// Chain Stream	// 총 ( 실제 객체를 직렬화해서 옮기는 역할)
		FileOutputStream fos = null;	// Connection Stream			// 소음기

		try {
			// persno.dat 파일을 Destination으로 지정
			fos = new FileOutputStream("person.dat");	//  총 객체 만듬
			oos = new ObjectOutputStream(fos); 			// 소음기 객체 만듬 직렬화!!!! 객체를 꾸겨서 저장한다

			// 그림보면 객체 다음이 oos기 때문에 oos에 객체를 띄운다. 개울에 띄우는것처럼. stream.
			// Connection Stream을 이용해서 객체들을 개울가에 띄어 올림.
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);	 // writeObject가 fos 까지 보냄.

			// 더이상 떠내려 올 객체가 없다는 것을 알려주기 위해 null값을 띄움.
			oos.writeObject(null);

			/*
			 * writeObject 메소드가 ObjectOutputStream과 FileOutputStream을 거쳐
			 * person.dat까지 객체를 보낸다.
			 */

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			// oos랑 fos는 꼭 파일을 close() 해줘야 한다. finally로 넣음.
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("객체 정보를 파일에 저장완료 했습니다.");

		//   ************************************************************************************
		// 파일을 읽어서 객체 정보를 나타내보자


		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {

			fis = new FileInputStream("person.dat");
			ois = new ObjectInputStream(fis);

			Object item = null;
			while ((item = ois.readObject()) != null) {
				System.out.println(item);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
