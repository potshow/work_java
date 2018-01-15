package Exception;

public class ExeptionType2 {
	public static void main(String[] args) {
		String str[] = {"안녕하세요!", "Hello!"};
		
		System.out.println(str[0]);
		System.out.println(str[2]);		/* 예외발생
		 								   java.lang.ArrayIndexOutOfBoundsException: 2
		 								   "2"번에 범위를 벗어난 예외가 발생했다는 오류가 뜬 것.*/
		System.out.println(str[1]);		 
	}
}
