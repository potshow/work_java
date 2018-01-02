package obj.basic;

//import obj.field.CreditCard; 임포트를 쓰면 다른패키지에있는 CreditCard로 연결됨.

public class CreditCard {
	private long number;
	public String owner;
	private int point;
	private int balance;
	
	//ddd.dddd << .을 참조연산자라부름
	//카드 사용 메소드
	public void use(int amount) {
		balance += amount;
		System.out.println("현재 카드 사용액: " + balance);
	}
	
	//카드 비용 지불 메소드
	public void payBill(int amount) {
		balance -= amount;
		System.out.println("지불액: " + amount + ", 지불 잔액: " + balance);
		this.addPoint(amount); //this.
							   //객체의 호출에 따라 해당 this값이 달라짐.
	}

	//카드 포인트 추가 메소드
	private void addPoint(int amount){
		point += amount/1000;
		System.out.println("보너스 포인트: " + point);
	}
	
	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "이수강";
		System.out.print("카드번호: " + myCard.number);
		System.out.println(", 카드소유자: " + myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);
		
		CreditCard yourCard = new CreditCard();
		yourCard.use(50000);
		
	}
	
}
