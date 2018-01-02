package obj.setter;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard parkCard = new CreditCard();
		CreditCard leeCard = new CreditCard();
		
		parkCard.owner = "박지성";
		parkCard.setNumber(2378_7643_7634_9825L);
		leeCard.owner = "이민정";
		leeCard.setNumber(6456_9876_4521_6838L);
		
		parkCard.use(100000);
		leeCard.use(15000);
		parkCard.payBill(50000);
		leeCard.payBill(10000);
		
		System.out.println(parkCard.owner + ": " + parkCard.getNumber());
		System.out.println("카드대금 잔액: " + parkCard.getBalance());
		System.out.println("카드포인트: " + parkCard.getPoint());
		System.out.println(leeCard.owner + ": " + leeCard.getNumber());
		System.out.println("카드대금 잔액: " + leeCard.getBalance());
		System.out.println("카드포인트: " + leeCard.getPoint());
		
		//맨 마지막에 출력되는것이 정상 (이클립스 버그입니다;)
		leeCard.setNumber(0);
		
	}
	
}
