package etc;

public class Page142 {
	
	public static void main(String[] args) {
		
		/*int[] a = {3, 7, 8, 9};
		int[] b = {23, 72, 97};
		
		a = b;
		
		for (int value : a)
			System.out.print(value + " ");
		System.out.println();
		*/
		
		/*
		String name1[] = {"A", "B", "C", "D"};
		String name2[] = {"a", "b", "c", "d", "e"};
		
		System.arraycopy(name1, 0, name2, 0, name1.length);
		for (String name: name2)
			System.out.print(name + " ");
		for (String name: name1)
			System.out.print(name + " ");
		*/
		
		int n = 10;
		
		for (int i = 1; i <=10; i++) {
			int mult = 1;
			for (int j = 1; j<=i; j++) {
				System.out.printf("%d", j);
				String str = j == i ? " = " : " * ";
				System.out.printf("%s", str);
				mult *= j;
			}
			System.out.printf("%d\n", mult);
		}
		
	}

}
