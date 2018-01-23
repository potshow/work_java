package Excercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex2 {

	public static void main(String[] args) {


		FileInputStream fis = null;
		ObjectInputStream ois = null;
		int data;

		String inFname = "src/Excercise/cat.jpg";


		try {
			fis = new FileInputStream(inFname);

			while ((data = fis.read()) != -1) {
				char c = (char) data;
				System.out.print(c);
			}

			fis.close();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
