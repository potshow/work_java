package Ex10;

public class Complex {

	double real;		// 실수부
	double imag;		// 허수부
	double result;		// 결과값

	public Complex() {
	}

	public Complex (double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	//이걸로 파라매터가 두개인 복소수를 문자로 표현
	public String toString(){
		return real + " + " + imag + "i";
	}
	
	public Complex add(Complex c1, Complex c2) {

		double a = c1.real + c2.real;
		double b = c1.imag + c2.imag;

		Complex res = new Complex(a,b);
		
		return res;	

	}

	public Complex sub(Complex c1, Complex c2) {

		double a = c1.real - c2.real;
		double b = c1.imag - c2.imag;

		return new Complex(a, b);	

	}

	public double abs() {
		
		return Math.sqrt((real*real)+(imag*imag));
			
	}

}
