package operator;

public class BitShiftOP {

	public static void main(String[] args) {
		
		int x = -3, y = 3;
		// Integer.toBinaryString 2진수문자의 값으로 바꾼다는 뜻이양
		//  >> A <- 가장 왼쪽의 비트를 A값만큼 이동
		System.out.format("%d(%s) >> %d 결과 %d(%s) %n", x, Integer.toBinaryString(x),
							y, x>>3, Integer.toBinaryString(x>>3));
		
		System.out.format("%d(%s) << %d 결과 %d(%s) %n", x, Integer.toBinaryString(x),
				y, x<<3, Integer.toBinaryString(x<<3));
		
		System.out.format("%d(%s) >>> %d 결과 %d(%s) %n", x, Integer.toBinaryString(x),
				y, x>>>3, Integer.toBinaryString(x>>>3));
		
	}
	
	
}
