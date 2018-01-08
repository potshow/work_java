package inheritance.abstractinterface;

public class HPPrinter extends Device implements Connectable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("HP 프린터입니다");
	}

	@Override
	public void connect() {
		// static은 class명 쓰고 참조연산자(.) 쓰고 접근해야됨.
		System.out.println(Connectable.name + ", HP 프린터를 연결합니다.");
	}


	
}
