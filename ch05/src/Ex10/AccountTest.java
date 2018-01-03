package Ex10;

public class AccountTest {

	public static void main(String[] args) {
		
		
		Account woman = new Account("김길동", 50000);
		
		woman.setBalance(50000);
		woman.setOwner("김길동");
		
		woman.withdraw(60000);
		
		System.out.println("잔액 : " + getBalance());
		
	}
	
}
