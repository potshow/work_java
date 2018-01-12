package Exercise;

public class Ex2 {
	
	public static void main(String[] args) {

		// Boxing
		// 이번 문제는 선언하고 초기화하면 끝입니다.
		
		Byte by = -127;
		Short s = 100;
		Integer i = -1000;
		Long l = 10000L;
		Float f = 1.11f;
		Double d = 33.3;
		Character c = 'A';
		Boolean bo = false;
		
		//UnBoxing
		System.out.printf("Byte : %d\n", by);
		System.out.printf("Short : %d\n", s);
		System.out.printf("Integer : %d\n", i);
		System.out.printf("Long : %d\n", l);
		System.out.printf("Float : %f\n", f);
		System.out.printf("Double : %f\n", d);
		System.out.printf("Character : %c\n", c);
		System.out.printf("Boolean : %b\n", bo);
	}
}
