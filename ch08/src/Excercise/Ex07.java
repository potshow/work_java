package Excercise;

import java.util.Calendar;

public class Ex07 {

	public static void main(String[] args) {

		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1, "안녕하세요!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();

		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2, "반갑습니다.");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();

	}

}


// 	Thread 를 상속받는것보다 훨씬더 가벼워짐.
//	Runnable은 run 외에 다른 메서드가 없기 때문에..! 
class PrintTime implements Runnable {

	Calendar now = Calendar.getInstance();

	int num;
	public PrintTime(int num) {
		/*super(name); << 이걸 못쓰는 이유 : Runnable에 run 메소드밖에 없어가지고 
		 * 따로 super로 불러올 값이 없음. 그래서 오류가 뜨는 것.*/
		this.num = num;
	}

	@Override
	public void run() {
		for (int i = 1; i <= num; i++) {
			try{
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("우선순위 : " + Thread.currentThread().getPriority() 
								+ " " + now.getTime() + " " + Thread.currentThread().getName());
		}
	}

}