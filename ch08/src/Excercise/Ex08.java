package Excercise;

import java.io.IOException;
import java.util.Date;

class Time implements Runnable{

	@Override
	public void run() {
		while (true) {
			System.out.println(new Date());
			
			
			
			try {
				Runtime.getRuntime().exec("cls");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}



}

public class Ex08 {

	public static void main(String[] args) {

		Thread th = new Thread(new Time());
		th.start();

	}

}