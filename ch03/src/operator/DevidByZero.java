package operator;

public class DevidByZero {
	
	public static void main(String[] args) {
		
		short data1 = 32766;
		short data2 = 1;
		//short data3 = data1 + data2; short 타입끼리 더해도 더하게되면 더한값이 int로 바뀜.
		// 자바 프로그램이 그렇게 되어있음.
		short data3 = (short)(data1 + data2);
		short data4 = 32766 + 1;
		System.out.println(data3 + "  " + data4);
		
		System.out.println(0.0 / 0.0); 	 // NaN = Not a Number 숫자가 아니다
		System.out.println(3 / 0.0);	 // 무한대 (3이 double형으로 변환) 실수에서는 0을 나누면 무한대
		System.out.println(3 / 0);		 // 정수를 0으로 나눌 수 없기 때문에 예외발생
		
		//exception 과 Err는 다릅니다.
		//NaN 값이 연산에 들어가면 모든 결과가 NaN으로 나옴.
		//Double.isNaN ,  Float.isNaN int 형은 없삼
		
		
		
	}

}
