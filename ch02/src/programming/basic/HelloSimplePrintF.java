package programming.basic;

public class HelloSimplePrintF {
	public static void main(String[] args) {
		byte age = 27;
		int weight = 70;
		double height = 175.8;
		
		/*
		 * %d : 10����
		 * %f : float ��
		 * %s : String ��
		 * %c : char ��
		 */
		
		System.out.printf("���� : %d, ������: %d, Ű: %f", age, weight, height);
		System.out.printf("%s: %c ��", "������", 'O');
		
	}
	
}
