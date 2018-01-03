package obj.basic;

public class Const {
	public static void main(String[] args) {
		final int maxSize = 5; // final 사용시 선언과 초기화를 동시에 해야한다. 메소드나 클래스에도 붙일수있음
								// class에 final을 선언하면 다른 클래스가 상속받을수 없게된다.
								// 메소드에 final을 붙이면 오버라이드를 할 수 없는 메서드가됨.
								// 변수에 붙이면 바꿀 수 없는 변수가댐. 
		// maxSize = 8; //오류발생
		int data[] = new int[maxSize];
		System.out.println("배열 크기: " + data.length);
		System.out.println("배열 크기: " + maxSize);
	}
}
