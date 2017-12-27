package control.switchcondition;

import java.util.Scanner;

public class BasicSwitch {

	
	//import 단축키 : Ctrl + Shift + O???????????
	
	public static void main(String[] args) {
		
		double x, y;
		int op;
		
		Scanner input = new Scanner(System.in);
		System.out.print("두 실수 입력: ");
		
		x = input.nextDouble(); 
		y = input.nextDouble();
		System.out.print("번호선택 1(+), 2(-), 3(*), 4(/): ");
		op = input.nextInt();
		
		switch (op) {
			case 1: // 1 << 이 op의 값이 되는것. 변수명과는 다릅니다.
			System.out.printf("%.2f + %.2f = %.2f\n", x, y, x + y);
			break; // break가 없을 시에 위에서 밑으로 전부다 실행됩니다.
			
			case 2:
			System.out.printf("%.2f + %.2f = %.2f\n", x, y, x - y);
			break;
			
			case 3:
			System.out.printf("%.2f + %.2f = %.2f\n", x, y, x * y);
			break;
			
			case 4:
			System.out.printf("%.2f + %.2f = %.2f\n", x, y, x / y);
			break;
			
			default:
				System.err.printf("연산자 번호를 잘못 입력했습니다.");

		}
		
		input.close();
		
	}
	
}
