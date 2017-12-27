package control.loop;

public class DoWhile {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		do {// do: 조건없이 무조건 한번 시작하고 그 다음에 조건문을 검사해서 실행함.
			System.out.print(i++ + " ");
		}
			while (i<=10);
		
		
	}

}
