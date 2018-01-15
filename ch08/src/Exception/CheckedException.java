package Exception;

public class CheckedException {
	public static void main(String[] args) {
		// 메소드 Class.forName()을 사용하려면 반드시 예외처리를 해야함.
		Class<?> forName = null;
		try {
			forName = Class.forName("java.lang.Object"); // 컴파일 오류 빨간줄 뜨면 예외처리해서 써라
		} catch (ClassNotFoundException e) {
			/*
			 * 자동 완성의 폐해
			 * -printStackTrace()는 예외에 대한 상세한 정보를 콘솔에 출력하기 때문에,
			 * -프로그램 배포시에는 꼭 막아야 한다.
			 * -(Debug 용으로만 제발!!! 사용 바랍니다.)
			 */
		
			e.printStackTrace();
		}	
														// forName은 ("") 안에 있는걸 검색하는 역할이다. 
														// Object는 해당하는 검색어고 중복되는 이름이 있을수 있어 컴파일을 돌려봐야한다.
														// 돌려보기 전까지는 타입을 알 수없기 때문에 제네릭(<>)에 ?가 들어감.
		System.out.println(forName);
	}
}
