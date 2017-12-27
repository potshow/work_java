package operator;

import java.util.Scanner;

public class RelationalOP {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수를 입력 >>");
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.format("%d > %d -> %b %n", x, y, x>y); // %b는 논리값을 출력하는 포맷
		System.out.format("%d >= %d -> %b %n", x, y, x>=y);
		System.out.format("%d < %d -> %b %n", x, y, x<y);
		System.out.format("%d <= %d -> %b %n", x, y, x<=y);
		System.out.format("%d == %d -> %b %n", x, y, x==y);
		System.out.format("%d != %d -> %b %n", x, y, x!=y);
		
		
	}
	
}


