package Excercise;

public class Ex06 {

	public static void main(String[] args) {
		/*PrimeNumber03 pn = new PrimeNumber03(25, "소수를 만드는 스레드:");*/
		new Thread(new PrimeNumber03(25), "소수를 만드는 스레드").start();

	}

}

class PrimeNumber03 implements Runnable {

	int num;
	int count;
	String name;
	
	public PrimeNumber03 (int num) {
		this.num = num;
	}


	public void run() {
		
		System.out.println(Thread.currentThread().getName() + ":");
		
		for (int i = 1; i <= this.num; i++) {
			count = 0;
			for(int j = 2; j < i; j++) {
				if (i%j == 0) {
					count +=1;
				}
			}
			if (count == 0 && i != 1) {
				System.out.print(i + " ");
			}

		}
		

	}
}
