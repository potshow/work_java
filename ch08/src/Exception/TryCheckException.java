package Exception;

public class TryCheckException {
	public static void main(String[] args) {
		//메소드 Class.forName()을 사용하려면 반드시 예외처리를 해야 함
		try {
			System.out.println(Class.forName("java.lang.Objec"));
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}
}