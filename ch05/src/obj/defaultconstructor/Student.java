package obj.defaultconstructor;

public class Student {
	public String name;
	
	//기본 생성자 구현
	public Student() {
	}
	
	// 이름을 지정하는 생성자 구현
	public Student(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("학생이름 : " + this.name);
	}
	
	public static void main(String[] args) {
		Student lee = new Student("이승훈"); //이름지정생성자 호출
		lee.print();
		
		Student kim = new Student(); //기본생성자 호출
		kim.name = "김다빈";
		kim.print();
	}
}
