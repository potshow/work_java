package operator;

public class PriorityOP {
	
	public static void main(String[] args) {
		
		//��ȣ�� 0����. ��ȣ ģ�ź��� ���� �����մϴ�.
		
		System.out.println(3 + 4 >> 2 > 5); // 1 > 5 �� false
		System.out.println(((3 + 4) >> 2 ) > 5); // 1 > 5 �� false
		System.out.println(3*4 & 4-3 << 5); // 3*4 & 64
		System.out.println(3*4 & (4-3 <<5));// 3*4 & 64
		System.out.println((3*4 & 4-3) < 5); // TrUE
		System.out.println((1&0) != 1 && 3<<2 > 5); // 0 != 1 && 12 > 5 -> Ʈ��... 
		
	}

}
