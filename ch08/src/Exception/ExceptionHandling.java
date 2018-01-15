package Exception;

public class ExceptionHandling {
	static int num[];
	
	public static void main(String[] args) {
		String[] str = {"안녕하세요!", "Hello!"};
		
		try {
		System.out.println(str[0]);
		System.out.println(num.length);		// 예외발생
		System.out.println(str[2]);			// 예외발생으로 이 문장은 실행안됨.
		} catch (Exception/*NullPointerException*/ e) {	// 이렇게 적어도 됨. 하지만 Exception이라 적으면 해당오류외에 다른 오류가 생겨도 대입됨.
														// Exception은 클래스. 널포인트도 클래스!
		  //System.out.println("예외 발생 : " + e.toString()); 16번 라인이랑 같은말.
			System.out.println("예외 발생 : " + e);
			System.out.println("예외 발생 메시지 : " + e.getMessage()); // 예외 발생 메시지를 따로 입력하지 않아서 null값이 뜸. 
			System.out.println("예외관련 모든 메시지 : ");
			e.printStackTrace();			// 예외발생시 모든 메시지값 보고싶을때 이거씀.
		} finally {
			System.out.println("try 실행");
		}
		
		System.out.println("프로그램이 정상적으로 종료됩니다.");
		
	}

}
