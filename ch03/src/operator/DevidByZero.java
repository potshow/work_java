package operator;

public class DevidByZero {
	
	public static void main(String[] args) {
		
		short data1 = 32766;
		short data2 = 1;
		//short data3 = data1 + data2; short Ÿ�Գ��� ���ص� ���ϰԵǸ� ���Ѱ��� int�� �ٲ�.
		// �ڹ� ���α׷��� �׷��� �Ǿ�����.
		short data3 = (short)(data1 + data2);
		short data4 = 32766 + 1;
		System.out.println(data3 + "  " + data4);
		
		System.out.println(0.0 / 0.0); 	 // NaN = Not a Number ���ڰ� �ƴϴ�
		System.out.println(3 / 0.0);	 // ���Ѵ� (3�� double������ ��ȯ) �Ǽ������� 0�� ������ ���Ѵ�
		System.out.println(3 / 0);		 // ������ 0���� ���� �� ���� ������ ���ܹ߻�
		
		//exception �� Err�� �ٸ��ϴ�.
		//NaN ���� ���꿡 ���� ��� ����� NaN���� ����.
		//Double.isNaN ,  Float.isNaN int ���� ����
		
		
		
	}

}
