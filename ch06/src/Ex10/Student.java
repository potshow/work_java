package Ex10;

public class Student extends Person{

	String school;	//학교명
	String major;		//학과
	int studentId;		//학번
	double[] grade = new double[8];	//학점 입력할 배열
	
	public Student(String school, String major, int studentId) {
		
	}
	
	public Student(String name, int age, String address, 
					String school, String major, int studentId) {
		
		this.name = name;
		this.age = age;
		this.address = address;
		this.school = school;
		this.major = major;
		this.studentId = studentId;
	}
	
	public void introduce() {
		
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("주소 : " + this.address);
		System.out.println("학교 : " + this.school);
		System.out.println("학과 : " + this.major);
		System.out.println("학번 : " + this.studentId);
		System.out.println("-------------------------------");
	}
	
}