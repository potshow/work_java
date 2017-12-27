package operator;

public class PriorityOP {
	
	public static void main(String[] args) {
		
		//괄호는 0순위. 괄호 친거부터 먼저 연산합니다.
		
		System.out.println(3 + 4 >> 2 > 5); // 1 > 5 라서 false
		System.out.println(((3 + 4) >> 2 ) > 5); // 1 > 5 라서 false
		System.out.println(3*4 & 4-3 << 5); // 3*4 & 64
		System.out.println(3*4 & (4-3 <<5));// 3*4 & 64
		System.out.println((3*4 & 4-3) < 5); // TrUE
		System.out.println((1&0) != 1 && 3<<2 > 5); // 0 != 1 && 12 > 5 -> 트루... 
		
	}

}
