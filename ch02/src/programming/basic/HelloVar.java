package programming.basic;

public class HelloVar {

	public static void main(String[] args) {
	
	//변수 선언 
	int var01;
	
	//초기화 (변수에 값을 집어넣는것)
	var01 = 100;
	
	//변수 선언 + 초기화
	
	int var02 = 100;
	
	//여러 변수의 선언 
	//지역변수는 초기화를 해야 사용가능하다.
	int aa, bb, cc;
	//int x, y = 2; << x를 초기화해야 x값을 이용할 수 있다.
	int ff = 1;
	int fd = 4;
	
	//예제
	
	byte b = 0xA;
	short s = 32767;
	long distance = 1500_00_000000L;
	double d = 1500E8D; // 1500 * E^8
	int x, y = 10, z = 20;
	
	System.out.println(b);
	System.out.println(s);
	System.out.println(distance);
	System.out.println(d);
	System.out.println(y);
	System.out.println(z);
	
	}
	
}
