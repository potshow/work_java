package array.basic;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		//동적 배열 heap영역으로 저장됨
		//베열 선언
		int[] month;
		double[] values;
		
		//배열 생성 (초기화)
		month = new int[4];
		values = new double[3];
		System.out.println(month.length);
		System.out.println(values.length);
		
		//값 입력
		month[0] = 10; 
		
		//배열 선언과 생성 동시에~ 
		char[] ch = new char[6];
		float[] data = new float[5];
		data = new float[7];
		System.out.println(ch.length);
		System.out.println(data.length);
	
		//정적 배열
		//상수 : 변하지 않고 항상 같은 값을 가지는 수
		//밑에 String 애들도 상수입니다. 상수는 메모리 class영역으로 갑니다.
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks.length);
		
	}
	
}
