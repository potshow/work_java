package Excercise;

public class Ex04 {

	public static void main(String[] args) {
		PrimeNumber01 pn = new PrimeNumber01(20);
		pn.start();
	}

}

class PrimeNumber01 extends Thread {

	int num;
	int count;

	public PrimeNumber01 (int num) {
		this.num = num;
	}


	public void run() {
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