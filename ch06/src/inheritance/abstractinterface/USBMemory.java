package inheritance.abstractinterface;

public class USBMemory extends Device implements Connectable{

	@Override
	public void connect() {
		System.out.println("삼성 USB 메모리입니다.");
	}
	
	@Override
	public void print() {
		System.out.println(Connectable.name + ", USB 메모리를 연결합니다.");
	}

}
