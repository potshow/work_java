package wait;

import java.util.Random;

class BankAccount {
	int balance = 0;	// 은행잔고

	public synchronized void withdraw(int money) {
		if (money < 0){
			System.out.println("인출 금액이 잘못됐습니다.");
			return;
		}
		int count = 0;
		while (this.balance < money) {
			System.out.printf("[%s]", Thread.currentThread().getName());
			// 지속적으로 잔금이 부족하여 메소드 종료
			if (++count > 3) {
				System.out.println("잔액이 부족하여 출금처리 못하고 종료합니다.");
				return;
			}

			System.out.printf("%16s", "wait(1000) 호출: ");
			System.out.printf("인출요구금액=%6d, balance=%6d %n", money, balance);
			try {
				// this.wait();
				wait(1000);		// 1초뒤에 자동으로 깨어나는 경우, notifyAll을 실행할 경우 강제로 깨어남.
			} catch (InterruptedException e) {
				System.out.println("e");
			}
		}
		System.out.printf("[%s] ", Thread.currentThread().getName());
		balance -= money;
		System.out.printf("%12s 정상인출금액=%6d, balance=%6d %n", "정상 출금처리: ", money, balance);
	}
	public synchronized void deposit(int money) {
		if (money < 0) {
			System.out.println("입금 금액이 잘못됐습니다.");
			return;
		}
		balance += money;
		System.out.printf("[%s] ", Thread.currentThread().getName());
		System.out.printf("%16s", "notify() 호출");
		System.out.printf("계좌입금금액=%6d, balance=%6d %n", money, balance);
		// notify();
		notifyAll();
	}

}


public class SyncTest implements Runnable{
	BankAccount act = new BankAccount();

	@Override
	public void run() {
		for( int i = 1; i < 3; i++) {
								// 0 ~ 5.???? 가 랜덤값으로 나옴.
			int amount = (int) (new Random().nextDouble() * 5 + 1) * 10000;
			act.deposit(amount);
			amount = (int) (new Random().nextDouble() * 5 + 1) * 10000;
			act.withdraw(amount);
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
