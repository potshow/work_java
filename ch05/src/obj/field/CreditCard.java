package obj.field;

public class CreditCard {

	/*
	 * 접근제한자
	 * - private: 같은 클래스 내에서만 사용가능
	 * - (default): 같은 패키지 내에서만 사용가능
	 * - protected: (default) 범위 + 상속받은 클래스까지 사용가능
	 * - public: 어디서든 사용가능
	 */
	
	private long number; // 16자리카드번호
	public String owner;
	
	public static void main(String[] args) {
		
		CreditCard myCard = new CreditCard();
		
		/*
		 * 클래스의 필드는 자동으로 기본값으로 초기화된다.
		 * 단, 지역변수(local variable)는 수동으로 기본값을 초기화해야한다.
		 */
		
		System.out.println("기본값: " + myCard.number + ", " + myCard.owner);
		
		//String local; // 지역변수 선언만 하고 초기화를 하지 않은 경우
		//System.out.println(local); // < 위에 전역변수는 초기값이 있는데 지역변수는 초기화를 안해주면 초기값이 없습니다.
		
		myCard.number = 3456_7654_8765_7647L;
		myCard.owner = "유재석";
		System.out.print("카드번호: " + myCard.number);
		System.out.println(", 카드소유자: " + myCard.owner);
		
	}
	
}
