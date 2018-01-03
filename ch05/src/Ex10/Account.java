package Ex10;

public class Account {

	private String owner; //주인
	private long balance; //잔액
		
	
	public Account() {
	}
	/*public Account(String owner) {
	}
	
	public Account(long balance) {
	}*/
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	long amount; //돈의 양
	
	//입금
	public long deposit(long amount) {
		this.balance += amount;
		return this.balance;
	}
	
	//출금
	public long withdraw(long amount) {
		this.balance -= amount;
		
		if(this.balance<0) {
			return this.balance = 0;
		}
		
		return this.balance;
	}
	
	
	public static void main(String[] args) {
		
		Account man = new Account("김명희",100000);

		man.withdraw(99900);
		
		System.out.println("잔액 : " + man.getBalance());
	}
	
}
