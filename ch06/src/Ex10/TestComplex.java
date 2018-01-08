package Ex10;

public class TestComplex {

	public static void main(String[] args) {

		Complex x = new Complex(3.4, 4.5);
		Complex y = new Complex(5.2, -2.4);

		Complex result = new Complex();

		System.out.println(result.add(x, y));
		System.out.println(result.sub(x, y));
		
		System.out.println(x.toString());
		System.out.println(x.abs());
	}


}
