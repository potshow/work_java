package programming.basic;

public class HelloOverloading {

	public static void main(String[] args) {
		
		/* �޼ҵ� �����ε� (method overloading) ȣ������ -> �޼����̸��� �ߺ��ؼ� �����ִ�
		 * 1. Argument(Parameter)�� ������ ��ġ�ϰ�
		 * 2. Argument�� Ÿ���� ��ġ�� ���
		 * ȣ���� ���İ� ������ ������ ��ġ�ϸ� �ҷ������ϴ�.
		 */
		
		int sum = plus(10, 20); // << '20' ��� 
		System.out.println(sum);
		
		double sum01 = plus(10.25, 20.10);
		System.out.println(sum01);
		
	}
	
	static int plus(int a, int b) { // << 'int b' ��� Ÿ���� ��ġ�ؾ� ȣ�Ⱑ��
		int result = a + b;
		return result;
	}
	
	static double plus(double a, double b) {
		double result = a + b;
		return result;
		
	}
}
