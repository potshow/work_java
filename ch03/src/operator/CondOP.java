package operator;

public class CondOP {
	
		public static void main(String[] args) {
			
			int point = 31;
			String str = (point%2 == 0) ? "¦��" : "Ȧ��" ;
			System.out.printf("%d�� %s��. %n", point, str);
			
			double x = 3.45, y = 6.79;
			double max = (x > y) ? x : y ;
			System.out.printf("%f�� %f �߿��� %f�� �� ũ��.", x, y, max);
			
		}
	

}
