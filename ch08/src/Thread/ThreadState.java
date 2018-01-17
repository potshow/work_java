package Thread;

public class ThreadState implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(40);	// 40 밀리초 멈춤
				
				// 현재 스레드의 상태를 출력
				System.out.print(Thread.currentThread().getState() + ", ");
				
				// 현재 스레드의 이름을 출력
				System.out.println(Thread.currentThread().getName() + ": " + i);

			} catch (InterruptedException e) {

				System.out.println("InterruptedException이 발생되어 스레드를 종료합니다.");
				return;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("스레드의 모든 상태: 6가지");
		
		// Thread.State enum에 정의된 값들을 하나씩 출력해본 것
		// enum이 뭐더라
		for (Thread.State c : Thread.State.values()) {
			System.out.print(c + " " );
		}
		System.out.println("\n");

		// 괄호안에 Runnable 을 상속받은 스레드 객체를 하나 만들어야댐.
		Thread th = new Thread(new ThreadState());
		System.out.println("기본 우선순위: " + th.getPriority());

		// 우선순위 지정
		th.setPriority(Thread.NORM_PRIORITY + 2); 	//NORM_PRIORITY의 기본값은 5. 1 부터 10까지 지정가능
		System.out.println("우선순위 변경: " + th.getPriority());
		
		// start() 시작하기 전이라 상태 NEW
		System.out.println("1 단계: " + th.getState());
		th.start();

		// start 하고난 뒤라 RUNNABLE
		System.out.println("2 단계: " + th.getState());
		try {Thread.sleep(130);		// main 스레드에서 실행 -> main 스레드가 130밀리초 멈춤
		} catch (InterruptedException e ) {
			e.printStackTrace();
		}
		th.interrupt();

		// 상태 TIMED_WAITING. interrupt가 
		// 위에서 밑으로 순차적으로 실행되는게 동기화된 코드
		// 순차적으로 실행안되는게 비동기화코드
		
		System.out.println("3 단계: " + th.getState()); // TIMED_WAITING은 run 메서드에서  sleep(40) 때문에 잠시 멈춘것.
		try { 
			Thread.sleep(1000);		// main 스레드에서 실행 -> main 스레드가 2초동안 멈춤
			System.out.println(Thread.currentThread().getName());
			
		} catch (InterruptedException e ) {
			
			e.printStackTrace();
		}
		
		// interrupt() 걸려서 중단됨. 상태 TERMINATED
		System.out.println("4 단계: " + th.getState());
		
	}

}
