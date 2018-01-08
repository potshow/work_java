package inheritance.typeCast;

public class InstanceOf {
	public static void main(String[] args) {
		
		Person she = new Person("이소라", 2056432);
		/*
		 *  왼쪽에 있는 객체가 오른쪽에 있는 타입의 객체냐고 물어보는것이
		 *  instanceof의 사용법입니다.
		 */
		if (she instanceof Staff) {
			Staff st1 = (Staff) she;
		}
		else {
			System.out.println("she는 Staff 객체가 아닙니다.");
		}
		
		Person p = new Staff("김상기", 11875435, "강서대학교", 3456);
		if (p instanceof Staff) {						//다운캐스팅할때 이 if문을 꼭 써서 확인하도록하세요.
			System.out.println("p는 Staff 객체입니다.");
			Staff st2  = (Staff) p;
		
		}
	}
}
