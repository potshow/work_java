package operator;

public class BitShiftOP {

	public static void main(String[] args) {
		
		int x = -3, y = 3;
		// Integer.toBinaryString 2���������� ������ �ٲ۴ٴ� ���̾�
		//  >> A <- ���� ������ ��Ʈ�� A����ŭ �̵�
		System.out.format("%d(%s) >> %d ��� %d(%s) %n", x, Integer.toBinaryString(x),
							y, x>>3, Integer.toBinaryString(x>>3));
		
		System.out.format("%d(%s) << %d ��� %d(%s) %n", x, Integer.toBinaryString(x),
				y, x<<3, Integer.toBinaryString(x<<3));
		
		System.out.format("%d(%s) >>> %d ��� %d(%s) %n", x, Integer.toBinaryString(x),
				y, x>>>3, Integer.toBinaryString(x>>>3));
		
	}
	
	
}
