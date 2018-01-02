package obj.setter;

public class CreditCard {
	private long number;
	public String owner;
	private int point;
	private int balance;
	
	public void use(int amount) {
		balance += amount;
	}
	
	//카드 비용 지불 메소드
	public void payBill(int amount) {
		balance -= amount;
		this.addPoint(amount); 
	}

	//카드 포인트 추가 메소드
	private void addPoint(int amount){
		point += amount/1000;
	}

	/*
	 * setter & getter (캡슐화)
	 * setter, getter 만들기 단축키 : Alt + Shift + S 
	 */
	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		if (number < 1000_0000_0000_0000L) {
			System.err.println("잘못된 카드 번호입니다.");
			return;
		}
		this.number = number;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

	
}
