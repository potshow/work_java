package Exception;

public class PropagateCheckedException {
	//메소드 선언에서 다시 예외 ClassNotFoundException의 발생 가능성을 전달
	public static void main(String[] args) throws ClassNotFoundException {
		//메소드 Class.forName()을 사용하려면 반드시 예외처리를 해야 함
		Class<?> forName = Class.forName("java.lang.Objec");
		System.out.println(forName);
		// Try Catch로 받을 곳이 없어서 오류발생. 보내긴 보냈는데 받을데가 없어서... 그대로 프로그램이 끝나버렸다.
		// 예외는 main 위쪽 가지말고 main 내부에서 해결하도록 해야함.
	}
}