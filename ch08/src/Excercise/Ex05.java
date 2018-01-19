package Excercise;

public class Ex05 {


	public static void main(String[] args) {
		PrimeNumber02 pn = new PrimeNumber02(25, "소수를 만드는 스레드:");
		pn.start();

	}
}
class PrimeNumber02 extends Thread {

	int num;
	int count;
	String name;
	
	public PrimeNumber02 (int num, String name) {
		setName(name);
		this.num = num;
	}


	public void run() {
		
		System.out.println(getName());
		
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
