package Thread;

public class SumThread implements Runnable {

	private int end;
	
	public SumThread(int end) {
		this.end = end;
	}
	
	@Override
	public void run() {
		int sum = 0;
		for (int i = 1; i <= this.end; i++) {
			sum += i;
			System.out.print(" 현재 스레드 수: " + Thread.activeCount());
			System.out.print(", " + Thread.currentThread().getName()); 	// 컬렌트무엇
			System.out.printf(" : sum(1:%d) = %d %n", i, sum);
		}
		
	}
	
	// 		main도 스레드라고합니다. ?? ㅎㅎ 
	public static void main(String[] args) {
		// main 스레드가 main() 메소드를 호출하므로 이부분에도 스레드가 이미 실행
		System.out.print("main 스레드 ID: ");
		System.out.print(Thread.currentThread().getId());
		System.out.print(" , 현재 스레드 수: ");
		System.out.print(Thread.activeCount());
		System.out.print(" , 현재 스레드 이름: ");
		System.out.print(Thread.currentThread().getName());
		
		// 직접 구현한 스레드를 실행
		// ↓ 인터페이스 객체 r1을 만들었삼.
		Runnable r1 = new SumThread(5);
		Thread th1 = new Thread(r1);
		th1.start();
		
	}
}
