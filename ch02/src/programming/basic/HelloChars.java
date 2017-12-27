package programming.basic;

public class HelloChars {
	
	public static void main(String[] args) {
	
		System.out.println('a'); //char형
		System.out.println('\\'); //작은따옴표 안에는 문자 하나만 들어오게되어있지만..특수문자이기에 ㅇㅋ.
		System.out.println('\142'); //8진수 142의 ASCII코드값 (10진수 98의 ASCII 코드값)
		System.out.println('\uAC00'); // 유니코드값 AC00: 가
		System.out.println('\uAC01'); // 유니코드값 AC01 : 각
		System.out.println('강');
		
		System.out.print("Hello\nWorld\tHi\b\rABC\r\n");
		System.out.println("\'");
	}
	
}
