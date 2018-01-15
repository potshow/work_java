package Exception;

// 모든 예외는 Exception을 상속받는다.
public class MyException extends Exception {
	
	public MyException(String msg) {
		super(msg);		//getMessage() 호출 시 출력되는 메시지
	}
	
}
