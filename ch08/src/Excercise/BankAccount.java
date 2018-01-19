package Excercise;


	// 1. 체크예외 만들기
class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;	// 클래스에 Version을 만든다고 생각하면 됨.
	public InvalidWithdraw(String msg) {				// 현재 1L => Version 1.
		super(msg);
	}

}


public class BankAccount {
	int balance = 0; // 잔금
	int minimum = 0; //최저잔금
	int money = 0; // 요청금액
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public void deposit(int money) { 
		this.balance += money; 
		System.out.printf("정상 입금 처리: 입금금액=%d, 잔금=%d %n", money, this.balance);
	} 
	public void withdraw(int money) throws InvalidWithdraw{
		if (money < 0) {
			throw new InvalidWithdraw("0보다 작은 수를 출금할 순 없습니다.");
		} else if (this.balance < money) {
			throw new InvalidWithdraw("초과출금 요구 예외");
		} else {
			this.balance -= money;
			System.out.printf("정상 출금 처리: 출금금액=%d, 잔금=%d %n", money, this.balance);
		}
		
	}
}