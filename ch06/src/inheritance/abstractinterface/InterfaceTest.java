package inheritance.abstractinterface;

public class InterfaceTest {
	public static void main(String[] args) {
		
		Device pdev[] = {new HPPrinter(), new USBMemory()};
		
		pdev[0].print();
		pdev[1].print();
		((Connectable) pdev[0]).connect(); //pdev[0].connect();
											// Connectable로 업캐스팅해서 호출
											//pdev는 Device클래슨데 Device에는 connect 메서드가 없기 때문에 Connectable로 업캐스팅!해서 호출.
		((Connectable) pdev[1]).connect(); //pdev[1].connect();
		
	}

}
