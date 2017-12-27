package control.loop;

public class While {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 10) {
			// i++ 이니까 i값이 먼저 나오고 증가됨. 그래서 1로 시작~~
			System.out.print(i++ + " ");
		} 
		
		System.out.println();
		
	}
	
}
