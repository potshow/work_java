package programming.basic;

public class HelloChars {
	
	public static void main(String[] args) {
	
		System.out.println('a'); //char��
		System.out.println('\\'); //��������ǥ �ȿ��� ���� �ϳ��� �����ԵǾ�������..Ư�������̱⿡ ����.
		System.out.println('\142'); //8���� 142�� ASCII�ڵ尪 (10���� 98�� ASCII �ڵ尪)
		System.out.println('\uAC00'); // �����ڵ尪 AC00: ��
		System.out.println('\uAC01'); // �����ڵ尪 AC01 : ��
		System.out.println('��');
		
		System.out.print("Hello\nWorld\tHi\b\rABC\r\n");
		System.out.println("\'");
	}
	
}
