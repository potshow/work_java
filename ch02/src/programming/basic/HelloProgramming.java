package programming.basic;

public class HelloProgramming {

	//�ν��Ͻ� ����(Instance Variable)���� (�ʵ�, ��� ����)
	static String fd = " -- �ʵ�";
	static String md = " -- �޼ҵ�";
	
	//�ڹ� ���α׷��� �����ϴ� ���� �޼ҵ� ���� (���α׷��� ������)
	public static void main(String[] args) {
	
		System.out.println("�ڹ� Ŭ������ ����");
		write(fd);
		write(md);
		
	}
	
	public static void write(String word) {
		System.out.println(word);
	}
	
}
