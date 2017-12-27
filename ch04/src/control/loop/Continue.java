package control.loop;

public class Continue {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		for (i = 1; i <= 10; i++) {
			if (i%3 == 0) { 
				continue; // 3, 6, 9가 빠짐. continue에 걸리면 i++ 부분으로 감. 밑에 건너뛰고..
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
