package Enumeration;

public class EnumTest {
	public enum pl {c, cpp, java, csharp};
	public int[] a = {10, 20, 30, 40};
	
	public static void main(String[] args) {
		pl clang = pl.c;			//정의한 열거 유형은 하나의 자료 유형으로 이용
		System.out.println(clang); 	//저장된 상수 문자열이 출력
		
		clang = pl.csharp;
		switch(clang) {
		case csharp:
			System.out.println(clang + ": C# 언어 ");			
		}
		
		for (pl p : pl.values())
			System.out.print(p + " ");
		System.out.println();
		
		// non-static 오류가 나면 객체를 생성해서 객체로 해당 값을 호출하면 댐. 한번 거쳐~
		EnumTest t = new EnumTest();
		for (int item : t.a) {
			System.out.println(item);
		}
	}
}
