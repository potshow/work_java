package inheritance.access;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("강민경", 123567864, 0.32);
		myAccount.deposit(50000);
		myAccount.withdraw(4000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name); 		//접근 ㅇㅋ
		System.out.println(myAccount.open);			//접근 ㅇㅋ
		System.out.println(myAccount.number); 		//접근 ㅇㅋ
		//System.out.println(myAccount.balance);	//접근 ㄴㄴ
	}
	
}
