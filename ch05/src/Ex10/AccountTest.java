package Ex10;

public class AccountTest {

	public static void main(String[] args) {
		
		
		Account woman = new Account("김길동", 50000);
		
		System.out.println("현재 잔액: " + woman.withdraw(60000));
		

		
	}
	
}
