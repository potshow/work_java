package Exception;

public class ExceptionType1 {
	static int num[];
			
			public static void main(String[] args) {
				System.out.println(num.length);		// 예외 발생
													// 선언은 했는데 초기화를 안했으니 NullPoint 오류가 뜹니다~~
			}

}
