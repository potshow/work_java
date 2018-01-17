package Thread;

import java.util.Random;

class BankAccount {

	int balance = 0;		// 은행잔고

	// 인출(출금)
	public synchronized void withdraw(int money) {	// withdraw 메서드 전체를 임계영역으로 잡음 (synchronized를 이용해서)
		// 현재 출금하려는 금액보다 잔고가 많은지 검사
		if (money > 0 && this.balance >= money) {
			try {
				Thread.sleep(100);		// sleep을 작성하면 무조건 try-catch문을 쓰게 되어있슴.
			} catch (InterruptedException e ) {
				System.out.println(e);
			}
			this.balance -= money;
			System.out.printf("%s가 %d 인출하여 현재잔고 %d입니다. %n", 
					Thread.currentThread().getName(), money, this.balance);
		}
		else if (this.balance < money) {
			System.out.printf("%s가 잔고가 부족하여 인출할 수 없습니다. %n",Thread.currentThread().getName());
		}
	}

	//입금
	public void deposit(int money) {
		synchronized (this) {			// 중괄호 시작부터 중괄호 끝나는 부분까지 임계영역으로 설정
										// Synchronized 로 묶은 애들끼리 한덩어리가 됨.
			if (money > 0) {
				this.balance += money;
				System.out.printf("%s가 %d 입금하여 현재잔고 %d입니다. %n",
						Thread.currentThread().getName(), money, this.balance);

			}
		}
	}
}

public class SyncTest implements Runnable {

	BankAccount act = new BankAccount();

	@Override
	public void run() {
		/*while(true) {*/
			for (int i = 0; i < 3 ; i++) {
			int amount = new Random().nextInt(10000);	// 0 부터 10000 까지 랜덤한 값
			amount = amount % 10 * 1000;				// 10으로 나눈 나머지이기 때문에 1의 자리값에 1000을 곱한 값
			System.out.printf("[%s] 금액= %d %n", Thread.currentThread().getName(), amount);
			act.deposit(amount);		// 입금
			act.withdraw(amount * 2);	// 출금 (2배로 한 이유는 잔고를 바닥나게 하기 위해서)
			if (act.balance < 0) {
				System.out.printf("[%s] ", Thread.currentThread().getName());
				System.out.println("잔고: " + act.balance + " => 오류 종료" );
				return;
			}
		}
	}

	public static void main(String[] args) {
		Runnable r = new SyncTest();
		Thread th1 = new Thread(r);		// Thread 이름바꾸기
		Thread th2 = new Thread(r);

		th1.setName("철수");
		th2.setName("영희");

		th1.start();
		th2.start();


	}
}
